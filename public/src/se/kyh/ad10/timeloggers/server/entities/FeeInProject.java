package se.kyh.ad10.timeloggers.server.entities;

import java.util.Set;
import java.util.HashSet;

public class FeeInProject {
	private int fee;
	private int id;
	private Set<Project> project;
	private boolean projectId;
	private Set<Role> role;
	private int roleId;
	private Set<AttendedTime> userRoleInProject;
	private Set<AttendedTime> userRoleInProject1;

	public int getFee() {
		return this.fee;
	}

	public int getId() {
		return this.id;
	}

	public Set<Project> getProject() {
		if (this.project == null) {
			this.project = new HashSet<Project>();
		}
		return this.project;
	}


	public Set<Role> getRole() {
		if (this.role == null) {
			this.role = new HashSet<Role>();
		}
		return this.role;
	}

	public int getRoleId() {
		return this.roleId;
	}

	public Set<AttendedTime> getUserRoleInProject() {
		if (this.userRoleInProject == null) {
			this.userRoleInProject = new HashSet<AttendedTime>();
		}
		return this.userRoleInProject;
	}

	public Set<AttendedTime> getUserRoleInProject1() {
		if (this.userRoleInProject1 == null) {
			this.userRoleInProject1 = new HashSet<AttendedTime>();
		}
		return this.userRoleInProject1;
	}

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

	public void setRoleId(int value) {
		this.roleId = value;
	}

}
