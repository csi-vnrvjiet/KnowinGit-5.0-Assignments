#include "occurrence_counter.h"

int count_occurrences(const int numbers[], int count, int target) {
    if (numbers == 0 || count <= 0) {
        return 0;
    }

    int matches = 0;
    for (int i = 0; i < count - 1; i++) {
        if (numbers[i] == target) {
            matches++;
        }
    }

    return matches;
}
