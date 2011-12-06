package se.kyh.ad10.timeloggers.server.entities;

import java.util.Set;
import java.util.HashSet;

public class ProjectAdminLevel {
   /**
    * <pre>
    *           0..*     0..*
    * ProjectAdminLevel ------------------------- UserInProject
    *           projectAdminLevel        &gt;       userInProject
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
    * ProjectAdminLevel ------------------------- UserInProject
    *           projectAdminLevel1        &lt;       userInProject1
    * </pre>
    */
   private Set<UserInProject> userInProject1;
   
   public Set<UserInProject> getUserInProject1() {
      if (this.userInProject1 == null) {
         this.userInProject1 = new HashSet<UserInProject>();
      }
      return this.userInProject1;
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
