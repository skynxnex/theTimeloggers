package se.kyh.ad10.timeloggers.server.engine;

import java.rmi.Naming;
import java.rmi.RMISecurityManager;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;
import java.util.UUID;

import se.kyh.ad10.timeloggersPublic.server.SecurityLayer;

/**
 * Själva servern där allt snurrar
 */
public class ServerEngine extends UnicastRemoteObject implements SecurityLayer {

	private static final long serialVersionUID = 5285516671799841014L;
	
	public ServerEngine() throws RemoteException {
		super();
			// TODO Auto-generated constructor stubs
		}
   
   public static void main(String args[]) {
       System.out.println("RMI server started");

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
    	   ServerEngine obj = new ServerEngine();

           Naming.rebind("TimelogServer", obj);

           System.out.println("PeerServer bound in registry");
       } catch (Exception e) {
           System.err.println("RMI server exception:" + e);
           e.printStackTrace();
       }
   }

   private int session = 12345;

	
	public int getSession() throws RemoteException {
		return session;
	}


	public UUID createSession() throws RemoteException {

		return null;
	}
   
}
