package se.kyh.ad10.timeloggers.server.entities;

import java.util.Set;
import java.util.HashSet;

public class Role {
	private Set<FeeInProject> feeInProject;
	private int id;
	private String name;

	public Set<FeeInProject> getFeeInProject() {
		if (this.feeInProject == null) {
			this.feeInProject = new HashSet<FeeInProject>();
		}
		return this.feeInProject;
	}

	public int getId() {
		return this.id;
	}

	public String getName() {
		return this.name;
	}

	public void setId(int value) {
		this.id = value;
	}

	public void setName(String value) {
		this.name = value;
	}

}
