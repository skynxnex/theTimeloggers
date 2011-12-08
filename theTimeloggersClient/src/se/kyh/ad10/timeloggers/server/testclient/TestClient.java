package se.kyh.ad10.timeloggers.server.testclient;

import java.io.IOException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RMISecurityManager;
import java.util.UUID;

import se.kyh.ad10.timeloggers.server.entities.Project;
import se.kyh.ad10.timeloggersPublic.server.PublicInterface;
import se.kyh.ad10.timeloggersPublic.server.SecurityLayer;


	 
	public class TestClient { 	
		
		private static SecurityLayer serverObj = null; 
		
			    
	    
	    public static void main(String args[]) throws IOException, NotBoundException  {
	    	serverObj = (SecurityLayer)Naming.lookup("//localhost/"+SecurityLayer.name); 
	    	
	    	try {
	        // Create and install a security manager
	        if (System.getSecurityManager() == null) {
	            System.setSecurityManager(new RMISecurityManager());
	        }
	    	
	    	UUID uuid = serverObj.createSession();
			PublicInterface pii = serverObj.getPublicInterface(uuid);
			Project obj = pii.getProjectDAO().getProject(1);
			
//			Project project = new Project();
//			project.setName("TestProject1");
//			project.setEstimatedTime(60);
//			project.setBudget(100000);
//			
//			obj.saveProject(project);
			
			System.out.println(obj.getName());
			System.out.println(obj.getBudget());
			System.out.println(obj.getEstimatedTime());
				
				
			} catch (IOException e) {
				e.printStackTrace();
			}
	 
	    	
	    }
}
