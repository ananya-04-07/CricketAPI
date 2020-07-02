package cricketapi.scoreboard;

public class ScoreBoard {
    ScoreBoardGroupId scoreBoardGroupId;
    private int ininng;
    private int ballNumber;
    private String Strike;
    private  int runHit;

    public int getIninng() {
        return ininng;
    }

    public void setIninng(int ininng) {
        this.ininng = ininng;
    }

    public int getBallNumber() {
        return ballNumber;
    }

    public void setBallNumber(int ballNumber) {
        this.ballNumber = ballNumber;
    }

    public String getStrike() {
        return Strike;
    }

    public void setStrike(String strike) {
        Strike = strike;
    }

    public int getRunHit() {
        return runHit;
    }

    public void setRunHit(int runHit) {
        this.runHit = runHit;
    }
}
