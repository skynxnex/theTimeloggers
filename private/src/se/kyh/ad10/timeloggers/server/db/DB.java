package se.kyh.ad10.timeloggers.server.db;

import java.io.File;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

import se.kyh.ad10.timeloggers.server.entities.AttendedTime;
import se.kyh.ad10.timeloggers.server.entities.Customer;
import se.kyh.ad10.timeloggers.server.entities.FeeInProject;
import se.kyh.ad10.timeloggers.server.entities.InfoType;
import se.kyh.ad10.timeloggers.server.entities.Project;
import se.kyh.ad10.timeloggers.server.entities.ProjectAdminLevel;
import se.kyh.ad10.timeloggers.server.entities.Role;
import se.kyh.ad10.timeloggers.server.entities.SystemAdminLevel;
import se.kyh.ad10.timeloggers.server.entities.Timelog;
import se.kyh.ad10.timeloggers.server.entities.User;
import se.kyh.ad10.timeloggers.server.entities.UserInProject;
import se.kyh.ad10.timeloggers.server.entities.UserInfo;

public class DB {
	private static SessionFactory sessionFactory = null;
	
	public DB(){
		File configFile = new File("hibernate.cfg.xml");
    	if( null == sessionFactory){
	    	
			Configuration configuration = new Configuration()
	    															.addAnnotatedClass(User.class)
	    															.addAnnotatedClass(UserInfo.class)
	    															.addAnnotatedClass(AttendedTime.class)
	    															.addAnnotatedClass(Customer.class)
	    															.addAnnotatedClass(FeeInProject.class)
	    															.addAnnotatedClass(InfoType.class)
	    															.addAnnotatedClass(Project.class)
	    															.addAnnotatedClass(ProjectAdminLevel.class)
	    															.addAnnotatedClass(Role.class)
	    															.addAnnotatedClass(SystemAdminLevel.class)
	    															.addAnnotatedClass(Timelog.class)
	    															.addAnnotatedClass(UserInProject.class)
	    															.configure(configFile);
	    	
	    	sessionFactory = configuration.buildSessionFactory();
    	}
	}
	public static SessionFactory getSessionFactory(){
		return sessionFactory;
	}
	
	public static Session getSession(){
		return sessionFactory.openSession();
	}
}

