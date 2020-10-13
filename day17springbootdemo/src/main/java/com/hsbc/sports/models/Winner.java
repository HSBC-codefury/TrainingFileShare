package com.hsbc.sports.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TENNIS")
public class Winner {
	
	@Id
	@Column
	private int tennisId;
	public int getTennisId() {
		return tennisId;
	}
	public void setTennisId(int tennisId) {
		this.tennisId = tennisId;
	}
	@Column(name="TOURNAMENT_ID")
	private String tournamnetId;
	@Column(name="TOURNAMENT_NAME")
	private String location;
	@Column(name="T_DATE")
	private String date;
	@Column(name="MATCH_NUMBER")
	private int matchNo;
	@Column(name="WINNER_NAME")
	private String winnerName;
	
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	public String getTournamnetId() {
		return tournamnetId;
	}
	public void setTournamnetId(String tournamnetId) {
		this.tournamnetId = tournamnetId;
	}
	public int getMatchNo() {
		return matchNo;
	}
	public void setMatchNo(int matchNo) {
		this.matchNo = matchNo;
	}
	public String getWinnerName() {
		return winnerName;
	}
	public void setWinnerName(String winnerName) {
		this.winnerName = winnerName;
	}
}
