package se.kyh.ad10.timeloggers.server.entities;

import java.util.Set;
import java.util.HashSet;

public class Project {
   /**
    * <pre>
    *           0..*     0..*
    * Project ------------------------- FeeInProject
    *           project        &gt;       feeInProject
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
    * Project ------------------------- FeeInProject
    *           project1        &lt;       feeInProject1
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
    * Project ------------------------- Timelog
    *           project        &gt;       timelog
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
    * Project ------------------------- Timelog
    *           project1        &lt;       timelog1
    * </pre>
    */
   private Set<Timelog> timelog1;
   
   public Set<Timelog> getTimelog1() {
      if (this.timelog1 == null) {
         this.timelog1 = new HashSet<Timelog>();
      }
      return this.timelog1;
   }
   
   /**
    * <pre>
    *           0..*     0..*
    * Project ------------------------- Customer
    *           project        &lt;       customer
    * </pre>
    */
   private Set<Customer> customer;
   
   public Set<Customer> getCustomer() {
      if (this.customer == null) {
         this.customer = new HashSet<Customer>();
      }
      return this.customer;
   }
   
   /**
    * <pre>
    *           0..*     0..*
    * Project ------------------------- Customer
    *           project1        &gt;       customer1
    * </pre>
    */
   private Set<Customer> customer1;
   
   public Set<Customer> getCustomer1() {
      if (this.customer1 == null) {
         this.customer1 = new HashSet<Customer>();
      }
      return this.customer1;
   }
   
   /**
    * <pre>
    *           0..*     0..*
    * Project ------------------------- UserInProject
    *           project        &lt;       userInProject
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
    * Project ------------------------- UserInProject
    *           project1        &gt;       userInProject1
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
   
   private int budget;
   
   public void setBudget(int value) {
      this.budget = value;
   }
   
   public int getBudget() {
      return this.budget;
   }
   
   private int estimatedTime;
   
   public void setEstimatedTime(int value) {
      this.estimatedTime = value;
   }
   
   public int getEstimatedTime() {
      return this.estimatedTime;
   }
   
   private int customerId;
   
   public void setCustomerId(int value) {
      this.customerId = value;
   }
   
   public int getCustomerId() {
      return this.customerId;
   }
   
   private boolean active;
   
   public void setActive(boolean value) {
      this.active = value;
   }
   
   public boolean isActive() {
      return this.active;
   }
   
   }
