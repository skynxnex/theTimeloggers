package se.kyh.ad10.timeloggers.server.dao.intf;

import java.io.Serializable;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import se.kyh.ad10.timeloggers.server.entities.Timelog;

public interface TimeLogDAO extends Remote, Serializable {
	
   public List<Timelog> getAllTimeLogsForUserInProject(int userId, int projectId) throws RemoteException;
   
   public List<Timelog> getAllTimelogsForProject(int projectId) throws RemoteException;
   
   public boolean deleteTimeLog(int id) throws RemoteException;
   
   public boolean startTimeLog(int userId, int projectId) throws RemoteException;
   
   public boolean stopTimeLog(int timeLogId, String title, String comment) throws RemoteException;
   
   public List<Timelog> getAllTimeLogsForUser(int userId) throws RemoteException;
   
   public boolean saveTimeLog(Timelog timelog) throws RemoteException;
   
   }
