package se.kyh.ad10.timeloggers.server.entities;

import java.io.Serializable;
import java.util.Set;
import java.util.HashSet;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id ;

import org.hibernate.annotations.Entity;
import org.hibernate.annotations.Table;

@SuppressWarnings("serial")
@Entity
@Table(appliesTo = "project")
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

	@Column(name = "budget")
	public int getBudget() {
		return this.budget;
	}

	public Set<Customer> getCustomer() {
		if (this.customer == null) {
			this.customer = new HashSet<Customer>();
		}
		return this.customer;
	}
	@Column(name = "customer_id")
	public int getCustomerId() {
		return this.customerId;
	}
	@Column(name = "estimated_time")
	public int getEstimatedTime() {
		return this.estimatedTime;
	}

	public Set<FeeInProject> getFeeInProject() {
		if (this.feeInProject == null) {
			this.feeInProject = new HashSet<FeeInProject>();
		}
		return this.feeInProject;
	}
	@Id
	@GeneratedValue
	@Column(name = "project_id")
	public int getId() {
		return this.id ;
	}

	@Column(name = "name")
	public String getName() {
		return this.name ;
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
	@Column(name = "active")
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
