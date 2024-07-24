package com.cricket.apis.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class UpcomingMatch {
    private String matchHeading;
    private String matchNumber;
    private String dateTimeVenue;
}
