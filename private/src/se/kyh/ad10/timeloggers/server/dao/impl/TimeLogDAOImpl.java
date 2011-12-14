package se.kyh.ad10.timeloggers.server.dao.impl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import java.util.UUID;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

import se.kyh.ad10.timeloggers.server.dao.intf.TimeLogDAO;
import se.kyh.ad10.timeloggers.server.db.DB;
import se.kyh.ad10.timeloggers.server.engine.SecurityLayerImpl;
import se.kyh.ad10.timeloggers.server.entities.AttendedTime;
import se.kyh.ad10.timeloggers.server.entities.Timelog;
import se.kyh.ad10.timeloggers.server.entities.User;

@SuppressWarnings("serial")
public class TimeLogDAOImpl extends UnicastRemoteObject implements TimeLogDAO {
	
	private UUID uuid;
	private List<Timelog> timelogs;

	public TimeLogDAOImpl(UUID uuid) throws RemoteException {
		super();
		this.setUuid(uuid);
	}

	@Override
	public List<Timelog> getAllTimeLogsForUserInProject(int userId, int projectId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Timelog> getAllTimelogsForProject(int projectId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteTimeLog(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean saveTimeLog(Timelog timelog) throws RemoteException {
		boolean success = false;
		try {
			Session dbsession = DB.get().getSession();
			dbsession.beginTransaction();
			dbsession.saveOrUpdate(timelog);
			dbsession.getTransaction().commit();
			success = dbsession.getTransaction().wasCommitted();
		} catch (HibernateException e) {
			throw new RemoteException("Database save failed", e);
		}
		return success; 
	}

	@Override
	public boolean startTimeLog(int userId, int projectId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean stopTimeLog(int timeLogId, String title, String comment) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Timelog> getAllTimeLogsForUser(int userId) {
		Session dbsession = SecurityLayerImpl.getPublicInterfaceImpl(uuid).getSession();
		dbsession.beginTransaction();
		Query query = dbsession.createQuery("from User where id = :id");
		query.setInteger("id", userId);
		User user = (User) query.uniqueResult();
		System.out.println(user.getEmail());
		List<AttendedTime> atts = user.getAttendedTime();
		for ( AttendedTime att : (List<AttendedTime>) atts ) {
			for (Timelog tl : att.getTimelog()) {
				this.timelogs.add(tl);
			}
		}
		dbsession.getTransaction().commit();
		return this.timelogs;
	}
	
	public List<Timelog> getAllTimelogs() throws RemoteException {
		Session dbsession = DB.get().getSession();
		dbsession.beginTransaction();
		List<Timelog> result = dbsession.createQuery( "from Timelog" ).list();
		dbsession.getTransaction().commit();
		return result;
	}

	public UUID getUuid() {
		return uuid;
	}

	public void setUuid(UUID uuid) {
		this.uuid = uuid;
	}
}
