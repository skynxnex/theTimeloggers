package se.kyh.ad10.timeloggers.server.dao.impl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import se.kyh.ad10.timeloggers.server.dao.intf.RoleDAO;
import se.kyh.ad10.timeloggers.server.entities.Role;

@SuppressWarnings("serial")
public class RoleDAOImpl extends UnicastRemoteObject implements RoleDAO {

	public RoleDAOImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
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
}
