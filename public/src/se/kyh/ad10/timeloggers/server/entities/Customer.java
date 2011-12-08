package se.kyh.ad10.timeloggers.server.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@SuppressWarnings("serial")
public class Customer implements Serializable {
	private boolean active;
	private Set<CustomerInfo> customerInfo;
	private int id;
	private String name;
	private Set<Project> project;

	public Set<CustomerInfo> getCustomerInfo() {
		if (this.customerInfo == null) {
			this.customerInfo = new HashSet<CustomerInfo>();
		}
		return this.customerInfo;
	}

	public int getId() {
		return this.id;
	}

	public String getName() {
		return this.name;
	}

	public Set<Project> getProject() {
		if (this.project == null) {
			this.project = new HashSet<Project>();
		}
		return this.project;
	}

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
