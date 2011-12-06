package se.kyh.ad10.timeloggers.server.entities;

import java.io.Serializable;
import java.util.Set;
import java.util.HashSet;

@SuppressWarnings("serial")
public class Project implements Serializable {
   
	private boolean active;
	private int budget;
	private Set<Customer> customer;
	private Set<Customer> customer1;
	private int customerId;
	private int estimatedTime;
	private Set<FeeInProject> feeInProject;
	private Set<FeeInProject> feeInProject1;
	private int id;
	private String name;
	private Set<Timelog> timelog;
	private Set<Timelog> timelog1;
	private Set<UserInProject> userInProject;
	private Set<UserInProject> userInProject1;
   
   public int getBudget() {
      return this.budget;
   }
   
   public Set<Customer> getCustomer() {
      if (this.customer == null) {
         this.customer = new HashSet<Customer>();
      }
      return this.customer;
   }
   
   public Set<Customer> getCustomer1() {
      if (this.customer1 == null) {
         this.customer1 = new HashSet<Customer>();
      }
      return this.customer1;
   }
   
   public int getCustomerId() {
      return this.customerId;
   }
   
   public int getEstimatedTime() {
      return this.estimatedTime;
   }
   
   public Set<FeeInProject> getFeeInProject() {
      if (this.feeInProject == null) {
         this.feeInProject = new HashSet<FeeInProject>();
      }
      return this.feeInProject;
   }
   
   public Set<FeeInProject> getFeeInProject1() {
      if (this.feeInProject1 == null) {
         this.feeInProject1 = new HashSet<FeeInProject>();
      }
      return this.feeInProject1;
   }
   
   public int getId() {
      return this.id;
   }
   
   public String getName() {
      return this.name;
   }
   
   public Set<Timelog> getTimelog() {
      if (this.timelog == null) {
         this.timelog = new HashSet<Timelog>();
      }
      return this.timelog;
   }
   
   public Set<Timelog> getTimelog1() {
      if (this.timelog1 == null) {
         this.timelog1 = new HashSet<Timelog>();
      }
      return this.timelog1;
   }
   
   public Set<UserInProject> getUserInProject() {
      if (this.userInProject == null) {
         this.userInProject = new HashSet<UserInProject>();
      }
      return this.userInProject;
   }
   
   public Set<UserInProject> getUserInProject1() {
      if (this.userInProject1 == null) {
         this.userInProject1 = new HashSet<UserInProject>();
      }
      return this.userInProject1;
   }
   
   public boolean isActive() {
      return this.active;
   }
   
   public void setActive(boolean value) {
      this.active = value;
   }
   
   public void setBudget(int value) {
      this.budget = value;
   }
   
   public void setCustomerId(int value) {
      this.customerId = value;
   }
   
   public void setEstimatedTime(int value) {
      this.estimatedTime = value;
   }
   
   public void setId(int value) {
      this.id = value;
   }
   
   public void setName(String value) {
      this.name = value;
   }
   
   }
