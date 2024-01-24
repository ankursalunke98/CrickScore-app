package com.crick.apis.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "crick_matches")
public class Match {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int matchId;

    private String teamHeading;

    private String matchNumberVenue;

    private String battingTeam;

    private String battingTeamScore;

    private String bowlTeam;

    private String bowlTeamScore;

    private String liveText;

    private String matchLink;

    private String textComplete;

    @Enumerated
    private  MatchStatus status;

    private Date date = new Date();

    // Match status according to textComplete

    public void setMatchStatus(){
        if(textComplete.isBlank()){
            this.status = MatchStatus.LIVE;
        }else{
            this.status = MatchStatus.COMPLETED;
        }
    }




}
