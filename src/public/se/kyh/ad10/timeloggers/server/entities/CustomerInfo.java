package se.kyh.ad10.timeloggers.server.entities;

import java.util.Set;
import java.util.HashSet;

public class CustomerInfo {
   /**
    * <pre>
    *           0..*     0..*
    * CustomerInfo ------------------------- InfoType
    *           customerInfoImpl        &lt;       infoTypeImpl
    * </pre>
    */
   private Set<InfoType> infoTypeImpl;
   
   public Set<InfoType> getInfoTypeImpl() {
      if (this.infoTypeImpl == null) {
         this.infoTypeImpl = new HashSet<InfoType>();
      }
      return this.infoTypeImpl;
   }
   
   /**
    * <pre>
    *           0..*     0..*
    * CustomerInfo ------------------------- InfoType
    *           customerInfoImpl1        &gt;       infoTypeImpl1
    * </pre>
    */
   private Set<InfoType> infoTypeImpl1;
   
   public Set<InfoType> getInfoTypeImpl1() {
      if (this.infoTypeImpl1 == null) {
         this.infoTypeImpl1 = new HashSet<InfoType>();
      }
      return this.infoTypeImpl1;
   }
   
   /**
    * <pre>
    *           0..*     0..*
    * CustomerInfo ------------------------- Customer
    *           customerInfo        &lt;       customer
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
    * CustomerInfo ------------------------- Customer
    *           customerInfo1        &gt;       customer1
    * </pre>
    */
   private Set<Customer> customer1;
   
   public Set<Customer> getCustomer1() {
      if (this.customer1 == null) {
         this.customer1 = new HashSet<Customer>();
      }
      return this.customer1;
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
   
   private int customerId;
   
   public void setCustomerId(int value) {
      this.customerId = value;
   }
   
   public int getCustomerId() {
      return this.customerId;
   }
   
   private int infoTypeId;
   
   public void setInfoTypeId(int value) {
      this.infoTypeId = value;
   }
   
   public int getInfoTypeId() {
      return this.infoTypeId;
   }
   
   }
