package se.kyh.ad10.timeloggers.server.entities;

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

	@ManyToOne
	@JoinColumn(name = "project_admin_level_id")
	@Basic(fetch = FetchType.EAGER)
	private ProjectAdminLevel projectAdminLevel;
	
	@ManyToOne
	@JoinColumn(name = "project_id")
	@Basic(fetch = FetchType.EAGER)
	private Project project;
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	@Basic(fetch = FetchType.EAGER)
	private User user;

//	private Set<User> user;
//	private Set<Project> project;
//	private Set<ProjectAdminLevel> projectAdminLevel;
	
	public int getId() {
		return this.id;
	}

//	public Set<Project> getProject() {
//		if (this.project == null) {
//			this.project = new HashSet<Project>();
//		}
//		return this.project;
//	}

//	public Set<ProjectAdminLevel> getProjectAdminLevel() {
//		if (this.projectAdminLevel == null) {
//			this.projectAdminLevel = new HashSet<ProjectAdminLevel>();
//		}
//		return this.projectAdminLevel;
//	}

//	public Set<User> getUser() {
//		if (this.user == null) {
//			this.user = new HashSet<User>();
//		}
//		return this.user;
//	}

	public void setId(int value) {
		this.id = value;
	}

	public ProjectAdminLevel getProjectAdminLevel() {
		return projectAdminLevel;
	}

	public void setProjectAdminLevel(ProjectAdminLevel projectAdminLevel) {
		this.projectAdminLevel = projectAdminLevel;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

//	public void setProjectAdminLevelId(int value) {
//		this.projectAdminLevelId = value;
//	}
}
