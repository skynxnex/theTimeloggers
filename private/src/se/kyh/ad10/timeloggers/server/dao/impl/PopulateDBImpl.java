package se.kyh.ad10.timeloggers.server.dao.impl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Date;
import java.util.UUID;

import org.hibernate.Session;

import se.kyh.ad10.timeloggers.server.dao.intf.PopulateDB;
import se.kyh.ad10.timeloggers.server.engine.SecurityLayerImpl;
import se.kyh.ad10.timeloggers.server.entities.AttendedTime;
import se.kyh.ad10.timeloggers.server.entities.Customer;
import se.kyh.ad10.timeloggers.server.entities.CustomerInfo;
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

@SuppressWarnings("serial")
public class PopulateDBImpl extends UnicastRemoteObject implements PopulateDB {
	
	private UUID uuid;

	public PopulateDBImpl(UUID uuid) throws RemoteException {
		super();
		this.setUuid(uuid);
		}

	public void populateDB() {
		Session dbsession = SecurityLayerImpl.getPublicInterfaceImpl(uuid).getSession();
		
		// SystemAdminLevel
		SystemAdminLevel sal = new SystemAdminLevel();
		sal.setLevel(100);
		sal.setName("Admin");
		
		// User
		User usr = new User();
		usr.setEmail("blaha@blaha.se");
		usr.setFirstName("Test");
		usr.setLastName("Person");
		usr.setPassword("test");
		usr.setPlainPassword("test");
		usr.setSystemAdminLevel(sal);
		
		//Infotype
		InfoType inft = new InfoType();
		inft.setName("phone");
		
		//Userinfo
		UserInfo uinf = new UserInfo();
		uinf.setInfoType(inft);
		uinf.setUser(usr);
		uinf.setValue("123456789");
		
		dbsession.beginTransaction();
		dbsession.saveOrUpdate(usr);
		dbsession.getTransaction().commit();
		
		// Customer
		Customer cst = new Customer();
		cst.setActive(true);
		cst.setName("TestCustomer");
		
		// CustomerInfo
		CustomerInfo cinf = new CustomerInfo();
		cinf.setInfoType(inft);
		cinf.setValue("987654321");
		cinf.setCustomer(cst);

		// Project
		Project prj = new Project();
		prj.setBudget(50000);
		prj.setEstimatedTime(100);
		prj.setName("Our first stinking project");
		prj.setCustomer(cst);
		
		dbsession.beginTransaction();
		dbsession.saveOrUpdate(prj);
		dbsession.getTransaction().commit();
		
		// Role
		Role role = new Role();
		role.setName("Kodapa");
		
		// ProjectAdminlevel
		ProjectAdminLevel pal = new ProjectAdminLevel();
		pal.setLevel(100);
		pal.setName("ProjectAdmin");
		
		dbsession.beginTransaction();
		dbsession.saveOrUpdate(pal);
		dbsession.getTransaction().commit();
		
		// FeeInProject
		FeeInProject fip = new FeeInProject();
		fip.setFee(500);
		fip.setProject(prj);
		fip.setRole(role);
		
		// AttendedTime
		AttendedTime att = new AttendedTime();
		att.setFeeInProject(fip);
		att.setUser(usr);
		
		// Timelog
		Date now = new Date();
		Timelog tl = new Timelog();
		tl.setComment("Our first timelog");
		tl.setDuration(5);
		tl.setStart(now);
		tl.setTitle("SuperTimelog");
		tl.setProject(prj);
		tl.setAttendedTime(att);
		
		dbsession.beginTransaction();
		dbsession.saveOrUpdate(tl);
		dbsession.getTransaction().commit();
		
		//UserInProject
		UserInProject uip = new UserInProject();
		uip.setProject(prj);
		uip.setUser(usr);
		uip.setProjectAdminLevel(pal);
		
		dbsession.beginTransaction();
		dbsession.saveOrUpdate(uip);
		dbsession.getTransaction().commit();
	}

	public UUID getUuid() {
		return uuid;
	}

	public void setUuid(UUID uuid) {
		this.uuid = uuid;
	}
}
