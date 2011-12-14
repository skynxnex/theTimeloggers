package se.kyh.ad10.timeloggers.server.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
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
@Table(name = "fee_in_project")
@Embeddable
public class FeeInProject implements Serializable {
	
	@Id
	@GeneratedValue
	private int id;
	
	@Column(name = "fee")
	private int fee;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn
	private Role role;	

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn
	private Project project;
	
	@OneToMany
	@JoinColumn
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

	public Project getProject() {
		return this.project;
	}

	public Role getRole() {
		return this.role;
	}

	public List<AttendedTime> getAttendedTime() {
		return this.attendedTime;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	public void setRole(Role role) {
		this.role = role;
	}
}
