package se.kyh.ad10.timeloggers.server.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.FetchType;
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

	@ManyToOne
	@JoinColumn(name = "project_id")
	@Basic(fetch = FetchType.EAGER)
	private Project project;

	@Column(name = "start")
	private Date start;

	@Column(name = "title")
	private String title;

	@ManyToOne
	@JoinColumn(name = "attendedtime_id")
	@Basic(fetch = FetchType.EAGER)
	private AttendedTime attendedTime;

	/*---------------------*/

	public String getComment() {
		return this.comment;
	}

	public int getDuration() {
		return this.duration;
	}

	public int getId() {
		return this.id;
	}

	public AttendedTime getAttendedTime() {
		return attendedTime;
	}

	public void setAttendedTime(AttendedTime attendedTime) {
		this.attendedTime = attendedTime;
	}

	public Date getStart() {
		return this.start;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	public String getTitle() {
		return this.title;
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
	
	public void setStart(Date value) {
		this.start = value;
	}

	public void setTitle(String value) {
		this.title = value;
	}

}
