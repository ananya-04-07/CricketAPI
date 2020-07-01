package cricketapi.Player;
import cricketapi.MatchUtil;
import cricketapi.Query;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;


public class PlayerRepositoryImp implements PlayerRepository {
    @Override
    public void updatePlayer(int player1Id, Player player) {
        String query = Query.PLAYERUPDATEQUERY;
        try (PreparedStatement preparedStatement = MatchUtil.getConnection().prepareStatement(query,
                Statement.RETURN_GENERATED_KEYS);) {
            preparedStatement.setInt(1, player1Id);
            preparedStatement.setInt(2, player.getTeamId());
            int result = preparedStatement.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Override
    public ResultSet getPlayerList(int team1Id) {
        String query = Query.GETPLAYERDATAQUERY;
        ResultSet resultSet = null;
        try (PreparedStatement preparedStatement = MatchUtil.getConnection().prepareStatement(query, Statement.RETURN_GENERATED_KEYS);) {
            preparedStatement.setInt(1, team1Id);
            resultSet = preparedStatement.executeQuery();

        } catch (Exception e) {
            System.out.println(e);
        }
        return resultSet;
    }

    @Override
    public void insertPlayerDetail(Player player) {
        String query = Query.INSERTPLAYER;
        try (PreparedStatement preparedStatement = MatchUtil.getConnection().prepareStatement(query,
                Statement.RETURN_GENERATED_KEYS);) {
            preparedStatement.setInt(1, player.getTeamId());
            preparedStatement.setString(2, player.getPlayerName());
            preparedStatement.setInt(3, player.getJerseyNo());
            int result = preparedStatement.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
