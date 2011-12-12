package se.kyh.ad10.timeloggersPublic.server;

import java.io.Serializable;
import java.rmi.Remote;
import java.rmi.RemoteException;

import se.kyh.ad10.timeloggers.server.dao.intf.AttendedTimeDAO;
import se.kyh.ad10.timeloggers.server.dao.intf.CustomerDAO;
import se.kyh.ad10.timeloggers.server.dao.intf.CustomerInfoDAO;
import se.kyh.ad10.timeloggers.server.dao.intf.FeeInProjectDAO;
import se.kyh.ad10.timeloggers.server.dao.intf.InfoTypeDAO;
import se.kyh.ad10.timeloggers.server.dao.intf.ProjectAdminLevelDAO;
import se.kyh.ad10.timeloggers.server.dao.intf.ProjectDAO;
import se.kyh.ad10.timeloggers.server.dao.intf.RoleDAO;
import se.kyh.ad10.timeloggers.server.dao.intf.SystemAdminLevelDAO;
import se.kyh.ad10.timeloggers.server.dao.intf.TimeLogDAO;
import se.kyh.ad10.timeloggers.server.dao.intf.UserDAO;
import se.kyh.ad10.timeloggers.server.dao.intf.UserInProjectDAO;
import se.kyh.ad10.timeloggers.server.dao.intf.UserInfoDAO;

public interface PublicInterface extends Remote, Serializable {
	
   public UserDAO getUserDAO() throws RemoteException;
   
   public UserInfoDAO getUserInfoDAO() throws RemoteException;
   
   public CustomerDAO getCustomerDAO() throws RemoteException;
   
   public ProjectDAO getProjectDAO() throws RemoteException;
   
   public AttendedTimeDAO getAttendedTimeDAO() throws RemoteException;
   
   public CustomerInfoDAO getCustomerInfoDAO() throws RemoteException;
   
   public FeeInProjectDAO getFeeInProjectDAO() throws RemoteException;
   
   public InfoTypeDAO getInfoTypeDAO()  throws RemoteException;
   
   public ProjectAdminLevelDAO getProjectAdminLevelDAO() throws RemoteException;
   
   public RoleDAO getRoleDAO() throws RemoteException;
   
   public SystemAdminLevelDAO getSystemAdminLevelDAO() throws RemoteException;
   
   public TimeLogDAO getTimelogDAO() throws RemoteException;
   
   public UserInProjectDAO getUserInProjectDAO() throws RemoteException;
   
   }
