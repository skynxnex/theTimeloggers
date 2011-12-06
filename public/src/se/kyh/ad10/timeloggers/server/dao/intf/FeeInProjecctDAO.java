package se.kyh.ad10.timeloggers.server.dao.intf;

import java.io.Serializable;
import java.rmi.Remote;
import java.rmi.RemoteException;

import se.kyh.ad10.timeloggers.server.entities.FeeInProject;


public interface FeeInProjecctDAO extends Remote, Serializable {
	
   public boolean saveFeeInProject(FeeInProject feeInProject) throws RemoteException;
   
   public boolean deleteFeeInProject(int id) throws RemoteException;
   
   }
