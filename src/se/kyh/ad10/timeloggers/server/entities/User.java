package se.kyh.ad10.timeloggers.server.entities;

import java.util.Set;
import java.util.HashSet;

public class User {
   private int id;
   
   public void setId(int value) {
      this.id = value;
   }
   
   public int getId() {
      return this.id;
   }
   
   /**
    * <pre>
    *           0..*     0..*
    * User ------------------------- UserInfo
    *           user        &gt;       info
    * </pre>
    */
   private Set<UserInfo> info;
   
   public Set<UserInfo> getInfo() {
      if (this.info == null) {
         this.info = new HashSet<UserInfo>();
      }
      return this.info;
   }
   
   /**
    * <pre>
    *           0..*     0..*
    * User ------------------------- UserInfo
    *           user1        &lt;       userInfo
    * </pre>
    */
   private Set<UserInfo> userInfo;
   
   public Set<UserInfo> getUserInfo() {
      if (this.userInfo == null) {
         this.userInfo = new HashSet<UserInfo>();
      }
      return this.userInfo;
   }
   
   private String password;
   
   public void setPassword(String value) {
      this.password = value;
   }
   
   public String getPassword() {
      return this.password;
   }
   
   private String name;
   
   public void setName(String value) {
      this.name = value;
   }
   
   public String getName() {
      return this.name;
   }
   
   private String email;
   
   public void setEmail(String value) {
      this.email = value;
   }
   
   public String getEmail() {
      return this.email;
   }
   
   private String plainPassword;
   
   public void setPlainPassword(String value) {
      this.plainPassword = value;
   }
   
   public String getPlainPassword() {
      return this.plainPassword;
   }
   
   /**
    * <pre>
    *           0..*     0..*
    * User ------------------------- AttendedTime
    *           userImpl        &gt;       userRoleInProjectImpl
    * </pre>
    */
   private Set<AttendedTime> userRoleInProjectImpl;
   
   public Set<AttendedTime> getUserRoleInProjectImpl() {
      if (this.userRoleInProjectImpl == null) {
         this.userRoleInProjectImpl = new HashSet<AttendedTime>();
      }
      return this.userRoleInProjectImpl;
   }
   
   /**
    * <pre>
    *           0..*     0..*
    * User ------------------------- AttendedTime
    *           userImpl1        &lt;       userRoleInProjectImpl1
    * </pre>
    */
   private Set<AttendedTime> userRoleInProjectImpl1;
   
   public Set<AttendedTime> getUserRoleInProjectImpl1() {
      if (this.userRoleInProjectImpl1 == null) {
         this.userRoleInProjectImpl1 = new HashSet<AttendedTime>();
      }
      return this.userRoleInProjectImpl1;
   }
   
   /**
    * <pre>
    *           0..*     0..*
    * User ------------------------- SystemAdminLevel
    *           userImpl        &gt;       systemAdminLevelImpl
    * </pre>
    */
   private Set<SystemAdminLevel> systemAdminLevelImpl;
   
   public Set<SystemAdminLevel> getSystemAdminLevelImpl() {
      if (this.systemAdminLevelImpl == null) {
         this.systemAdminLevelImpl = new HashSet<SystemAdminLevel>();
      }
      return this.systemAdminLevelImpl;
   }
   
   /**
    * <pre>
    *           0..*     0..*
    * User ------------------------- SystemAdminLevel
    *           userImpl1        &lt;       systemAdminLevelImpl1
    * </pre>
    */
   private Set<SystemAdminLevel> systemAdminLevelImpl1;
   
   public Set<SystemAdminLevel> getSystemAdminLevelImpl1() {
      if (this.systemAdminLevelImpl1 == null) {
         this.systemAdminLevelImpl1 = new HashSet<SystemAdminLevel>();
      }
      return this.systemAdminLevelImpl1;
   }
   
   /**
    * <pre>
    *           0..*     0..*
    * User ------------------------- UserInProject
    *           user        &lt;       userInProject
    * </pre>
    */
   private Set<UserInProject> userInProject;
   
   public Set<UserInProject> getUserInProject() {
      if (this.userInProject == null) {
         this.userInProject = new HashSet<UserInProject>();
      }
      return this.userInProject;
   }
   
   /**
    * <pre>
    *           0..*     0..*
    * User ------------------------- UserInProject
    *           user1        &gt;       userInProject1
    * </pre>
    */
   private Set<UserInProject> userInProject1;
   
   public Set<UserInProject> getUserInProject1() {
      if (this.userInProject1 == null) {
         this.userInProject1 = new HashSet<UserInProject>();
      }
      return this.userInProject1;
   }
   
   public String encryptPassword(String pass) {
      // TODO implement this operation
      throw new UnsupportedOperationException("not implemented");
   }
   
   }
