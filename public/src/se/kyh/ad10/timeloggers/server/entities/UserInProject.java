package se.kyh.ad10.timeloggers.server.entities;

import java.util.Set;
import java.util.HashSet;

public class UserInProject {
   /**
    * <pre>
    *           0..*     0..*
    * UserInProject ------------------------- ProjectAdminLevel
    *           userInProject        &lt;       projectAdminLevel
    * </pre>
    */
   private Set<ProjectAdminLevel> projectAdminLevel;
   
   public Set<ProjectAdminLevel> getProjectAdminLevel() {
      if (this.projectAdminLevel == null) {
         this.projectAdminLevel = new HashSet<ProjectAdminLevel>();
      }
      return this.projectAdminLevel;
   }
   
   /**
    * <pre>
    *           0..*     0..*
    * UserInProject ------------------------- ProjectAdminLevel
    *           userInProject1        &gt;       projectAdminLevel1
    * </pre>
    */
   private Set<ProjectAdminLevel> projectAdminLevel1;
   
   public Set<ProjectAdminLevel> getProjectAdminLevel1() {
      if (this.projectAdminLevel1 == null) {
         this.projectAdminLevel1 = new HashSet<ProjectAdminLevel>();
      }
      return this.projectAdminLevel1;
   }
   
   /**
    * <pre>
    *           0..*     0..*
    * UserInProject ------------------------- User
    *           userInProject        &gt;       user
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
    * UserInProject ------------------------- User
    *           userInProject1        &lt;       user1
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
    * UserInProject ------------------------- Project
    *           userInProject        &gt;       project
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
    * UserInProject ------------------------- Project
    *           userInProject1        &lt;       project1
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
   
   private int projectId;
   
   public void setProjectId(int value) {
      this.projectId = value;
   }
   
   public int getProjectId() {
      return this.projectId;
   }
   
   private int userId;
   
   public void setUserId(int value) {
      this.userId = value;
   }
   
   public int getUserId() {
      return this.userId;
   }
   
   private int projectAdminLevelId;
   
   public void setProjectAdminLevelId(int value) {
      this.projectAdminLevelId = value;
   }
   
   public int getProjectAdminLevelId() {
      return this.projectAdminLevelId;
   }
   
   }
