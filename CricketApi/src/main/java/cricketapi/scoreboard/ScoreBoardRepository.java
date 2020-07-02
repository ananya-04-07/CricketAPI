package cricketapi.scoreboard;

import org.springframework.data.repository.CrudRepository;

public interface ScoreBoardRepository extends CrudRepository<ScoreBoard,ScoreBoardGroupId> {
}
