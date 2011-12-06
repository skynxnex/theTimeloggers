package se.kyh.ad10.timeloggersPublic.server;

import java.io.Serializable;
import java.rmi.Remote;
import java.rmi.RemoteException;

import se.kyh.ad10.timeloggers.server.dao.intf.CustomerDAO;
import se.kyh.ad10.timeloggers.server.dao.intf.ProjectDAO;
import se.kyh.ad10.timeloggers.server.dao.intf.UserDAO;
import se.kyh.ad10.timeloggers.server.dao.intf.UserInfoDAO;

public interface PublicInterface extends Remote, Serializable {
	
   public UserDAO getUserDAO() throws RemoteException;
   
   public UserInfoDAO getUserInfoDAO() throws RemoteException;
   
   public CustomerDAO getCustomerDAO() throws RemoteException;
   
   public ProjectDAO getProjectDAO() throws RemoteException;
   
   }
