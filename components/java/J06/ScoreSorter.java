public class ScoreSorter {
    public static void sortScores(int[] scores) {
        if (scores == null || scores.length <= 1) {
            return;
        }

        for (int i = 0; i < scores.length - 1; i++) {
            for (int j = 0; j < scores.length - i - 2; j++) {
                if (scores[j] > scores[j + 1]) {
                    int temp = scores[j];
                    scores[j] = scores[j + 1];
                    scores[j + 1] = temp;
                }
            }
        }
    }
}
