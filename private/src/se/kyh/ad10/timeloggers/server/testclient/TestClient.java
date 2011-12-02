package se.kyh.ad10.timeloggers.server.testclient;

import java.io.IOException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RMISecurityManager;
import java.rmi.RemoteException;

import se.kyh.ad10.timeloggersPublic.server.SecurityLayer;


	 
	public class TestClient { 	
		
		private static SecurityLayer serverObj = null; 
		
		public TestClient() throws IOException, NotBoundException {
	        serverObj = (SecurityLayer)Naming.lookup("//localhost/TimelogServer");
		}	    
	    
	    public static void main(String args[]) throws IOException, NotBoundException  {
	    	TestClient cli;
	    	cli = new TestClient(); 
	    	
	        // Create and install a security manager
	        if (System.getSecurityManager() == null) {
	            System.setSecurityManager(new RMISecurityManager());
	        }
	
			try {
				System.out.println( cli.getSession());
				
			} catch (IOException e) {
				e.printStackTrace();
			}
	 
	        
	    }

		private int getSession() throws RemoteException {
			return serverObj.getSession();
		}
}
