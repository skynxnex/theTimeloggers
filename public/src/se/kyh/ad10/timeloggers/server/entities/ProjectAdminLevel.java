package se.kyh.ad10.timeloggers.server.entities;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "project_admin_level")
@Embeddable
public class ProjectAdminLevel {
	
	@Id
	@GeneratedValue
	private int id;
	
	@Column(name = "level")
	private int level;
	
	@Column(name = "name")
	private String name;
	
//	private Set<UserInProject> userInProject;

	public int getId() {
		return this.id;
	}

	public int getLevel() {
		return this.level;
	}

	public String getName() {
		return this.name;
	}

//	public Set<UserInProject> getUserInProject() {
//		if (this.userInProject == null) {
//			this.userInProject = new HashSet<UserInProject>();
//		}
//		return this.userInProject;
//	}

	public void setId(int value) {
		this.id = value;
	}

	public void setLevel(int value) {
		this.level = value;
	}

	public void setName(String value) {
		this.name = value;
	}

}
