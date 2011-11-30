package se.kyh.ad10.timeloggers.server.dao.impl;
import null.DB;

import DB;
import se.kyh.ad10.timeloggers.server.dao.intf.UserInfoDAO;
import se.kyh.ad10.timeloggers.server.entities.UserInfo;
import java.util.Set;
import java.util.HashSet;

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
   
   }
