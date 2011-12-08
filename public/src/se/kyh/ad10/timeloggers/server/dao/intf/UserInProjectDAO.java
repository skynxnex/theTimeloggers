package se.kyh.ad10.timeloggers.server.dao.intf;

import java.io.Serializable;
import java.rmi.Remote;
import java.rmi.RemoteException;


public interface UserInProjectDAO extends Remote, Serializable {
	
   public boolean addUserToProject(int userId, int projectId, int projectAdminLevelId) throws RemoteException;
   
   public boolean removeUserFromProject(int id) throws RemoteException;
   
   }
