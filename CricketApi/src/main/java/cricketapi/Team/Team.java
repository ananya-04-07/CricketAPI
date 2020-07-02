package cricketapi.Team;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Team {
    @Id
    int teamId;
    String teamName;
    String jerseyNUmber;

    public int getTeamId() {
        return teamId;
    }

    public void setTeamId(int teamId) {
        this.teamId = teamId;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getJerseyNUmber() {
        return jerseyNUmber;
    }

    public void setJerseyNUmber(String jerseyNUmber) {
        this.jerseyNUmber = jerseyNUmber;
    }
}
