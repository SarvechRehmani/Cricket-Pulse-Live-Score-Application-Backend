package com.cricket.apis.service;

import com.cricket.apis.entities.Match;
import com.cricket.apis.repositories.MatchRepo;

import java.util.List;
import java.util.Map;

public interface MatchService {
//    Get All Matches
    List<Match> getAllMatches();
//    Get Live Matches
    List<Match> getLiveMatches();
//    List<List<String>> getPointTable();

    public List<List<String>> getCWC2023PointTable();
}
