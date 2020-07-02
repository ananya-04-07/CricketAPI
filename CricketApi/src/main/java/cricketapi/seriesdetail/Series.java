package cricketapi.seriesdetail;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Series {
    @Id
    private String seriesId;
    private String seriesName;
    private int numbOfMatch;
    private int overNumb;

    public String getSeriesId() {
        return seriesId;
    }

    public void setSeriesId(String seriesId) {
        this.seriesId = seriesId;
    }

    public String getSeriesName() {
        return seriesName;
    }

    public void setSeriesName(String seriesName) {
        this.seriesName = seriesName;
    }

    public int getNumbOfMatch() {
        return numbOfMatch;
    }

    public void setNumbOfMatch(int numbOfMatch) {
        this.numbOfMatch = numbOfMatch;
    }

    public int getOverNumb() {
        return overNumb;
    }

    public void setOverNumb(int overNumb) {
        this.overNumb = overNumb;
    }
}
