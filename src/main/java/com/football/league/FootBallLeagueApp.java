package com.football.league;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages ="com.football.league.**")
public class FootBallLeagueApp {

	public static void main(String[] args) {
		SpringApplication.run(FootBallLeagueApp.class, args);
	}
}
