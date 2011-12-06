package se.kyh.ad10.timeloggers.server.entities;

import java.util.HashSet;
import java.util.Set;

public class UserInfo {
   /**
    * <pre>
    *           0..*     0..*
    * UserInfo ------------------------- User
    *           info        &lt;       user
    * </pre>
    */
   private Set<User> user;
   
   public Set<User> getUser() {
      if (this.user == null) {
         this.user = new HashSet<User>();
      }
      return this.user;
   }
   
   /**
    * <pre>
    *           0..*     0..*
    * UserInfo ------------------------- InfoType
    *           info        &gt;       infoType
    * </pre>
    */
   private Set<InfoType> infoType;
   
   public Set<InfoType> getInfoType() {
      if (this.infoType == null) {
         this.infoType = new HashSet<InfoType>();
      }
      return this.infoType;
   }
   
   /**
    * <pre>
    *           0..*     0..*
    * UserInfo ------------------------- User
    *           userInfo        &gt;       user1
    * </pre>
    */
   private Set<User> user1;
   
   public Set<User> getUser1() {
      if (this.user1 == null) {
         this.user1 = new HashSet<User>();
      }
      return this.user1;
   }
   
   /**
    * <pre>
    *           0..*     0..*
    * UserInfo ------------------------- InfoType
    *           userInfo        &lt;       infoType1
    * </pre>
    */
   private Set<InfoType> infoType1;
   
   public Set<InfoType> getInfoType1() {
      if (this.infoType1 == null) {
         this.infoType1 = new HashSet<InfoType>();
      }
      return this.infoType1;
   }
   
   private int id;
   
   public void setId(int value) {
      this.id = value;
   }
   
   public int getId() {
      return this.id;
   }
   
   private String value;
   
   public void setValue(String value) {
      this.value = value;
   }
   
   public String getValue() {
      return this.value;
   }
   
   private int infoTypeId;
   
   public void setInfoTypeId(int value) {
      this.infoTypeId = value;
   }
   
   public int getInfoTypeId() {
      return this.infoTypeId;
   }
   
   private int userId;
   
   public void setUserId(int value) {
      this.userId = value;
   }
   
   public int getUserId() {
      return this.userId;
   }
   
   }
