package cricketapi.matchdetail;

public class MatchDetail {
    private String seriesId;
    private int matchNumber;
    private int team1Id;
    private int team2Id;
    private String tossWinn;
    private String batBallDecision;
    private int team1Score;
    private int team2Score;

    public String getSeriesId() {
        return seriesId;
    }

    public void setSeriesId(String seriesId) {
        this.seriesId = seriesId;
    }

    public int getMatchNumber() {
        return matchNumber;
    }

    public void setMatchNumber(int matchNumber) {
        this.matchNumber = matchNumber;
    }

    public int getTeam1Id() {
        return team1Id;
    }

    public void setTeam1Id(int team1Id) {
        this.team1Id = team1Id;
    }

    public int getTeam2Id() {
        return team2Id;
    }

    public void setTeam2Id(int team2Id) {
        this.team2Id = team2Id;
    }

    public String getTossWinn() {
        return tossWinn;
    }

    public void setTossWinn(String tossWinn) {
        this.tossWinn = tossWinn;
    }

    public String getBatBallDecision() {
        return batBallDecision;
    }

    public void setBatBallDecision(String batBallDecision) {
        this.batBallDecision = batBallDecision;
    }

    public int getTeam1Score() {
        return team1Score;
    }

    public void setTeam1Score(int team1Score) {
        this.team1Score = team1Score;
    }

    public int getTeam2Score() {
        return team2Score;
    }

    public void setTeam2Score(int team2Score) {
        this.team2Score = team2Score;
    }
}
