package se.kyh.ad10.timeloggers.server.dao.impl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

import se.kyh.ad10.timeloggers.server.dao.intf.ProjectDAO;
import se.kyh.ad10.timeloggers.server.entities.Project;

@SuppressWarnings("serial")
public class ProjectDAOImpl extends UnicastRemoteObject implements ProjectDAO {

	public ProjectDAOImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean saveProjectActivityStatus(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Project> getAllProjectsForCustomer(int projectId, int customerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean saveProject(String name, int budget, int estimatedTime,
			int customerId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Project getProject(int id) {
		// TODO Auto-generated method stub
		return null;
	}
}
