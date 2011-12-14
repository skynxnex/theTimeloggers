package se.kyh.ad10.timeloggers.server.entities;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "user_in_project")
@Embeddable
public class UserInProject implements Serializable {
	
	@Id
	@GeneratedValue
	private int id;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn
	private ProjectAdminLevel projectAdminLevel;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn
	private Project project;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn
	private User user;
	
	public int getId() {
		return this.id;
	}

	public void setId(int value) {
		this.id = value;
	}
	
	public void setProject(Project prj) {
		this.project = prj;
	}
	
	public void setUser(User usr) {
		this.user = usr;
	}
	
	public void setProjectAdminLevel(ProjectAdminLevel pal) {
		this.projectAdminLevel = pal;
	}
	
	public ProjectAdminLevel getProjectAdminLevel() {
		return this.projectAdminLevel;
	}

	public Project getProject() {
		return this.project;
	}

	public User getUser() {
		return this.user;
	}
}
 