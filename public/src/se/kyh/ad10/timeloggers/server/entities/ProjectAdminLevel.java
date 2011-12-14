package se.kyh.ad10.timeloggers.server.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "project_admin_level")
@Embeddable
public class ProjectAdminLevel implements Serializable {
	
	@Id
	@GeneratedValue
	private int id;
	
	@Column(name = "level")
	private int level;
	
	@Column(name = "name")
	private String name;
	
	@OneToMany
	@JoinColumn
	private List<UserInProject> userInProject;

	public int getId() {
		return this.id;
	}

	public int getLevel() {
		return this.level;
	}

	public String getName() {
		return this.name;
	}

	public void setId(int value) {
		this.id = value;
	}

	public void setLevel(int value) {
		this.level = value;
	}

	public void setName(String value) {
		this.name = value;
	}
	
	public List<UserInProject> getUserInProject() {
		return this.userInProject;
	}

	public void setUserInProject(List<UserInProject> userInProject) {
		this.userInProject = userInProject;
	}
}
