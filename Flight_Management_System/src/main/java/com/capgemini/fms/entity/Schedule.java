package com.capgemini.fms.entity;
import java.time.LocalDateTime;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name ="schedule")
@DynamicUpdate(true)
@DynamicInsert(true)

public class Schedule {
	@Id
	private int schedule_id;
	@ManyToOne
    @JoinColumn(name="airport_code",nullable=false)
    private Airport sourceAirport;
	@ManyToOne
    @JoinColumn(name="airport_name",nullable=false)
    private Airport destinationAirport;
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
	   private LocalDateTime arrivalTime;
	 @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
	   private LocalDateTime departureTime;
	public int getSchedule_id() {
		return schedule_id;
	}
	public void setSchedule_id(int schedule_id) {
		this.schedule_id = schedule_id;
	}
	public Airport getSourceAirport() {
		return sourceAirport;
	}
	public void setSourceAirport(Airport sourceAirport) {
		this.sourceAirport = sourceAirport;
	}
	public Airport getDestinationAirport() {
		return destinationAirport;
	}
	public void setDestinationAirport(Airport destinationAirport) {
		this.destinationAirport = destinationAirport;
	}
	public LocalDateTime getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(LocalDateTime arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	public LocalDateTime getDepartureTime() {
		return departureTime;
	}
	public void setDepartureTime(LocalDateTime departureTime) {
		this.departureTime = departureTime;
	}
	public Schedule(int schedule_id, Airport sourceAirport, Airport destinationAirport, LocalDateTime arrivalTime,
			LocalDateTime departureTime) {
		super();
		this.schedule_id = schedule_id;
		this.sourceAirport = sourceAirport;
		this.destinationAirport = destinationAirport;
		this.arrivalTime = arrivalTime;
		this.departureTime = departureTime;
	}
	public Schedule() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Schedule [schedule_id=" + schedule_id + ", sourceAirport=" + sourceAirport + ", destinationAirport="
				+ destinationAirport + ", arrivalTime=" + arrivalTime + ", departureTime=" + departureTime + "]";
	}

	
	
	
	
	
	
}