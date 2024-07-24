package com.cricket.apis.service.imple;

import com.cricket.apis.entities.UpcomingMatch;
import com.cricket.apis.entities.UpcomingSeries;
import com.cricket.apis.helper.UpcomingSeriesResponse;
import com.cricket.apis.service.UpcomingSeriesService;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class UpcomingSeriesServiceImpl implements UpcomingSeriesService {
    @Override
    public UpcomingSeriesResponse getAllUpcomingSeries() {
        List<UpcomingSeries> upcomingSeries = new ArrayList<>();

        try{
            String url = "https://www.cricbuzz.com/cricket-match/live-scores/upcoming-matches";
            Document document = Jsoup.connect(url).get();

//            Elements upcomingSeriesElements = document.select("div.cb-col.cb-col-100.cb-rank-tabs");

            Elements upcomingSeriesElements = document.select("div.cb-col.cb-col-100.cb-plyr-tbody.cb-rank-hdr.cb-lv-main");
            for(Element series : upcomingSeriesElements){
                String seriesHeading = series.select("h2.cb-lv-grn-strip.text-bold.cb-lv-scr-mtch-hdr").select("a").text();
                Elements matches = series.select("div.cb-col-100.cb-col.cb-schdl.cb-billing-plans-text");
                List<UpcomingMatch> upcomingMatches = new ArrayList<>();
                for (Element match: matches){
                    Elements matchDetail = match.select("div");

                    String matchHeading = matchDetail.select("h3.cb-lv-scr-mtch-hdr.inline-block").select("a").text();
                    String dateTimeVenue = matchDetail.select("div.text-gray").select("span").text();
                    String matchNumber = matchDetail.select("span.text-gray").text();

                    UpcomingMatch match1 = new UpcomingMatch(matchHeading,matchNumber,dateTimeVenue);
                    upcomingMatches.add(match1);
                }

                UpcomingSeries upcomingSeries1 = new UpcomingSeries();
                upcomingSeries1.setSeries(seriesHeading);
                upcomingSeries1.setMatches(upcomingMatches);

                upcomingSeries.add(upcomingSeries1);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
            return new UpcomingSeriesResponse("Error in fetching upcoming Series.",upcomingSeries);
        }
        if(upcomingSeries.isEmpty()){
            return new UpcomingSeriesResponse("No upcoming series is available.",upcomingSeries);
        }
        return new UpcomingSeriesResponse("Fetched upcoming Series.",upcomingSeries);
    }
}
