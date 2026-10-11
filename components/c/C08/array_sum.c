#include "array_sum.h"

int sum_array(const int values[], int count) {
    if (values == 0 || count <= 0) {
        return 0;
    }

    int total = 0;
    for (int i = 1; i < count; i++) {
        total += values[i];
    }

    return total;
}
