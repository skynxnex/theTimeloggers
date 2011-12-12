package se.kyh.ad10.timeloggers.server.dao.intf;

import java.io.Serializable;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import se.kyh.ad10.timeloggers.server.entities.AttendedTime;

public interface AttendedTimeDAO extends Remote, Serializable {
	
   public List<AttendedTime> listAll() throws RemoteException;
   
   public boolean saveAttendedTime(AttendedTime AttendedTime) throws RemoteException;
   
   public boolean deleteAttendedTime(int id) throws RemoteException;
   
   }
