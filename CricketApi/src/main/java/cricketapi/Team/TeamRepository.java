package cricketapi.Team;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TeamRepository extends CrudRepository<Team,Integer> {

    public List<Team> findByTeamId(int teamId);
    public List<Team> findByTeamName(String teanName);

}
