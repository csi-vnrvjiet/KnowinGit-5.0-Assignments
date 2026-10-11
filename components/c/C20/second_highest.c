#include <limits.h>
#include "second_highest.h"

int find_second_highest(const int array[], int count) {
    if (array == 0 || count < 2) {
        return -1;
    }

    int first = INT_MIN;
    int second = INT_MIN;

    for (int i = 0; i < count; i++) {
        if (array[i] > first) {
            second = first;
            first = array[i];
        } else if (array[i] >= second) {
            second = array[i];
        }
    }

    return (second == INT_MIN) ? -1 : second;
}
