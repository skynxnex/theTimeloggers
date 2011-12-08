package se.kyh.ad10.timeloggers.server.entities;

import java.util.Set;
import java.util.HashSet;

public class UserInProject {
	private int id;
	private Set<Project> project;
	private Set<ProjectAdminLevel> projectAdminLevel;
	private int projectAdminLevelId;
	private int projectId;
	private Set<User> user;
	private int userId;

	public int getId() {
		return this.id;
	}

	public Set<Project> getProject() {
		if (this.project == null) {
			this.project = new HashSet<Project>();
		}
		return this.project;
	}

	public Set<ProjectAdminLevel> getProjectAdminLevel() {
		if (this.projectAdminLevel == null) {
			this.projectAdminLevel = new HashSet<ProjectAdminLevel>();
		}
		return this.projectAdminLevel;
	}

	public int getProjectAdminLevelId() {
		return this.projectAdminLevelId;
	}

	public int getProjectId() {
		return this.projectId;
	}

	public Set<User> getUser() {
		if (this.user == null) {
			this.user = new HashSet<User>();
		}
		return this.user;
	}

	public int getUserId() {
		return this.userId;
	}

	public void setId(int value) {
		this.id = value;
	}

	public void setProjectAdminLevelId(int value) {
		this.projectAdminLevelId = value;
	}

	public void setProjectId(int value) {
		this.projectId = value;
	}

	public void setUserId(int value) {
		this.userId = value;
	}

}
