package cricketapi;

public class Query {
    final public static String PLAYERUPDATEQUERY = "update Player set team_id = ? where PlayerId = ?";
    final public static String INSERTPLAYER = "insert into Player(team_id,player_name,jersey_number) values (?,?,?)";
    final public static String GETPLAYERDATAQUERY = "select playerId from Player where team_id = ? ";

}
