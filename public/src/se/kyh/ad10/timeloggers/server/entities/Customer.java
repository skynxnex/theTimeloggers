package se.kyh.ad10.timeloggers.server.entities;

import java.util.Set;
import java.util.HashSet;

public class Customer {
   /**
    * <pre>
    *           0..*     0..*
    * Customer ------------------------- CustomerInfo
    *           customer        &gt;       customerInfo
    * </pre>
    */
   private Set<CustomerInfo> customerInfo;
   
   public Set<CustomerInfo> getCustomerInfo() {
      if (this.customerInfo == null) {
         this.customerInfo = new HashSet<CustomerInfo>();
      }
      return this.customerInfo;
   }
   
   /**
    * <pre>
    *           0..*     0..*
    * Customer ------------------------- CustomerInfo
    *           customer1        &lt;       customerInfo1
    * </pre>
    */
   private Set<CustomerInfo> customerInfo1;
   
   public Set<CustomerInfo> getCustomerInfo1() {
      if (this.customerInfo1 == null) {
         this.customerInfo1 = new HashSet<CustomerInfo>();
      }
      return this.customerInfo1;
   }
   
   /**
    * <pre>
    *           0..*     0..*
    * Customer ------------------------- Project
    *           customer        &gt;       project
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
    * Customer ------------------------- Project
    *           customer1        &lt;       project1
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
   
   private String name;
   
   public void setName(String value) {
      this.name = value;
   }
   
   public String getName() {
      return this.name;
   }
   
   private boolean active;
   
   public void setActive(boolean value) {
      this.active = value;
   }
   
   public boolean isActive() {
      return this.active;
   }
   
   }
