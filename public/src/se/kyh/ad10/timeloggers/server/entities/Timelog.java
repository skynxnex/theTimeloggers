package se.kyh.ad10.timeloggers.server.entities;

import java.util.Set;
import java.util.HashSet;
import java.util.Date;

public class Timelog {
	private int attendedTimeId;
	private String comment;
	private int duration;
	private int id;
	private Set<Project> project;
	private int projectId;
	private Date start;
	private String title;
	private Set<AttendedTime> userRoleInProject;

	public int getAttendedTimeId() {
		return this.attendedTimeId;
	}

	public String getComment() {
		return this.comment;
	}

	public int getDuration() {
		return this.duration;
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

	public int getProjectId() {
		return this.projectId;
	}

	public Date getStart() {
		return this.start;
	}

	public String getTitle() {
		return this.title;
	}

	public Set<AttendedTime> getUserRoleInProject() {
		if (this.userRoleInProject == null) {
			this.userRoleInProject = new HashSet<AttendedTime>();
		}
		return this.userRoleInProject;
	}

	public void setAttendedTimeId(int value) {
		this.attendedTimeId = value;
	}

	public void setComment(String value) {
		this.comment = value;
	}

	public void setDuration(int value) {
		this.duration = value;
	}

	public void setId(int value) {
		this.id = value;
	}

	public void setProjectId(int value) {
		this.projectId = value;
	}

	public void setStart(Date value) {
		this.start = value;
	}

	public void setTitle(String value) {
		this.title = value;
	}

}
