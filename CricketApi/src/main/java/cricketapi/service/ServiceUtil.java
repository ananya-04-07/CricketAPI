package cricketapi.service;
import cricketapi.Constants;
import java.util.Random;

public class ServiceUtil {
    private final static Random rand = new Random();

    public static int getRandomNumber(int range) {
        int t1 = rand.nextInt(range);
        return t1;
    }

    public static int binarySearch(int prefixArray[], int rand_number, int lowerIndex, int upperIndex) {
        int mid;
        while (lowerIndex < upperIndex) {
            mid = lowerIndex + ((upperIndex - lowerIndex) >> 1);
            if (rand_number > prefixArray[mid])
                lowerIndex = mid + 1;
            else
                upperIndex = mid;
        }
        return (prefixArray[lowerIndex] >= rand_number) ? lowerIndex : -1;
    }

    public static String batOrBallDecision() {
        int rand_no = getRandomNumber(2);
        if (rand_no == 0)
            return Constants.BATTING;
        else
            return Constants.BALLING;
    }

    public static int toss(int team1, int team2) {
        int rand_no = getRandomNumber(2);
        if (rand_no == 0)
            return team1;
        else
            return team2;

    }
    public static int getRun() {
        int runNo[] = {0, 1, 2, 3, 4, 5, 6, 7};
        int probabilityOfRun[] = {20, 20, 10, 5, 10, 5, 5, 5};
        int size = runNo.length;
        int prefix[] = new int[size], i;
        prefix[0] = probabilityOfRun[0];
        for (i = 1; i < size; ++i)
            prefix[i] = prefix[i - 1] + probabilityOfRun[i];
        int rand_num = ((int) (Math.random() * (323567)) % prefix[size - 1]) + 1;
        int index = binarySearch(prefix, rand_num, 0, size - 1);
        return runNo[index];
    }

    public static boolean swapDecision(int tossWinningTeam, int team1Id, int team2Id, String batOrBall) {
        return (tossWinningTeam == team1Id && Constants.BALLING.equalsIgnoreCase(batOrBall) || tossWinningTeam == team2Id && Constants.BATTING.equalsIgnoreCase(batOrBall));
    }

}
