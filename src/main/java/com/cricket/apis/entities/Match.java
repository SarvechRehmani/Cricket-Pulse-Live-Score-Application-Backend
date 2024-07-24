package com.cricket.apis.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Table(name = "CricketMatch")
@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
public class Match {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int matchId;
    private String teamHeading;
    private String matchNumberVenue;
    private String battingTeam;
    private String battingTeamScore;
    private String bowlingTeam;
    private String bowlingTeamScore;
    private String liveText;
    private String textComplete;
    private String matchLink;
    @Enumerated
    private MatchStatus status;
    private Date date=new Date();

//    Set match status according to MatchStatus
    public void setMatchStatus(){
        this.status = textComplete.isBlank() ? MatchStatus.LIVE :  MatchStatus.COMPLETED;
    }

}
