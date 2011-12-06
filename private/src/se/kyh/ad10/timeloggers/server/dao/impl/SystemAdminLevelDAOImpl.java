package se.kyh.ad10.timeloggers.server.dao.impl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

import se.kyh.ad10.timeloggers.server.dao.intf.SystemAdminLevelDAO;
import se.kyh.ad10.timeloggers.server.entities.SystemAdminLevel;

@SuppressWarnings("serial")
public class SystemAdminLevelDAOImpl extends UnicastRemoteObject implements SystemAdminLevelDAO {

	protected SystemAdminLevelDAOImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getAdminLevel(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean setAdminLevel(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<SystemAdminLevel> listAllLevels() {
		// TODO Auto-generated method stub
		return null;
	}
}
