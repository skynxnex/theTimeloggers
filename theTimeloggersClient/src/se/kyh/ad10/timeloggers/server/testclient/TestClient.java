package se.kyh.ad10.timeloggers.server.testclient;

import java.io.IOException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.util.UUID;

import se.kyh.ad10.timeloggers.server.dao.intf.CustomerDAO;
import se.kyh.ad10.timeloggersPublic.server.PublicInterface;
import se.kyh.ad10.timeloggersPublic.server.SecurityLayer;


	 
	public class TestClient { 	
		
		private static SecurityLayer serverObj = null; 
		
			    
	    
	    public static void main(String args[]) throws IOException, NotBoundException  {
	    	serverObj = (SecurityLayer)Naming.lookup("//localhost/TimelogServer");
//	    	TestClient cli;
//	    	cli = new TestClient(); 
	    	
//	    	try {
//	        // Create and install a security manager
//	        if (System.getSecurityManager() == null) {
//	            System.setSecurityManager(new RMISecurityManager());
//	        }
	    	
	    	UUID uuid = serverObj.createSession();
			PublicInterface pii = serverObj.getPublicInterface(uuid);
			CustomerDAO obj = pii.getCustomerDAO();
			System.out.println(obj.getCustomer(1).getName());
				
//				
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
	 
	    	
	    }

//		private int getSession() throws RemoteException {
//			return serverObj.getSession();
//		}
}
