package se.kyh.ad10.timeloggers.server.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
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
@Table(name = "attended_time")
@Embeddable
public class AttendedTime implements Serializable {
	
	@Id
	@GeneratedValue
	private int id;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn
	private FeeInProject feeInProject;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn
	private User user;
	
	@OneToMany
	@JoinColumn
	private List<Timelog> timelog;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public FeeInProject getFeeInProject() {
		return this.feeInProject;
	}

	public User getUser() {
		return this.user;
	}
	
	public List<Timelog> getTimelog() {
		return this.timelog;
	}
	
	public void setFeeInProject(FeeInProject fee) {
		this.feeInProject = fee;
	}

	public void setUser(User user) {
		this.user = user;
	}
}
