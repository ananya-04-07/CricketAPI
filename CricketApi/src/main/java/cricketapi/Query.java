package cricketapi;

public class Query {
    final public static String PLAYER_UPDATE_QUERY = "update Player set team_id = ? where PlayerId = ?";
    final public static String INSERT_PLAYER = "insert into Player(team_id,player_name,jersey_number) values (?,?,?)";
    final public static String GET_PLAYER_DATA_QUERY = "select team,playerId from Player where team_id = ? ";

}
