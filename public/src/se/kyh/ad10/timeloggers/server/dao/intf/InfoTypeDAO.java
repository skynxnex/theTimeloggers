package se.kyh.ad10.timeloggers.server.dao.intf;

import java.io.Serializable;
import java.rmi.Remote;
import java.rmi.RemoteException;
import se.kyh.ad10.timeloggers.server.entities.InfoType;



public interface InfoTypeDAO extends Remote, Serializable {
	
   public boolean saveInfoType(InfoType infoType) throws RemoteException;
   
   public String getInfoTypeName(int id) throws RemoteException;
   
   public boolean deleteInfoType(int id) throws RemoteException;
   
   }
