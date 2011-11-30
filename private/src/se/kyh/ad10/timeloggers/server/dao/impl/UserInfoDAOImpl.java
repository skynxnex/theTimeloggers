package se.kyh.ad10.timeloggers.server.dao.impl;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import se.kyh.ad10.timeloggers.server.dao.intf.UserInfoDAO;
import se.kyh.ad10.timeloggers.server.db.DB;
import se.kyh.ad10.timeloggers.server.entities.UserInfo;

public class UserInfoDAOImpl extends DB implements UserInfoDAO {
   /**
    * <pre>
    *           0..*     0..*
    * UserInfoDAOImpl ------------------------- UserInfo
    *           userInfoDAO        &gt;       userInfo
    * </pre>
    */
   private Set<UserInfo> userInfo;
   
   public Set<UserInfo> getUserInfo() {
      if (this.userInfo == null) {
         this.userInfo = new HashSet<UserInfo>();
      }
      return this.userInfo;
   }

@Override
public List listUserInfoByUser(int userId) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public boolean deleteUserInfo(int id) {
	// TODO Auto-generated method stub
	return false;
}

@Override
public boolean saveUserInfo(String value, int userId, int infoTypeId) {
	// TODO Auto-generated method stub
	return false;
}
   
   }
