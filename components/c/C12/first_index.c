#include "first_index.h"

int find_first_index(const int numbers[], int count, int target) {
    if (numbers == 0 || count <= 0) {
        return -1;
    }

    int match_idx = -1;
    for (int i = 0; i < count; i++) {
        if (numbers[i] == target) {
            match_idx = i;
        }
    }

    return match_idx;
}
