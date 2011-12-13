package se.kyh.ad10.timeloggers.server.dao.impl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.UUID;

import se.kyh.ad10.timeloggers.server.dao.intf.UserInProjectDAO;

@SuppressWarnings("serial")
public class UserInProjectDAOImpl extends UnicastRemoteObject implements UserInProjectDAO {
	
	private UUID uuid;

	public UserInProjectDAOImpl(UUID uuid) throws RemoteException {
		super();
		this.setUuid(uuid);
	}

	@Override
	public boolean addUserToProject(int userId, int projectId,
			int projectAdminLevelId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeUserFromProject(int id) {
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
