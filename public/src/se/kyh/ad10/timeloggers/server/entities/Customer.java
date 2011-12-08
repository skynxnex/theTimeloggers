package se.kyh.ad10.timeloggers.server.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "customer")
@Embeddable
public class Customer implements Serializable {
	
	@Id
	@GeneratedValue
	private int id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "active")
	private boolean active;
	
//	private Set<CustomerInfo> customerInfo;
//	private Set<Project> project;
	
//	public Set<CustomerInfo> getCustomerInfo() {
//		if (this.customerInfo == null) {
//			this.customerInfo = new HashSet<CustomerInfo>();
//		}
//		return this.customerInfo;
//	}

	public int getId() {
		return this.id;
	}

	public String getName() {
		return this.name;
	}

//	public Set<Project> getProject() {
//		if (this.project == null) {
//			this.project = new HashSet<Project>();
//		}
//		return this.project;
//	}

	public boolean isActive() {
		return this.active;
	}

	public void setActive(boolean value) {
		this.active = value;
	}

	public void setId(int value) {
		this.id = value;
	}

	public void setName(String value) {
		this.name = value;
	}

}
