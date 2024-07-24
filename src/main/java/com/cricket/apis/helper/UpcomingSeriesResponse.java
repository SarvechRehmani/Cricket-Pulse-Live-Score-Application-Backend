
package com.cricket.apis.helper;

import com.cricket.apis.entities.UpcomingSeries;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
@AllArgsConstructor
public class UpcomingSeriesResponse {
    private String msg;
    private List<UpcomingSeries> upcomingSeries;
}
