#include "max_index.h"

int find_max_index(const int array[], int count) {
    if (array == 0 || count <= 0) {
        return -1;
    }

    int max_idx = 0;
    for (int i = 1; i < count; i++) {
        if (array[i] > array[max_idx]) {
            max_idx = i;
        }
    }

    return array[max_idx];
}
