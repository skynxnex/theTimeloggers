package se.kyh.ad10.timeloggers.server.engine;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.UUID;

import se.kyh.ad10.timeloggers.server.dao.impl.AttendedTimeDAOImpl;
import se.kyh.ad10.timeloggers.server.dao.impl.CustomerDAOImpl;
import se.kyh.ad10.timeloggers.server.dao.impl.CustomerInfoDAOImpl;
import se.kyh.ad10.timeloggers.server.dao.impl.FeeInProjectDAOImpl;
import se.kyh.ad10.timeloggers.server.dao.impl.InfoTypeDAOImpl;
import se.kyh.ad10.timeloggers.server.dao.impl.ProjectDAOImpl;
import se.kyh.ad10.timeloggers.server.dao.impl.ProjetAdminLevelDAOImpl;
import se.kyh.ad10.timeloggers.server.dao.impl.RoleDAOImpl;
import se.kyh.ad10.timeloggers.server.dao.impl.SystemAdminLevelDAOImpl;
import se.kyh.ad10.timeloggers.server.dao.impl.TimeLogDAOImpl;
import se.kyh.ad10.timeloggers.server.dao.impl.UserDAOImpl;
import se.kyh.ad10.timeloggers.server.dao.intf.AttendedTimeDAO;
import se.kyh.ad10.timeloggers.server.dao.intf.CustomerDAO;
import se.kyh.ad10.timeloggers.server.dao.intf.CustomerInfoDAO;
import se.kyh.ad10.timeloggers.server.dao.intf.FeeInProjectDAO;
import se.kyh.ad10.timeloggers.server.dao.intf.InfoTypeDAO;
import se.kyh.ad10.timeloggers.server.dao.intf.ProjectAdminLevelDAO;
import se.kyh.ad10.timeloggers.server.dao.intf.ProjectDAO;
import se.kyh.ad10.timeloggers.server.dao.intf.RoleDAO;
import se.kyh.ad10.timeloggers.server.dao.intf.SystemAdminLevelDAO;
import se.kyh.ad10.timeloggers.server.dao.intf.TimeLogDAO;
import se.kyh.ad10.timeloggers.server.dao.intf.UserDAO;
import se.kyh.ad10.timeloggers.server.dao.intf.UserInProjectDAO;
import se.kyh.ad10.timeloggers.server.dao.intf.UserInfoDAO;
import se.kyh.ad10.timeloggers.server.entities.User;
import se.kyh.ad10.timeloggersPublic.server.PublicInterface;

@SuppressWarnings("serial")
public class PublicInterfaceImpl extends UnicastRemoteObject implements PublicInterface {


	private int userId;
	public String email;
	public String password;
	public UUID uuid;
	public int adminLevel;


	protected PublicInterfaceImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	public User doLogin(UUID uuid) {

		return null;
	}

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

	public int getUserId() {
		return userId;
	}

	private void setUserId(int userId) {
		this.userId = userId;
	}

	@Override
	public AttendedTimeDAO getAttendedTimeDAO() throws RemoteException {
		AttendedTimeDAO obj = new AttendedTimeDAOImpl();
		return obj;
	}

	@Override
	public CustomerInfoDAO getCustomerInfoDAO() throws RemoteException {
		CustomerInfoDAO obj = new CustomerInfoDAOImpl();
		return obj;
	}

	@Override
	public FeeInProjectDAO getFeeInProjectDAO() throws RemoteException {
		FeeInProjectDAO obj = new FeeInProjectDAOImpl();
		return obj;
	}

	@Override
	public InfoTypeDAO getInfoTypeDAO() throws RemoteException {
		InfoTypeDAO obj = new InfoTypeDAOImpl();
		return obj;
	}

	@Override
	public ProjectAdminLevelDAO getProjectAdminLevelDAO()
			throws RemoteException {
		ProjectAdminLevelDAO obj = new ProjetAdminLevelDAOImpl();
		return obj;
	}

	@Override
	public RoleDAO getRoleDAO() throws RemoteException {
		RoleDAO obj = new RoleDAOImpl();
		return obj;
	}

	@Override
	public SystemAdminLevelDAO getSystemAdminLevelDAO() throws RemoteException {
		SystemAdminLevelDAO obj = new SystemAdminLevelDAOImpl();
		return obj;
	}

	@Override
	public TimeLogDAO getTimelogDAO() throws RemoteException {
		TimeLogDAO obj = new TimeLogDAOImpl();
		return obj;
	}

	@Override
	public UserInProjectDAO getUserInProjectDAO() throws RemoteException {
		return null;
	}
}
