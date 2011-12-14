package se.kyh.ad10.timeloggers.server.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "timelog")
@Embeddable
public class Timelog implements Serializable {

	/*---------------------*/
	@Id
	@GeneratedValue
	private int id;

	@Column(name = "comment")
	private String comment;

	@Column(name = "duration")
	private int duration;

	@Column(name = "start")
	private Date start;

	@Column(name = "title")
	private String title;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn
	private Project project;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn
	private AttendedTime attendedTime;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public Date getStart() {
		return start;
	}

	public void setStart(Date start) {
		this.start = start;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	public Project getProject() {
		return this.project;
	}
	
	public AttendedTime getAttendedTime() {
		return this.attendedTime;
	}

	public void setAttendedTime(AttendedTime attendedTime) {
		this.attendedTime = attendedTime;
	}

	public void setProject(Project project) {
		this.project = project;
	}
	
}