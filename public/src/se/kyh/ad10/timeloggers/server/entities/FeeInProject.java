package se.kyh.ad10.timeloggers.server.entities;

import java.util.Set;
import java.util.HashSet;

public class FeeInProject {
   /**
    * <pre>
    *           0..*     0..*
    * FeeInProject ------------------------- AttendedTime
    *           feeInProject        &gt;       userRoleInProject
    * </pre>
    */
   private Set<AttendedTime> userRoleInProject;
   
   public Set<AttendedTime> getUserRoleInProject() {
      if (this.userRoleInProject == null) {
         this.userRoleInProject = new HashSet<AttendedTime>();
      }
      return this.userRoleInProject;
   }
   
   /**
    * <pre>
    *           0..*     0..*
    * FeeInProject ------------------------- AttendedTime
    *           feeInProject1        &lt;       userRoleInProject1
    * </pre>
    */
   private Set<AttendedTime> userRoleInProject1;
   
   public Set<AttendedTime> getUserRoleInProject1() {
      if (this.userRoleInProject1 == null) {
         this.userRoleInProject1 = new HashSet<AttendedTime>();
      }
      return this.userRoleInProject1;
   }
   
   /**
    * <pre>
    *           0..*     0..*
    * FeeInProject ------------------------- Role
    *           feeInProject        &gt;       role
    * </pre>
    */
   private Set<Role> role;
   
   public Set<Role> getRole() {
      if (this.role == null) {
         this.role = new HashSet<Role>();
      }
      return this.role;
   }
   
   /**
    * <pre>
    *           0..*     0..*
    * FeeInProject ------------------------- Role
    *           feeInProject1        &lt;       role1
    * </pre>
    */
   private Set<Role> role1;
   
   public Set<Role> getRole1() {
      if (this.role1 == null) {
         this.role1 = new HashSet<Role>();
      }
      return this.role1;
   }
   
   /**
    * <pre>
    *           0..*     0..*
    * FeeInProject ------------------------- Project
    *           feeInProject        &lt;       project
    * </pre>
    */
   private Set<Project> project;
   
   public Set<Project> getProject() {
      if (this.project == null) {
         this.project = new HashSet<Project>();
      }
      return this.project;
   }
   
   /**
    * <pre>
    *           0..*     0..*
    * FeeInProject ------------------------- Project
    *           feeInProject1        &gt;       project1
    * </pre>
    */
   private Set<Project> project1;
   
   public Set<Project> getProject1() {
      if (this.project1 == null) {
         this.project1 = new HashSet<Project>();
      }
      return this.project1;
   }
   
   private int id;
   
   public void setId(int value) {
      this.id = value;
   }
   
   public int getId() {
      return this.id;
   }
   
   private int fee;
   
   public void setFee(int value) {
      this.fee = value;
   }
   
   public int getFee() {
      return this.fee;
   }
   
   private boolean projectId;
   
   public void setProjectId(boolean value) {
      this.projectId = value;
   }
   
   public boolean isProjectId() {
      return this.projectId;
   }
   
   private int roleId;
   
   public void setRoleId(int value) {
      this.roleId = value;
   }
   
   public int getRoleId() {
      return this.roleId;
   }
   
   }
