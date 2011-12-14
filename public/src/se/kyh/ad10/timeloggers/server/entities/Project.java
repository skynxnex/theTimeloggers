package se.kyh.ad10.timeloggers.server.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@SuppressWarnings("serial")
@Entity
@Table(name = "project")
@Embeddable
public class Project implements Serializable {

	/*---------------------*/
	@Id
	@GeneratedValue
	private int id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "budget")
	private int budget;
	
	@Column(name = "estimated_time")
	private int estimatedTime;
	
	@ManyToOne
	@JoinColumn
	private Customer customer;
	
	@OneToMany
	@JoinColumn
	private List<FeeInProject> feeInProject;
	
	@OneToMany
	@JoinColumn
	private List<UserInProject> userInProject;
	
	@OneToMany
	@JoinColumn
	private List<Timelog> timelog;
	
// Not needed atm
//	@OneToMany
//	@JoinColumn(name="project_id") 
//	private List<Timelog> timelogs;
	
	/*---------------------*/
	
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
	
	public List<FeeInProject> getFeeInProject() {
		return this.feeInProject;
	}
	
	public List<UserInProject> getUserInProject() {
		return this.userInProject;
	}
	
	public List<Timelog> getTimelog() {
		return this.timelog;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
}