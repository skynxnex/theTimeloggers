package se.kyh.ad10.timeloggers.server.entities;

import java.io.Serializable;
import java.util.Set;
import java.util.HashSet;

@SuppressWarnings("serial")
public class Project implements Serializable {

	private int id;
	private String name;
	private int customerId;
	private int estimatedTime;
	private boolean active;
	private int budget;
	private Set<Customer> customer;
	private Set<FeeInProject> feeInProject;
	private Set<Timelog> timelog;
	private Set<UserInProject> userInProject;

	public int getBudget() {
		return this.budget;
	}

	public Set<Customer> getCustomer() {
		if (this.customer == null) {
			this.customer = new HashSet<Customer>();
		}
		return this.customer;
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

	public Set<UserInProject> getUserInProject() {
		if (this.userInProject == null) {
			this.userInProject = new HashSet<UserInProject>();
		}
		return this.userInProject;
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
