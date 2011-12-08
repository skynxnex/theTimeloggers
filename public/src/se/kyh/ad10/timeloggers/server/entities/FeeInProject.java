package se.kyh.ad10.timeloggers.server.entities;

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
	
	@ManyToOne
	@JoinColumn(name = "role_id")
	@Basic(fetch = FetchType.EAGER)
	private Role role;
	
	

	private boolean projectId;
	
//	private Set<Role> role;
//	private Set<Project> project;
//	private Set<AttendedTime> userRoleInProject;
//	private Set<AttendedTime> userRoleInProject1;

	public int getFee() {
		return this.fee;
	}

	public int getId() {
		return this.id;
	}
	
	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

//	public Set<Project> getProject() {
//		if (this.project == null) {
//			this.project = new HashSet<Project>();
//		}
//		return this.project;
//	}


//	public Set<Role> getRole() {
//		if (this.role == null) {
//			this.role = new HashSet<Role>();
//		}
//		return this.role;
//	}



//	public Set<AttendedTime> getUserRoleInProject() {
//		if (this.userRoleInProject == null) {
//			this.userRoleInProject = new HashSet<AttendedTime>();
//		}
//		return this.userRoleInProject;
//	}


	public boolean isProjectId() {
		return this.projectId;
	}

	public void setFee(int value) {
		this.fee = value;
	}

	public void setId(int value) {
		this.id = value;
	}

	public void setProjectId(boolean value) {
		this.projectId = value;
	}

}
