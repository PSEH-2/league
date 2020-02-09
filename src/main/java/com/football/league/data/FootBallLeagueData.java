package com.football.league.data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.football.league.model.Country;
import com.football.league.model.League;
import com.football.league.model.Player;
import com.football.league.model.Standings;

public class FootBallLeagueData {

	private static List<String> countryList = new ArrayList<>();
	private static List<Country> countries = new ArrayList<>();
	private static List<League> leagues = new ArrayList<>();
	private static List<Standings> standings = new ArrayList<>();
	private static Map<String, List<String>> countryLeagues = new HashMap<String, List<String>>();

	static {
		countryList.add("England");
		countryList.add("Italy");
		countryList.add("Spain");
		countryList.add("Germany");
		countryList.add("France");
	}

	static {
		Integer i = 100;
		for (String name : countryList) {
			Country country = new Country();
			country.setCountry_name(name);
			country.setCountry_id(i.toString());
			countries.add(country);
			i++;
		}
	}
	
	static {
		for (Country country : countries) {
			if(country.getCountry_name().equalsIgnoreCase("England"))
				countryLeagues.put(country.getCountry_id(), Arrays.asList("Championship","EFL Cup","EGA Cup"));
			if(country.getCountry_name().equalsIgnoreCase("France"))
				countryLeagues.put(country.getCountry_id(), Arrays.asList("FA Champs","FFL Cup","FGA Cup"));
			if(country.getCountry_name().equalsIgnoreCase("Germany"))
				countryLeagues.put(country.getCountry_id(), Arrays.asList("GER Champs","GFL Cup","GGA Cup"));
			if(country.getCountry_name().equalsIgnoreCase("Spain"))
				countryLeagues.put(country.getCountry_id(), Arrays.asList("SPA Champs","SFL Cup","SGA Cup"));
			if(country.getCountry_name().equalsIgnoreCase("Italy"))
				countryLeagues.put(country.getCountry_id(), Arrays.asList("Itl Champs","IFL Cup","IGA Cup"));
		}
	}
	
	static {
		Integer j = 200;
		for(Country country: countries) {			
			List<String> leaguesList = countryLeagues.get(country.getCountry_id());
			System.out.println(leaguesList);
			for(String leagueName : leaguesList) {
				League league = new League();
				league.setCountry_id(country.getCountry_id());
				league.setCountry_name(country.getCountry_name());
				league.setLeague_id(j.toString());
				league.setLeague_name(leagueName);
				leagues.add(league);
				j++;
			}			
		}
	}
	
	static {
	   try {
		Standings standing1 = new ObjectMapper().readValue("{\r\n" + 
				"    \"country_name\": \"England\",\r\n" + 
				"    \"league_id\": \"202\",\r\n" + 
				"    \"league_name\": \"Premier League\",\r\n" + 
				"    \"team_id\": \"2626\",\r\n" + 
				"    \"team_name\": \"Manchester City\",\r\n" + 
				"    \"overall_league_position\": \"1\",\r\n" + 
				"    \"overall_league_payed\": \"38\",\r\n" + 
				"    \"overall_league_W\": \"32\",\r\n" + 
				"    \"overall_league_D\": \"2\",\r\n" + 
				"    \"overall_league_L\": \"4\",\r\n" + 
				"    \"overall_league_GF\": \"95\",\r\n" + 
				"    \"overall_league_GA\": \"23\",\r\n" + 
				"    \"overall_league_PTS\": \"98\",\r\n" + 
				"    \"home_league_position\": \"1\",\r\n" + 
				"    \"home_league_payed\": \"19\",\r\n" + 
				"    \"home_league_W\": \"18\",\r\n" + 
				"    \"home_league_D\": \"0\",\r\n" + 
				"    \"home_league_L\": \"1\",\r\n" + 
				"    \"home_league_GF\": \"57\",\r\n" + 
				"    \"home_league_GA\": \"12\",\r\n" + 
				"    \"home_league_PTS\": \"54\",\r\n" + 
				"    \"away_league_position\": \"1\",\r\n" + 
				"    \"away_league_payed\": \"19\",\r\n" + 
				"    \"away_league_W\": \"14\",\r\n" + 
				"    \"away_league_D\": \"2\",\r\n" + 
				"    \"away_league_L\": \"3\",\r\n" + 
				"    \"away_league_GF\": \"38\",\r\n" + 
				"    \"away_league_GA\": \"11\",\r\n" + 
				"    \"away_league_PTS\": \"44\"\r\n" + 
				"  }", Standings.class);
		Standings standing2 = new ObjectMapper().readValue("{\r\n" + 
				"    \"country_name\": \"England\",\r\n" + 
				"    \"league_id\": \"203\",\r\n" + 
				"    \"league_name\": \"Premier League\",\r\n" + 
				"    \"team_id\": \"2626\",\r\n" + 
				"    \"team_name\": \"Manchester City\",\r\n" + 
				"    \"overall_league_position\": \"1\",\r\n" + 
				"    \"overall_league_payed\": \"38\",\r\n" + 
				"    \"overall_league_W\": \"32\",\r\n" + 
				"    \"overall_league_D\": \"2\",\r\n" + 
				"    \"overall_league_L\": \"4\",\r\n" + 
				"    \"overall_league_GF\": \"95\",\r\n" + 
				"    \"overall_league_GA\": \"23\",\r\n" + 
				"    \"overall_league_PTS\": \"98\",\r\n" + 
				"    \"home_league_position\": \"1\",\r\n" + 
				"    \"home_league_payed\": \"19\",\r\n" + 
				"    \"home_league_W\": \"18\",\r\n" + 
				"    \"home_league_D\": \"0\",\r\n" + 
				"    \"home_league_L\": \"1\",\r\n" + 
				"    \"home_league_GF\": \"57\",\r\n" + 
				"    \"home_league_GA\": \"12\",\r\n" + 
				"    \"home_league_PTS\": \"54\",\r\n" + 
				"    \"away_league_position\": \"1\",\r\n" + 
				"    \"away_league_payed\": \"19\",\r\n" + 
				"    \"away_league_W\": \"14\",\r\n" + 
				"    \"away_league_D\": \"2\",\r\n" + 
				"    \"away_league_L\": \"3\",\r\n" + 
				"    \"away_league_GF\": \"38\",\r\n" + 
				"    \"away_league_GA\": \"11\",\r\n" + 
				"    \"away_league_PTS\": \"44\"\r\n" + 
				"  }", Standings.class);
		standings.add(standing1);
		standings.add(standing2);
	   } catch(Exception ex) {
		   
	   }
	}
	
	public static List<Standings> getStandings() {
		return standings;
	}

	public static List<Country> getCountries() {
		return countries;
	}
	
	public static List<League> getLeagues() {
		return leagues;
	}

}
