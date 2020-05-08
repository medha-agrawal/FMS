package com.capgemini.fms.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

@Entity
@Table(name ="schedule")
@DynamicUpdate(true)
@DynamicInsert(true)

public class Schedule {

@NotEmpty(message="Enter source Airport")
@Id
@Size(min=3, max=25, message="source name is either short or exceeding the ")
@Column(name="sourceAirport")
private String sourceAirport;

@NotEmpty(message="Enter destination Airport")
@Size(min=3, max=25, message="source name is either short or exceeding the ")
@Column(name="destinationAirport")
private String destinationAirport;

@NotEmpty(message="Enter the Arrival Time")
@Column(name="arrival_Time")
private String arrival_Time;

@NotEmpty(message="Enter the Departure Time")
@Column(name="departure_Time")
private String departure_Time;

public String getSourceAirport() {
return sourceAirport;
}
public void setSourceAirport(String sourceAirport) {
this.sourceAirport = sourceAirport;
}
public String getDestinationAirport() {
return destinationAirport;
}
public void setDestinationAirport(String destinationAirport) {
this.destinationAirport = destinationAirport;
}
public String getArrival_Time() {
return arrival_Time;
}
public void setArrival_Time(String arrival_Time) {
this.arrival_Time = arrival_Time;
}
public String getDeparture_Time() {
return departure_Time;
}
public void setDeparture_Time(String departure_Time) {
this.departure_Time = departure_Time;
}

public Schedule (String sourceAirport, String destinationAirport, String arrival_Time, String departure_Time)
{
super();
this.sourceAirport = sourceAirport;
this.destinationAirport = destinationAirport;
this.arrival_Time = arrival_Time;
this.departure_Time = departure_Time;
}
public Schedule() {
super();
}
@Override
public String toString() {
return "Schedule[ sourceAirport= " +sourceAirport+ ", destinationAirport= " +destinationAirport+ ", arrival_Time= " +arrival_Time+ ", departure_Time= " +departure_Time+ "]";

}
}
