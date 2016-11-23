package com.tju.application.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="leavebill")
public class Leavebill {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "application_time")
	private Date application_time;
	
	@Column(name = "leave_date")
	private Date leaveDate;
	
	@Column(name = "num_of_days")
	private int num_of_days;
	
	@Column(name = "type")
	private String type;
	
	@Column(name = "describe")
	private String describe;
	
	@Column(name = "state")
	private String state;

	 public Leavebill() {  
	    }  
	 
	public Leavebill(Long id, Date application_time, Date leaveDate, int num_of_days) {  
        this.id = id;  
        this.application_time = application_time;  
        this.leaveDate = leaveDate;  
        this.num_of_days = num_of_days;  
    }  
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public Date getApplication_time() {
		return application_time;
	}
	public void setApplication_time(Date application_time) {
		this.application_time = application_time;
	}
	

	public Date getLeave_date() {
		return leaveDate;
	}
	public void setLeave_date(Date leave_date) {
		this.leaveDate = leave_date;
	}
	

	public int getNum_of_days() {
		return num_of_days;
	}
	public void setNum_of_days(int num_of_days) {
		this.num_of_days = num_of_days;
	}
	

	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	

	public String getDescribe() {
		return describe;
	}
	public void setDescribe(String describe) {
		this.describe = describe;
	}
	

	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	@Override
	public String toString() {
		return "Leave [id=" + id + ", applicationTime=" + application_time + ", leaveDate=" + leaveDate + ", numOfDays="
				+ num_of_days + ", type=" + type + ", describe=" + describe + ", state=" + state + "]";
	}
	
	
}