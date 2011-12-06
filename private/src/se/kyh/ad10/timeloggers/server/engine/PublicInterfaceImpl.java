package se.kyh.ad10.timeloggers.server.engine;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.UUID;

import se.kyh.ad10.timeloggers.server.dao.impl.CustomerDAOImpl;
import se.kyh.ad10.timeloggers.server.dao.impl.ProjectDAOImpl;
import se.kyh.ad10.timeloggers.server.dao.impl.UserDAOImpl;
import se.kyh.ad10.timeloggers.server.dao.intf.CustomerDAO;
import se.kyh.ad10.timeloggers.server.dao.intf.ProjectDAO;
import se.kyh.ad10.timeloggers.server.dao.intf.UserDAO;
import se.kyh.ad10.timeloggers.server.dao.intf.UserInfoDAO;
import se.kyh.ad10.timeloggersPublic.server.PublicInterface;

@SuppressWarnings("serial")
public class PublicInterfaceImpl extends UnicastRemoteObject implements PublicInterface {
	
	
	protected PublicInterfaceImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	public UUID uuid;
	
	@Override
	public UserDAO getUserDAO() throws RemoteException {
		UserDAO obj = new UserDAOImpl();
		return obj;
	}

	@Override
	public UserInfoDAO getUserInfoDAO() throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CustomerDAO getCustomerDAO() throws RemoteException {
		CustomerDAO obj = new CustomerDAOImpl();
		return obj;
	}
	
	public void setUUID(UUID uuid2) {
		this.uuid = uuid2;
	}

	@Override
	public ProjectDAO getProjectDAO() throws RemoteException {
		ProjectDAO obj = new ProjectDAOImpl();
		return obj;
	}
}
