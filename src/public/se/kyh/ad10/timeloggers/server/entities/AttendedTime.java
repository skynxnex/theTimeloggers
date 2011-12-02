package se.kyh.ad10.timeloggers.server.entities;

import java.util.Set;
import java.util.HashSet;

public class AttendedTime {
   /**
    * <pre>
    *           0..*     0..*
    * AttendedTime ------------------------- User
    *           userRoleInProjectImpl        &lt;       userImpl
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
    * AttendedTime ------------------------- User
    *           userRoleInProjectImpl1        &gt;       userImpl1
    * </pre>
    */
   private Set<User> userImpl1;
   
   public Set<User> getUserImpl1() {
      if (this.userImpl1 == null) {
         this.userImpl1 = new HashSet<User>();
      }
      return this.userImpl1;
   }
   
   /**
    * <pre>
    *           0..*     0..*
    * AttendedTime ------------------------- FeeInProject
    *           userRoleInProject        &lt;       feeInProject
    * </pre>
    */
   private Set<FeeInProject> feeInProject;
   
   public Set<FeeInProject> getFeeInProject() {
      if (this.feeInProject == null) {
         this.feeInProject = new HashSet<FeeInProject>();
      }
      return this.feeInProject;
   }
   
   /**
    * <pre>
    *           0..*     0..*
    * AttendedTime ------------------------- FeeInProject
    *           userRoleInProject1        &gt;       feeInProject1
    * </pre>
    */
   private Set<FeeInProject> feeInProject1;
   
   public Set<FeeInProject> getFeeInProject1() {
      if (this.feeInProject1 == null) {
         this.feeInProject1 = new HashSet<FeeInProject>();
      }
      return this.feeInProject1;
   }
   
   /**
    * <pre>
    *           0..*     0..*
    * AttendedTime ------------------------- Timelog
    *           userRoleInProject        &lt;       timelog
    * </pre>
    */
   private Set<Timelog> timelog;
   
   public Set<Timelog> getTimelog() {
      if (this.timelog == null) {
         this.timelog = new HashSet<Timelog>();
      }
      return this.timelog;
   }
   
   /**
    * <pre>
    *           0..*     0..*
    * AttendedTime ------------------------- Timelog
    *           userRoleInProject1        &gt;       timelog1
    * </pre>
    */
   private Set<Timelog> timelog1;
   
   public Set<Timelog> getTimelog1() {
      if (this.timelog1 == null) {
         this.timelog1 = new HashSet<Timelog>();
      }
      return this.timelog1;
   }
   
   private int userId;
   
   public void setUserId(int value) {
      this.userId = value;
   }
   
   public int getUserId() {
      return this.userId;
   }
   
   private int feeInProjectId;
   
   public void setFeeInProjectId(int value) {
      this.feeInProjectId = value;
   }
   
   public int getFeeInProjectId() {
      return this.feeInProjectId;
   }
   
   private int id;
   
   public void setId(int value) {
      this.id = value;
   }
   
   public int getId() {
      return this.id;
   }
   
   }
