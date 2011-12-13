package se.kyh.ad10.timeloggers.server.dao.impl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import java.util.UUID;

import se.kyh.ad10.timeloggers.server.dao.intf.SystemAdminLevelDAO;
import se.kyh.ad10.timeloggers.server.entities.SystemAdminLevel;

@SuppressWarnings("serial")
public class SystemAdminLevelDAOImpl extends UnicastRemoteObject implements SystemAdminLevelDAO {
	
	private UUID uuid; 

	public SystemAdminLevelDAOImpl(UUID uuid) throws RemoteException {
		super();
		this.setUuid(uuid);
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

	public UUID getUuid() {
		return uuid;
	}

	public void setUuid(UUID uuid) {
		this.uuid = uuid;
	}
}
