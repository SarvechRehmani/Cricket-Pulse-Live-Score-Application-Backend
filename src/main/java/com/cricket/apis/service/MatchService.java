package com.cricket.apis.service;

import com.cricket.apis.entities.Match;
import com.cricket.apis.helper.MatchResponse;
import com.cricket.apis.repositories.MatchRepo;

import java.util.List;
import java.util.Map;

public interface MatchService {
//    Get All Matches
    MatchResponse getAllMatches();
//    Get Live Matches
    MatchResponse getLiveMatches();
//    List<List<String>> getPointTable();

    public List<List<String>> getCWC2023PointTable();
}
