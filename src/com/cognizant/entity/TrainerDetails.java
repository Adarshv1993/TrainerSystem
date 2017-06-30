package com.cognizant.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name="TRAINER_DETAILS")
public class TrainerDetails {
	@Id
	@Column(name = "TRAINER_ID")
	private Long trainerId;
	
	@Column(name = "TRAINER_NAME")
	private String trainerName;
	
	@Column(name = "DOMAIN")
	private String domain;
	
	@Column(name = "COLLEGE_NAME")
	private String collegeName;

	
	@OneToMany(mappedBy = "trainer", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	//@JsonBackReference
	private List<TrainerSchedule> schedule;

	public Long getTrainerId() {
		return trainerId;
	}

	public void setTrainerId(Long trainerId) {
		this.trainerId = trainerId;
	}

	public String getTrainerName() {
		return trainerName;
	}

	public void setTrainerName(String trainerName) {
		this.trainerName = trainerName;
	}

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	
	
	public List<TrainerSchedule> getSchedule() {
		return schedule;
	}

	public void setSchedule(List<TrainerSchedule> schedule) {
		this.schedule = schedule;
	}

	public  TrainerDetails(){}
	
	public TrainerDetails(Long trainerId, String trainerName, String domain, String collegeName,List<TrainerSchedule> schedule) {
		super();
		this.trainerId = trainerId;
		this.trainerName = trainerName;
		this.domain = domain;
		this.collegeName = collegeName;
		this.schedule=schedule;
	}
	
	
}
