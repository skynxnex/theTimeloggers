package se.kyh.ad10.timeloggers.server.dao.intf;

import java.io.Serializable;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import se.kyh.ad10.timeloggers.server.entities.SystemAdminLevel;


public interface SystemAdminLevelDAO extends Remote, Serializable {

	public int getAdminLevel(int id) throws RemoteException;

	public boolean setAdminLevel(int id) throws RemoteException;

	public List<SystemAdminLevel> listAllLevels() throws RemoteException;

}
