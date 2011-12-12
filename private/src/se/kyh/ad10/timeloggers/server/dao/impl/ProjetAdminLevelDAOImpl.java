package se.kyh.ad10.timeloggers.server.dao.impl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import se.kyh.ad10.timeloggers.server.dao.intf.ProjectAdminLevelDAO;
import se.kyh.ad10.timeloggers.server.entities.ProjectAdminLevel;

@SuppressWarnings("serial")
public class ProjetAdminLevelDAOImpl extends UnicastRemoteObject implements  ProjectAdminLevelDAO {

	public ProjetAdminLevelDAOImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
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
}
