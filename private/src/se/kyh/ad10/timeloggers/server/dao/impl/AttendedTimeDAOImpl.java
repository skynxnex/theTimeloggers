package se.kyh.ad10.timeloggers.server.dao.impl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import java.util.UUID;

import org.hibernate.Query;
import org.hibernate.Session;

import se.kyh.ad10.timeloggers.server.dao.intf.AttendedTimeDAO;
import se.kyh.ad10.timeloggers.server.db.DB;
import se.kyh.ad10.timeloggers.server.entities.AttendedTime;

@SuppressWarnings("serial")
public class AttendedTimeDAOImpl extends UnicastRemoteObject implements AttendedTimeDAO {
	
	private UUID uuid;

	public AttendedTimeDAOImpl(UUID uuid) throws RemoteException {
		super();
		this.setUuid(uuid);
	}

	@Override
	public List<AttendedTime> listAll() throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean saveAttendedTime(AttendedTime AttendedTime) throws RemoteException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteAttendedTime(int id) throws RemoteException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public AttendedTime getAttendedTime(int id) throws RemoteException {
		Session dbsession = DB.get().getSession();
		dbsession.beginTransaction();
		Query query = dbsession.createQuery("from AttendedTime where id = :id");
		query.setInteger("id", id);
		AttendedTime att = (AttendedTime) query.uniqueResult();
		dbsession.getTransaction().commit();
		return att;
	}

	public UUID getUuid() {
		return uuid;
	}

	public void setUuid(UUID uuid) {
		this.uuid = uuid;
	}
}
