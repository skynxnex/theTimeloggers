package se.kyh.ad10.timeloggers.server.entities;

import java.util.Set;
import java.util.HashSet;

public class Role {
   /**
    * <pre>
    *           0..*     0..*
    * Role ------------------------- FeeInProject
    *           role        &lt;       feeInProject
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
    * Role ------------------------- FeeInProject
    *           role1        &gt;       feeInProject1
    * </pre>
    */
   private Set<FeeInProject> feeInProject1;
   
   public Set<FeeInProject> getFeeInProject1() {
      if (this.feeInProject1 == null) {
         this.feeInProject1 = new HashSet<FeeInProject>();
      }
      return this.feeInProject1;
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
