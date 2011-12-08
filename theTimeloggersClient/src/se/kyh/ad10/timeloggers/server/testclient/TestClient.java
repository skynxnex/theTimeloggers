package se.kyh.ad10.timeloggers.server.testclient;

import java.io.IOException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RMISecurityManager;
import java.util.List;
import java.util.UUID;

import se.kyh.ad10.timeloggers.server.entities.Project;
import se.kyh.ad10.timeloggersPublic.server.PublicInterface;
import se.kyh.ad10.timeloggersPublic.server.SecurityLayer;



public class TestClient { 	

	private static SecurityLayer serverObj = null; 



	public static void main(String args[]) throws IOException, NotBoundException  {
		// Get instance of SecurityLayer implementation
		serverObj = (SecurityLayer)Naming.lookup("//localhost/"+SecurityLayer.name); 

		try {
			// Create and install a security manager
			if (System.getSecurityManager() == null) {
				System.setSecurityManager(new RMISecurityManager());
			}

			// To get access to PublicInterface we need to use/get an UUID
			UUID uuid = serverObj.createSession();
			PublicInterface pii = serverObj.getPublicInterface(uuid);

			// Filling up the Project object
			Project project = new Project();
			project.setName("TestProject1");
			project.setEstimatedTime(60);
			project.setBudget(100000);

			// Save
			pii.getProjectDAO().saveProject(project);

			// Get all projects and printing them
			List<Project> projects = pii.getProjectDAO().getAllProjects();
			System.out.println("Printing list");
			if(projects.isEmpty()) {
				System.out.println("List is empty");
			}
			for ( Project proj : (List<Project>) projects ) {
				System.out.println( "Project (" + proj.getName() + ") : " + proj.getBudget() );
			}

		} catch (IOException e) {
			e.printStackTrace();
		}


	}
}
