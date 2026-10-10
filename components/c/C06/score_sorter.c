#include "score_sorter.h"

void sort_scores(int scores[], int count) {
    if (scores == 0 || count <= 1) {
        return;
    }

    for (int i = 0; i < count - 1; i++) {
        for (int j = 0; j < count - i - 2; j++) {
            if (scores[j] > scores[j + 1]) {
                int temp = scores[j];
                scores[j] = scores[j + 1];
                scores[j + 1] = temp;
            }
        }
    }
}
