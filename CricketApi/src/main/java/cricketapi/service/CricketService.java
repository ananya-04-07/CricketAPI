package cricketapi.service;
import cricketapi.Team.Team;
import cricketapi.Team.TeamRepository;
import cricketapi.matchdetail.MatchDetail;
import cricketapi.matchdetail.MatchDetailRepository;
import cricketapi.player.PlayerRepository;
import cricketapi.seriesdetail.SeriesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class CricketService {
    private int team1Id;
    private int team2Id;
    private String series_id;
    @Autowired
    private PlayerRepository playerRepository;
    @Autowired
    private SeriesRepository seriesRepository;
    @Autowired
    private TeamRepository teamRepository;
    @Autowired
    private MatchDetailRepository matchDetailRepository;

    public void MatchStart(int matchNum, Duo duo) {
        int tossWinningTeam = ServiceUtil.toss(team1Id, team2Id);
        String batOrBall = ServiceUtil.batOrBallDecision();
        int temp;
        if (ServiceUtil.swapDecision(tossWinningTeam, team1Id, team2Id, batOrBall)) {
            temp = team1Id;
            team1Id = team2Id;
            team2Id = temp;
        }
        MatchDetail matchDetail = new MatchDetail();
        matchDetail.setSeriesId(duo.getSeries().getSeriesId());
        matchDetail.setMatchNumber(matchNum);
        matchDetail.setTeam1Id(team1Id);
        matchDetail.setTeam2Id(team2Id);
        String tossWinning = teamRepository.findByTeamId(tossWinningTeam).get(0).getTeamName();
        matchDetail.setTossWinn(tossWinning);
        matchDetail.setBatBallDecision(batOrBall);
        matchDetailRepository.save(matchDetail);
        }

    public boolean checkForValidTeamId(int team1Id,int team2Id) {
        List<Team> lst1 = new ArrayList<>();
        teamRepository.findByTeamId(team1Id).forEach(lst1 :: add);
        List<Team> lst2 = new ArrayList<>();
        teamRepository.findByTeamId(team2Id).forEach(lst2 :: add);
        return lst1.contains(team1Id) && lst2.contains(team2Id);
    }

    public void addService(Duo duo) {
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        Date dt = new Date();
        series_id = formatter.format(dt);
        duo.getSeries().setSeriesId(series_id);
        seriesRepository.save(duo.getSeries());
        team1Id = duo.getTeam1Id();
        team2Id = duo.getTeam2Id();
        if (!checkForValidTeamId(team1Id,team2Id ) || team1Id == team2Id) {
            System.exit(1);
        }
        for (int i = 1; i <= duo.getSeries().getNumbOfMatch(); i++) {
            System.out.println(i + "  " + "Match Starts");
            MatchStart(i,duo);
            System.out.println("Match END");
            System.out.println("Score of Match");
        }


    }
}

