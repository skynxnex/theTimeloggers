package se.kyh.ad10.timeloggers.server.dao.impl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.UUID;

import se.kyh.ad10.timeloggers.server.dao.intf.ProjectAdminLevelDAO;
import se.kyh.ad10.timeloggers.server.entities.ProjectAdminLevel;

@SuppressWarnings("serial")
public class ProjetAdminLevelDAOImpl extends UnicastRemoteObject implements  ProjectAdminLevelDAO {
	
	private UUID uuid;

	public ProjetAdminLevelDAOImpl(UUID uuid) throws RemoteException {
		super();
		this.setUuid(uuid);
	}

	@Override
	public String getProjectAdminLevelName(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean saveProjectAdminLevel(ProjectAdminLevel projectAdminLevel) {
		// TODO Auto-generated method stub
		return false;
	}

	public UUID getUuid() {
		return uuid;
	}

	public void setUuid(UUID uuid) {
		this.uuid = uuid;
	}
}
