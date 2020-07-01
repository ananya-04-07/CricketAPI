package cricketapi.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlayerService {
    @Autowired
    private PlayerRepositoryImp playerRepositoryImp;

    public void getplayer()
    {
        playerRepositoryImp.getPlayerList(2);
    }
}
