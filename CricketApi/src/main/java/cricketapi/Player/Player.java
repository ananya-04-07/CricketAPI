package cricketapi.Player;

import org.springframework.data.annotation.*;

import javax.persistence.*;
import javax.persistence.Id;

@Entity
@Table(name = "Player",schema = "Cricket")
public class Player {
    @Id
    @Column
    //@GeneratedValue(strategy = GenerationType.AUTO)
    private int PlayerId;
    @Column
    private int team_id;
    @Column
    private String player_name;
    @Column
    private String jersey_number;
    @Column
    private int run;
    @Column
    private int wicket;

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

    public int getTeam_id() {
        return team_id;
    }

    public void setTeam_id(int team_id) {
        this.team_id = team_id;
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
