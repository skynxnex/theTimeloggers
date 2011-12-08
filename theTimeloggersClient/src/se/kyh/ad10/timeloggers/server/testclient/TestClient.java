package se.kyh.ad10.timeloggers.server.testclient;

import java.io.IOException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RMISecurityManager;
import java.util.Date;
import java.util.UUID;

import se.kyh.ad10.timeloggers.server.dao.intf.TimeLogDAO;
import se.kyh.ad10.timeloggers.server.entities.Project;
import se.kyh.ad10.timeloggers.server.entities.Timelog;
import se.kyh.ad10.timeloggersPublic.server.PublicInterface;
import se.kyh.ad10.timeloggersPublic.server.SecurityLayer;



public class TestClient { 	

	private static SecurityLayer serverObj = null; 



	public static void main(String args[]) throws IOException, NotBoundException  {
		// Get instance of SecurityLayer implementation
		serverObj = (SecurityLayer)Naming.lookup("//31.192.226.120:1099/"+SecurityLayer.name); 

		try {
			// Create and install a security manager
			if (System.getSecurityManager() == null) {
				System.setSecurityManager(new RMISecurityManager());
			}

			// To get access to PublicInterface we need to use/get an UUID
			UUID uuid = serverObj.createSession();
			PublicInterface pii = serverObj.getPublicInterface(uuid);
			TimeLogDAO tdao = pii.getTimelogDAO();
			Date date = new Date();

			Project proj = new Project();
			proj.setName("Hubbabubba");
			proj.setBudget(10);
			proj.setEstimatedTime(2000);
			pii.getProjectDAO().saveProject(proj);
			
			
			// Filling up the object
			Timelog timelog = new Timelog();
			timelog.setComment("Detta Šr en kommentar");
			timelog.setDuration(60);
			timelog.setTitle("Timelog 1");
			timelog.setStart(date);

//			// Save the object
			tdao.saveTimeLog(timelog);
			

			// Get all projects and printing them
//			List<Timelog> timelogs = pii.getTimelogDAO().getAllTimelogsForProject(1);
//			System.out.println("Printing list");
//			if(timelogs.isEmpty()) {
//				System.out.println("List is empty");
//			}
//			for ( Timelog tl : (List<Timelog>) timelogs ) {
//				System.out.println( "Timelog (" + tl.getTitle() + ") : " + tl.getDuration() + ":" + tl.getProjectId() );
//			}

		} catch (IOException e) {
			e.printStackTrace();
		}


	}
}
