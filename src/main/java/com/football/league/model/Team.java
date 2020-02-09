package com.football.league.model;

import java.util.List;

public class Team {

	private String team_id;
	private String team_name;
	private String team_key;
	private String team_badge;
	private List<Player> players;
	private List<Coach> coaches;

	public Team() {
		super();
	}	

	
	public List<Coach> getCoaches() {
		return coaches;
	}


	public void setCoaches(List<Coach> coaches) {
		this.coaches = coaches;
	}


	public List<Player> getPlayers() {
		return players;
	}



	public void setPlayers(List<Player> players) {
		this.players = players;
	}



	public String getTeam_key() {
		return team_key;
	}

	public void setTeam_key(String team_key) {
		this.team_key = team_key;
	}

	public String getTeam_badge() {
		return team_badge;
	}

	public void setTeam_badge(String team_badge) {
		this.team_badge = team_badge;
	}

	public String getTeam_id() {
		return team_id;
	}

	public void setTeam_id(String team_id) {
		this.team_id = team_id;
	}

	public String getTeam_name() {
		return team_name;
	}

	public void setTeam_name(String team_name) {
		this.team_name = team_name;
	}

}
