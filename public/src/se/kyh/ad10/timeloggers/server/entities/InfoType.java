package se.kyh.ad10.timeloggers.server.entities;

import java.util.HashSet;
import java.util.Set;

public class InfoType {
   /**
    * <pre>
    *           0..*     0..*
    * InfoType ------------------------- UserInfo
    *           infoType        &lt;       info
    * </pre>
    */
   private Set<UserInfo> info;
   
   public Set<UserInfo> getInfo() {
      if (this.info == null) {
         this.info = new HashSet<UserInfo>();
      }
      return this.info;
   }
   
   /**
    * <pre>
    *           0..*     0..*
    * InfoType ------------------------- UserInfo
    *           infoType1        &gt;       userInfo
    * </pre>
    */
   private Set<UserInfo> userInfo;
   
   public Set<UserInfo> getUserInfo() {
      if (this.userInfo == null) {
         this.userInfo = new HashSet<UserInfo>();
      }
      return this.userInfo;
   }
   
   
   /**
    * <pre>
    *           0..*     0..*
    * InfoType ------------------------- CustomerInfo
    *           infoTypeImpl        &gt;       customerInfoImpl
    * </pre>
    */
   private Set<CustomerInfo> customerInfoImpl;
   
   public Set<CustomerInfo> getCustomerInfoImpl() {
      if (this.customerInfoImpl == null) {
         this.customerInfoImpl = new HashSet<CustomerInfo>();
      }
      return this.customerInfoImpl;
   }
   
   /**
    * <pre>
    *           0..*     0..*
    * InfoType ------------------------- CustomerInfo
    *           infoTypeImpl1        &lt;       customerInfoImpl1
    * </pre>
    */
   private Set<CustomerInfo> customerInfoImpl1;
   
   public Set<CustomerInfo> getCustomerInfoImpl1() {
      if (this.customerInfoImpl1 == null) {
         this.customerInfoImpl1 = new HashSet<CustomerInfo>();
      }
      return this.customerInfoImpl1;
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
   
   }
