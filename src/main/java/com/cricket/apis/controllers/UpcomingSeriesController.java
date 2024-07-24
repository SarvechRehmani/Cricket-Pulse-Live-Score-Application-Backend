package com.cricket.apis.controllers;

import com.cricket.apis.helper.UpcomingSeriesResponse;
import com.cricket.apis.service.UpcomingSeriesService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/upcoming-matches")
public class UpcomingSeriesController {

    private UpcomingSeriesService upcomingSeriesService;

    public UpcomingSeriesController(UpcomingSeriesService upcomingSeriesService) {
        this.upcomingSeriesService = upcomingSeriesService;
    }

    @GetMapping
    public ResponseEntity<UpcomingSeriesResponse> getAllUpcomingSeries(){
        return new ResponseEntity<>(this.upcomingSeriesService.getAllUpcomingSeries(), HttpStatus.OK);
    }
}
