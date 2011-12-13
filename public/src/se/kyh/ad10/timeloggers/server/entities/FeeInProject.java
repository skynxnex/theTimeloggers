package se.kyh.ad10.timeloggers.server.entities;

import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "fee_in_project")
@Embeddable
public class FeeInProject {
	
	@Id
	@GeneratedValue
	private int id;
	
	@Column(name = "fee")
	private int fee;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "role_id")
	private List<Role> role;	

	private List<Project> project;
	
	private List<AttendedTime> attendedTime;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getFee() {
		return fee;
	}

	public void setFee(int fee) {
		this.fee = fee;
	}

	public List<Project> getProject() {
		return this.project;
	}

	public List<Role> getRole() {
		return this.role;
	}

	public List<AttendedTime> getAttendedTime() {
		return this.attendedTime;
	}
}
