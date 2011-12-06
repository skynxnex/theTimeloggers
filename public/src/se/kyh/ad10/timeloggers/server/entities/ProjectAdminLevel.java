package se.kyh.ad10.timeloggers.server.entities;

import java.util.Set;
import java.util.HashSet;

public class ProjectAdminLevel {
	private int id;
	private int level;
	private String name;
	private Set<UserInProject> userInProject;

	public int getId() {
		return this.id;
	}

	public int getLevel() {
		return this.level;
	}

	public String getName() {
		return this.name;
	}

	public Set<UserInProject> getUserInProject() {
		if (this.userInProject == null) {
			this.userInProject = new HashSet<UserInProject>();
		}
		return this.userInProject;
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

}
