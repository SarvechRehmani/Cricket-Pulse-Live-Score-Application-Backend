package com.cricket.apis.repositories;

import com.cricket.apis.entities.Match;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MatchRepo extends JpaRepository<Match, Integer> {
//    Fetch match by providing team name.
    Optional<Match> findByTeamHeading(String teamHeading);
}
