package se.kyh.ad10.timeloggers.server.entities;

import java.util.Set;
import java.util.HashSet;
import java.util.Date;

public class Timelog {
   /**
    * <pre>
    *           0..*     0..*
    * Timelog ------------------------- Project
    *           timelog        &lt;       project
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
    * Timelog ------------------------- Project
    *           timelog1        &gt;       project1
    * </pre>
    */
   private Set<Project> project1;
   
   public Set<Project> getProject1() {
      if (this.project1 == null) {
         this.project1 = new HashSet<Project>();
      }
      return this.project1;
   }
   
   /**
    * <pre>
    *           0..*     0..*
    * Timelog ------------------------- AttendedTime
    *           timelog        &gt;       userRoleInProject
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
    * Timelog ------------------------- AttendedTime
    *           timelog1        &lt;       userRoleInProject1
    * </pre>
    */
   private Set<AttendedTime> userRoleInProject1;
   
   public Set<AttendedTime> getUserRoleInProject1() {
      if (this.userRoleInProject1 == null) {
         this.userRoleInProject1 = new HashSet<AttendedTime>();
      }
      return this.userRoleInProject1;
   }
   
   private int id;
   
   public void setId(int value) {
      this.id = value;
   }
   
   public int getId() {
      return this.id;
   }
   
   private String title;
   
   public void setTitle(String value) {
      this.title = value;
   }
   
   public String getTitle() {
      return this.title;
   }
   
   private String comment;
   
   public void setComment(String value) {
      this.comment = value;
   }
   
   public String getComment() {
      return this.comment;
   }
   
   private int duration;
   
   public void setDuration(int value) {
      this.duration = value;
   }
   
   public int getDuration() {
      return this.duration;
   }
   
   private Date start;
   
   public void setStart(Date value) {
      this.start = value;
   }
   
   public Date getStart() {
      return this.start;
   }
   
   private int projectId;
   
   public void setProjectId(int value) {
      this.projectId = value;
   }
   
   public int getProjectId() {
      return this.projectId;
   }
   
   private int attendedTimeId;
   
   public void setAttendedTimeId(int value) {
      this.attendedTimeId = value;
   }
   
   public int getAttendedTimeId() {
      return this.attendedTimeId;
   }
   
   }
