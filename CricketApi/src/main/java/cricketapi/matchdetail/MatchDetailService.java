package cricketapi.matchdetail;

import cricketapi.MatchUtil;

import javax.persistence.Entity;
import java.sql.PreparedStatement;
import java.sql.Statement;


public class MatchDetailService {
    public static int getDataToMatchDetail() {
        String query = "insert into MatchDetail(Series_id,match_number,team1_id,team2_id,tossWIn,batBallDecision) values (?,?,?,?,?,?)";
       return 0;
    }
}
