package cricketapi.matchdetail;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class GroupId implements Serializable {
    private  String seriesId;
    private int matchNumber;
}
