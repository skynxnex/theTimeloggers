package se.kyh.ad10.timeloggers.server.dao.intf;

import java.io.Serializable;
import java.rmi.Remote;
import java.rmi.RemoteException;
import se.kyh.ad10.timeloggers.server.entities.ProjectAdminLevel;



public interface ProjectAdminLevelDAO extends Remote, Serializable {
	
   public String getProjectAdminLevelName(int id) throws RemoteException;
   
   public boolean saveProjectAdminLevel(ProjectAdminLevel projectAdminLevel) throws RemoteException;
   
   }
