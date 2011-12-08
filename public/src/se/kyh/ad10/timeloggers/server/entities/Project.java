package se.kyh.ad10.timeloggers.server.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@SuppressWarnings("serial")
@Entity
@Table(name = "project")
public class Project implements Serializable {

	@Id
	@GeneratedValue
	@Column(name = "project_id")
	private int id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "budget")
	private int budget;
	
	@Column(name = "estimated_time")
	private int estimatedTime;


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

	public int getBudget() {
		return budget;
	}

	public void setBudget(int budget) {
		this.budget = budget;
	}

	public int getEstimatedTime() {
		return estimatedTime;
	}

	public void setEstimatedTime(int estimatedTime) {
		this.estimatedTime = estimatedTime;
	}
	
//	private boolean active;
//	private int customerId;
//	private Set<Customer> customer;
//	private Set<FeeInProject> feeInProject;
//	private Set<Timelog> timelog;
//	private Set<UserInProject> userInProject;

	

}
