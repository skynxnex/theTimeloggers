package se.kyh.ad10.timeloggers.server.engine;

import java.rmi.Naming;
import java.rmi.RMISecurityManager;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

import se.kyh.ad10.timeloggers.server.db.DB;
import se.kyh.ad10.timeloggersPublic.server.SecurityLayer;

/**
 * Sj�lva servern d�r allt snurrar
 */


public class ServerEngine {
	
	public ServerEngine() throws RemoteException {
		super();
		}
   
   public static void main(String args[]) {
       System.out.println("RMI server starting");

       // Create and install a security manager
       if (System.getSecurityManager() == null) {
           System.setSecurityManager(new RMISecurityManager());
           System.out.println("Security manager installed.");
       } else {
           System.out.println("Security manager already exists.");
       }

       try { //special exception handler for registry creation
           LocateRegistry.createRegistry(1099); 
           System.out.println("java RMI registry created.");
       } catch (RemoteException e) {
           //do nothing, error means registry already exists
           System.out.println("java RMI registry already exists.");
       }

       try {
    	   SecurityLayer obj = new SecurityLayerImpl();
    	   UnicastRemoteObject.exportObject(obj, 443);
           Naming.rebind(SecurityLayer.name, obj);

           System.out.println("PeerServer bound in registry");
       } catch (Exception e) {
           System.err.println("RMI server exception:" + e);
           e.printStackTrace();
       }
       if(DB.get().getSession() != null) {
    	   System.out.println("DB session started");    	   
       }
       System.out.println("Server started OK");
   }
   
}
