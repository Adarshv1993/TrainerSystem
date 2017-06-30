package com.cognizant.entity;



import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name="TRAINER_SCHEDULE")
public class TrainerSchedule {
	
	@Column(name="START_DATE")
	private Date startDate;
	
	@Column(name="DURATION")
	private Integer duration;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="SCHEDULE_ID")
	private Long scheduleId;
	
	

	@Override
	public String toString() {
		return "TrainerSchedule [startDate=" + startDate + ", duration=" + duration + ", scheduleId=" + scheduleId
				+ ", trainer=" + trainer + "]";
	}

	//@JsonBackReference
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name="TRAINER_ID")
	private TrainerDetails trainer;
	
	
	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Integer getDuration() {
		return duration;
	}

	public void setDuration(Integer duration) {
		this.duration = duration;
	}

	public Long getScheduleId() {
		return scheduleId;
	}

	public void setScheduleId(Long scheduleId) {
		this.scheduleId = scheduleId;
	}

	public TrainerDetails getTrainer() {
		return trainer;
	}

	public void setTrainer(TrainerDetails trainer) {
		this.trainer = trainer;
	}

	public TrainerSchedule(Date startDate, Integer duration, Long scheduleId) {
		super();
		this.startDate = startDate;
		this.duration = duration;
		this.scheduleId = scheduleId;
		//this.trainer = trainer;
	}

	public TrainerSchedule() {
	}
	
	
	
}
