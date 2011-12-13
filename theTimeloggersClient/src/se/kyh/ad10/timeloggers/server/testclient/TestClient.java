package se.kyh.ad10.timeloggers.server.testclient;

import java.io.IOException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RMISecurityManager;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import se.kyh.ad10.timeloggers.server.dao.intf.AttendedTimeDAO;
import se.kyh.ad10.timeloggers.server.dao.intf.TimeLogDAO;
import se.kyh.ad10.timeloggers.server.dao.intf.UserDAO;
import se.kyh.ad10.timeloggers.server.entities.AttendedTime;
import se.kyh.ad10.timeloggers.server.entities.User;
import se.kyh.ad10.timeloggersPublic.server.PublicInterface;
import se.kyh.ad10.timeloggersPublic.server.SecurityLayer;



public class TestClient { 	

	private static SecurityLayer serverObj = null; 



	public static void main(String args[]) throws IOException, NotBoundException  {
		// Get instance of SecurityLayer implementation
		serverObj = (SecurityLayer)Naming.lookup("//localhost:1099/"+SecurityLayer.name);
//		serverObj = (SecurityLayer)Naming.lookup("//31.192.226.120:1099/"+SecurityLayer.name); 

		try {
			// Create and install a security manager
			if (System.getSecurityManager() == null) {
				System.setSecurityManager(new RMISecurityManager());
			}

			// To get access to PublicInterface we need to use/get an UUID
			UUID uuid = serverObj.createSession();
			System.out.println(uuid);
			PublicInterface pii = serverObj.getPublicInterface(uuid);
			
			UserDAO udao = pii.getUserDAO();
			User user = udao.getUserById(1);
			List<AttendedTime> atts = user.getAttendedTimes();
			System.out.println(atts);
			
//			TimeLogDAO tdao = pii.getTimelogDAO();
//			AttendedTimeDAO attdao = pii.getAttendedTimeDAO();
//			Date date = new Date();
			
//			AttendedTime att = attdao.getAttendedTime(1);
//			User user = att.getUser();
//			System.out.println(user.getEmail());
			
			
//			List<User> list = udao.getAllUsers();
//			System.out.println(list.size());
//			System.out.println(list.get(0));

//			Project proj = new Project();
//			proj.setName("Hubbabubba");
//			proj.setBudget(10);
//			proj.setEstimatedTime(2000);
//			pii.getProjectDAO().saveProject(proj);
			

//			Timelog timelog = new Timelog();
//			timelog.setComment("Detta Šr en kommentar till");
//			timelog.setDuration(60);
//			timelog.setTitle("Timelog 1");
//			timelog.setStart(date);
//

//			tdao.saveTimeLog(timelog);
//			

			// Get all projects and printing them
//			List<Timelog> timelogs = pii.getTimelogDAO().getAllTimelogsForProject(1);
//			System.out.println("Printing list");
//			if(timelogs.isEmpty()) {
//				System.out.println("List is empty");
//			}
//			for ( Timelog tl : (List<Timelog>) timelogs ) {
//				System.out.println( "Timelog (" + tl.getTitle() + ") : " + tl.getDuration() + ":" + tl.getProject().getId() );
//			}

		} catch (IOException e) {
			e.printStackTrace();
		}


	}
}
