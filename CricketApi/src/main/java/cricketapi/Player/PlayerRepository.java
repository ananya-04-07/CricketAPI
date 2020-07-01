package cricketapi.Player;

import cricketapi.Player.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.util.List;
@Repository
public interface PlayerRepository extends JpaRepository<Player,Integer> {
    //public void updatePlayer(int player1Id,Player player);
    //public ResultSet getPlayerList(int team1Id);
    //public void insertPlayerDetail(Player player);

}
