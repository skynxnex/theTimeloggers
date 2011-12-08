package se.kyh.ad10.timeloggers.server.dao.impl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import se.kyh.ad10.timeloggers.server.dao.intf.UserInfoDAO;
import se.kyh.ad10.timeloggers.server.entities.UserInfo;

@SuppressWarnings("serial")
public class UserInfoDAOImpl extends UnicastRemoteObject implements UserInfoDAO {

	protected UserInfoDAOImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	private Set<UserInfo> userInfo;

	public Set<UserInfo> getUserInfo() {
		if (this.userInfo == null) {
			this.userInfo = new HashSet<UserInfo>();
		}
		return this.userInfo;
	}

	@Override
	public List<UserInfo> listUserInfoByUser(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteUserInfo(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean saveUserInfo(UserInfo userInfo) {
		// TODO Auto-generated method stub
		return false;
	}

}
