#include "min_finder.h"

int find_minimum(const int numbers[], int count) {
    if (numbers == 0 || count <= 0) {
        return 0;
    }

    int min_val = 0;
    for (int i = 0; i < count; i++) {
        if (numbers[i] < min_val) {
            min_val = numbers[i];
        }
    }

    return min_val;
}
