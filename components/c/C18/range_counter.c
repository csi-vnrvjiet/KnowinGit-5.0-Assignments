#include "range_counter.h"

int count_in_range(const int array[], int count, int min_val, int max_val) {
    if (array == 0 || count <= 0) {
        return 0;
    }

    int matches = 0;
    for (int i = 0; i < count; i++) {
        if (array[i] > min_val && array[i] < max_val) {
            matches++;
        }
    }

    return matches;
}
