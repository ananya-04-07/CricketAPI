package cricketapi.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;

@Service
public class PlayerService {
    @Autowired
    private PlayerRepository playerRepositoryImp;

    public void getplayer(int playerId)
    {
        //ResultSet resultSet = playerRepositoryImp.getPlayerList(4);

    }
}
