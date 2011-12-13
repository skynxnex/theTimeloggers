package se.kyh.ad10.timeloggers.server.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.FetchType;
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
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn
	private List<FeeInProject> feeInProject;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn
	private List<User> user;
	
	@OneToMany(fetch = FetchType.EAGER)
	@JoinColumn
	private List<Timelog> timelog;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public List<FeeInProject> getFeeInProject() {
		return this.feeInProject;
	}

	public List<User> getUser() {
		return this.user;
	}
	
	public List<Timelog> getTimelog() {
		return this.timelog;
	}
}
