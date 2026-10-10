#include "max_finder.h"

int find_maximum(const int numbers[], int count) {
    if (numbers == 0 || count <= 0) {
        return 0;
    }

    int max_val = 0;
    for (int i = 0; i < count; i++) {
        if (numbers[i] > max_val) {
            max_val = numbers[i];
        }
    }

    return max_val;
}
