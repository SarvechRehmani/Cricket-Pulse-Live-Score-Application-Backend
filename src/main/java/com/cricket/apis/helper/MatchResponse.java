package com.cricket.apis.helper;

import com.cricket.apis.entities.Match;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class MatchResponse {
    private String msg;
    private List<Match> matchList;


}
