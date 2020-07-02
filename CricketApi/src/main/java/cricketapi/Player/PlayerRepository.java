package cricketapi.player;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface PlayerRepository extends CrudRepository<Player,Integer> {
    public List<Player> findByTeamId(int teamId);
    public int countByTeamId(int teamId);

}
