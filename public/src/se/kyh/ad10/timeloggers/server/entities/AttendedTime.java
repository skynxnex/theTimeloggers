package se.kyh.ad10.timeloggers.server.entities;

import java.io.Serializable;
import java.util.Set;
import java.util.HashSet;

@SuppressWarnings("serial")
public class AttendedTime implements Serializable {

	private Set<FeeInProject> feeInProject;
	private int feeInProjectId;
	private int id;
	private Set<Timelog> timelog;
	private int userId;
	private Set<User> userImpl;

	public Set<FeeInProject> getFeeInProject() {
		if (this.feeInProject == null) {
			this.feeInProject = new HashSet<FeeInProject>();
		}
		return this.feeInProject;
	}

	public int getFeeInProjectId() {
		return this.feeInProjectId;
	}

	public int getId() {
		return this.id;
	}

	public Set<Timelog> getTimelog() {
		if (this.timelog == null) {
			this.timelog = new HashSet<Timelog>();
		}
		return this.timelog;
	}

	public int getUserId() {
		return this.userId;
	}

	public Set<User> getUserImpl() {
		if (this.userImpl == null) {
			this.userImpl = new HashSet<User>();
		}
		return this.userImpl;
	}

	public void setFeeInProjectId(int value) {
		this.feeInProjectId = value;
	}

	public void setId(int value) {
		this.id = value;
	}

	public void setUserId(int value) {
		this.userId = value;
	}
}
