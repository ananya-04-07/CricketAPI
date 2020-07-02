package cricketapi.scoreboard;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class ScoreBoardGroupId implements Serializable {
    private int matchId;
    private String seriesId;
}
