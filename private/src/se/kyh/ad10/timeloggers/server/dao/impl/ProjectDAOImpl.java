package se.kyh.ad10.timeloggers.server.dao.impl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import java.util.UUID;

import org.hibernate.Session;

import se.kyh.ad10.timeloggers.server.dao.intf.ProjectDAO;
import se.kyh.ad10.timeloggers.server.db.DB;
import se.kyh.ad10.timeloggers.server.entities.Project;

@SuppressWarnings("serial")
public class ProjectDAOImpl extends UnicastRemoteObject implements ProjectDAO {
	
	private UUID uuid;

	public ProjectDAOImpl(UUID uuid) throws RemoteException {
		super();
		this.setUuid(uuid);
	}

	@Override
	public boolean saveProjectActivityStatus(int id) {
		
		return false;
	}

	@Override
	public List<Project> getAllProjectsForCustomer(int projectId, int customerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean saveProject(Project project) {
		Session dbsession = DB.get().getSession();
		dbsession.beginTransaction();
		dbsession.saveOrUpdate(project);
		dbsession.getTransaction().commit();
		dbsession.close();
		return false;
	}

	@Override
	public Project getProject(int id) {
		
		
		return null;
//		return (Project)DB.get().getSession().createQuery("from Project where id=:id").setInteger("id", id).uniqueResult();
	}

	@Override
	public List<Project> getAllProjects() throws RemoteException {
		Session dbsession = DB.get().getSession();
		dbsession.beginTransaction();
		List<Project> result = dbsession.createQuery( "from Project" ).list();
		dbsession.getTransaction().commit();
		dbsession.close();
		return result;
	}

	public UUID getUuid() {
		return uuid;
	}

	public void setUuid(UUID uuid) {
		this.uuid = uuid;
	}
}
