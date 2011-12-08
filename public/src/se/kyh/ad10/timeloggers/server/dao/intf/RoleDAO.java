package se.kyh.ad10.timeloggers.server.dao.intf;

import java.io.Serializable;
import java.rmi.Remote;
import java.rmi.RemoteException;

import se.kyh.ad10.timeloggers.server.entities.Role;


public interface RoleDAO extends Remote, Serializable {
	
   public String getRoleName(int id) throws RemoteException;
   
   public boolean saveRole(Role role) throws RemoteException;
   
   public boolean deleteRole(int id) throws RemoteException;
   
   }
