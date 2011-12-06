package se.kyh.ad10.timeloggers.server.engine;

import java.rmi.Naming;
import java.rmi.RMISecurityManager;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

import se.kyh.ad10.timeloggersPublic.server.SecurityLayer;

/**
 * Själva servern där allt snurrar
 */


public class ServerEngine {

	private static final long serialVersionUID = 5285516671799841014L;
	
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

           Naming.rebind("TimelogServer", obj);

           System.out.println("PeerServer bound in registry");
       } catch (Exception e) {
           System.err.println("RMI server exception:" + e);
           e.printStackTrace();
       }
       System.out.println("Server started OK");
   }
   
}
