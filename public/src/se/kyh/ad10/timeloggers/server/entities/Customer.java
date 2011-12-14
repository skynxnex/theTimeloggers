package se.kyh.ad10.timeloggers.server.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
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

	@OneToMany
	@JoinColumn
	private List<CustomerInfo> customerInfo;
	
	@OneToMany
	@JoinColumn
	private List<Project> project;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}
	
	public List<CustomerInfo> getCustomerInfo() {
		return this.customerInfo;
	}

	public List<Project> getProject() {
		return this.project;
	}
}
