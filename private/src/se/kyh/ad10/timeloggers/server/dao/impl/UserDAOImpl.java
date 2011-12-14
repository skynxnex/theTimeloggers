package se.kyh.ad10.timeloggers.server.dao.impl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import java.util.UUID;

import org.hibernate.Query;
import org.hibernate.Session;

import se.kyh.ad10.timeloggers.server.dao.intf.UserDAO;
import se.kyh.ad10.timeloggers.server.engine.SecurityLayerImpl;
import se.kyh.ad10.timeloggers.server.entities.Role;
import se.kyh.ad10.timeloggers.server.entities.User;

@SuppressWarnings("serial")
public class UserDAOImpl extends UnicastRemoteObject implements UserDAO {
	
	private UUID uuid;

	public UserDAOImpl(UUID uuid) throws RemoteException {
		super();
		this.setUuid(uuid);
	}

	@Override
	public User getUserById(int id) {
		Session dbsession = SecurityLayerImpl.getPublicInterfaceImpl(uuid).getSession();
		dbsession.beginTransaction();
		Query query = dbsession.createQuery("from User where id = :id");
		query.setInteger("id", id);
		User user = (User) query.uniqueResult();
		dbsession.getTransaction().commit();
		return user;
	}

	@Override
	public User login(String email, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean saveUser(User user) {
		Session dbsession = SecurityLayerImpl.getPublicInterfaceImpl(uuid).getSession();
		dbsession.beginTransaction();
		dbsession.saveOrUpdate(user);
		dbsession.getTransaction().commit();
		return false;
	}

	@Override
	public List<User> getAllUsers() {
		Session dbsession = SecurityLayerImpl.getPublicInterfaceImpl(uuid).getSession();
		dbsession.beginTransaction();
		List<User> result = dbsession.createQuery( "from user" ).list();
		dbsession.getTransaction().commit();
		return result;
	}

	@Override
	public void deleteUser(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean inactivateUser(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean activateUser(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getName(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Role> getUserRolesInProject(int userId, int projectId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getUsersForProject(int projectId) {
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
