package com.football.league.model;

import java.util.List;

public class Coach {

	private String coach_name;
	private String coach_country;
	private int coach_age;

	public Coach() {
		super();
	}

	public String getCoach_name() {
		return coach_name;
	}

	public void setCoach_name(String coach_name) {
		this.coach_name = coach_name;
	}

	public String getCoach_country() {
		return coach_country;
	}

	public void setCoach_country(String coach_country) {
		this.coach_country = coach_country;
	}

	public int getCoach_age() {
		return coach_age;
	}

	public void setCoach_age(int coach_age) {
		this.coach_age = coach_age;
	}

}
