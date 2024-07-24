package com.cricket.apis.entities;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class UpcomingSeries {
    private String series;
    private List<UpcomingMatch> matches;

}
