package com.football.league.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.football.league.data.FootBallLeagueData;
import com.football.league.model.Country;
import com.football.league.model.League;
import com.football.league.model.Standings;
import com.football.league.model.StandingsResponse;

@RestController
public class FootBallLeagueController {

	@GetMapping(path = "/hello", produces = "application/json")
	public @ResponseBody String getBook() {
		return "Hello from Foot Ball League App";
	}

	@GetMapping(path = "/", produces = "application/json")
	public @ResponseBody Object getActions(@RequestParam(name="action", required=true) String action,
			@RequestParam(name="APIKEY", required=true) String apikey,
			@RequestParam(name="country_id", required=false) String country_id,
			@RequestParam(name="league_id", required=false) String league_id) {
		if(!apikey.equalsIgnoreCase("9bb66184e0c8145384fd2cc0f7b914ada57b4e8fd2e4d6d586adcc27c257a978"))
			return "Invalid APIKEY provided.";
		if(action.equalsIgnoreCase("get_countries"))
			return getCountries();
		if(action.equalsIgnoreCase("get_leagues"))
			return getLeagues(country_id);
		if(action.equalsIgnoreCase("get_standings"))
			return getStandings(league_id);
		return "Hello from Foot Ball League App";
	}
	
	private List<Country> getCountries() {
		List<Country> countryList = FootBallLeagueData.getCountries();
		return countryList;
	}
	
	private List<StandingsResponse> getStandings(String id) {
		List<StandingsResponse> standingResponse = new ArrayList<>();;
		List<Standings> standings = FootBallLeagueData.getStandings();
		if(id != null && !id.isEmpty())
			standings = standings.stream().filter(l ->l.getLeague_id().equals(id)).collect(Collectors.toList());
		for(Standings standing : standings) {
			StandingsResponse res = new StandingsResponse();
			res.setCountry_name(standing.getCountry_name());
			res.setLeague_id(standing.getLeague_id());
			res.setLeague_name(standing.getLeague_name());
			res.setTeam_id(standing.getTeam_id());
			res.setTeam_name(standing.getTeam_name());
			res.setOverAllLeaguePosition(standing.getOverall_league_position());
			standingResponse.add(res);
		}
		return standingResponse;
	}
	
	private List<League> getLeagues(String id) {
		List<League> league = FootBallLeagueData.getLeagues();
		if(id != null && !id.isEmpty())
			league = league.stream().filter(l -> l.getCountry_id().equals(id)).collect(Collectors.toList());
		return league;
	}
	
}
