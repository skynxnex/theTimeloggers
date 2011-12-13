package se.kyh.ad10.timeloggers.server.dao.impl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.UUID;

import se.kyh.ad10.timeloggers.server.dao.intf.RoleDAO;
import se.kyh.ad10.timeloggers.server.entities.Role;

@SuppressWarnings("serial")
public class RoleDAOImpl extends UnicastRemoteObject implements RoleDAO {
	
	private UUID uuid;

	public RoleDAOImpl(UUID uuid) throws RemoteException {
		super();
		this.setUuid(uuid);
	}

	@Override
	public String getRoleName(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean saveRole(Role role) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteRole(int id) {
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
