package se.kyh.ad10.timeloggers.server.entities;

import java.util.List;
import java.util.Set;

import javax.persistence.Basic;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "user_in_project")
@Embeddable
public class UserInProject {
	
	@Id
	@GeneratedValue
	private int id;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "project_admin_level_id")
	private List<ProjectAdminLevel> projectAdminLevel;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "project_id")
	private List<Project> project;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "user_id")
	private List<User> user;
	
	public int getId() {
		return this.id;
	}

	public void setId(int value) {
		this.id = value;
	}
	
	public List<ProjectAdminLevel> getProjectAdminLevel() {
		return this.projectAdminLevel;
	}

	public List <Project> getProject() {
		return this.project;
	}

	public List <User> getUser() {
		return this.user;
	}
}
 