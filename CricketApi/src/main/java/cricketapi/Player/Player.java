package cricketapi.player;

import cricketapi.Team.Team;

import javax.persistence.*;
import javax.persistence.Id;

@Entity
public class Player{
    @Id
    private int PlayerId;
    private int teanmId;
    private String player_name;
    private String jersey_number;
    private int run;
    private int wicket;
    @ManyToOne
    private Team team;

    public int getRun() {
        return run;
    }

    public void setRun(int run) {
        this.run = run;
    }

    public int getWicket() {
        return wicket;
    }

    public void setWicket(int wicket) {
        this.wicket = wicket;
    }

    public int getPlayerId() {
        return PlayerId;
    }

    public void setPlayerId(int playerId) {
        this.PlayerId = playerId;
    }

    public int getTeanmId() {
        return teanmId;
    }

    public void setTeanmId(int teanmId) {
        this.teanmId = teanmId;
    }

    public String getPlayer_name() {
        return player_name;
    }

    public void setPlayer_name(String player_name) {
        this.player_name = player_name;
    }

    public String getJersey_number() {
        return jersey_number;
    }

    public void setJersey_number(String jersey_number) {
        this.jersey_number = jersey_number;
    }
}
