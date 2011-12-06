package se.kyh.ad10.timeloggers.server.entities;

import java.util.Set;
import java.util.HashSet;

public class SystemAdminLevel {
   /**
    * <pre>
    *           0..*     0..*
    * SystemAdminLevel ------------------------- User
    *           systemAdminLevelImpl        &lt;       userImpl
    * </pre>
    */
   private Set<User> userImpl;
   
   public Set<User> getUserImpl() {
      if (this.userImpl == null) {
         this.userImpl = new HashSet<User>();
      }
      return this.userImpl;
   }
   
   /**
    * <pre>
    *           0..*     0..*
    * SystemAdminLevel ------------------------- User
    *           systemAdminLevelImpl1        &gt;       userImpl1
    * </pre>
    */
   private Set<User> userImpl1;
   
   public Set<User> getUserImpl1() {
      if (this.userImpl1 == null) {
         this.userImpl1 = new HashSet<User>();
      }
      return this.userImpl1;
   }
   
   private int id;
   
   public void setId(int value) {
      this.id = value;
   }
   
   public int getId() {
      return this.id;
   }
   
   private String name;
   
   public void setName(String value) {
      this.name = value;
   }
   
   public String getName() {
      return this.name;
   }
   
   private int level;
   
   public void setLevel(int value) {
      this.level = value;
   }
   
   public int getLevel() {
      return this.level;
   }
   
   }
