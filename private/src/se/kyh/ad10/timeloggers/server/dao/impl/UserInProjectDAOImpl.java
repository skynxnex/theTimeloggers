package se.kyh.ad10.timeloggers.server.dao.impl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import se.kyh.ad10.timeloggers.server.dao.intf.UserInProjectDAO;

@SuppressWarnings("serial")
public class UserInProjectDAOImpl extends UnicastRemoteObject implements UserInProjectDAO {

	protected UserInProjectDAOImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
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
}
