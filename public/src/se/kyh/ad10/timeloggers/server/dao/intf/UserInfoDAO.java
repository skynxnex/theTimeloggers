package se.kyh.ad10.timeloggers.server.dao.intf;

import java.io.Serializable;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import se.kyh.ad10.timeloggers.server.entities.UserInfo;


public interface UserInfoDAO extends Remote, Serializable {

	public List<UserInfo> listUserInfoByUser(int userId) throws RemoteException;

	public boolean deleteUserInfo(int id) throws RemoteException;

	public boolean saveUserInfo(UserInfo userInfo) throws RemoteException;

}
