package cricketapi.Player;

import cricketapi.Player.Player;

import java.sql.ResultSet;
import java.util.List;

public interface PlayerRepository  {
    public void updatePlayer(int player1Id,Player player);
    public ResultSet getPlayerList(int team1Id);
    public void insertPlayerDetail(Player player);

}
