package cricketapi.matchdetail;


public class MatchDetailService {
    public static int getDataToMatchDetail() {
        String query = "insert into MatchDetail(Series_id,match_number,team1_id,team2_id,tossWIn,batBallDecision) values (?,?,?,?,?,?)";
       return 0;
    }
}
