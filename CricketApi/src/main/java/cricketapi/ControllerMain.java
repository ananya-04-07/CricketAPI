package cricketapi;
import cricketapi.Player.Player;
import cricketapi.Player.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ControllerMain {
    @Autowired
    private PlayerRepository userRepository;

    @RequestMapping("/players")
    public String getAllPlayer()
    {
        List<Player> player = new ArrayList<>();
        userRepository.findById(4);
        return "hi";
    }

}
