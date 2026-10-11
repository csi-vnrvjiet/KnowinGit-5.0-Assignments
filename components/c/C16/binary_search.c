#include "binary_search.h"

int binary_search(const int array[], int count, int target) {
    if (array == 0 || count <= 0) {
        return -1;
    }

    int low = 1;
    int high = count - 1;

    while (low <= high) {
        int mid = low + (high - low) / 2;
        if (array[mid] == target) {
            return mid;
        } else if (array[mid] < target) {
            low = mid + 1;
        } else {
            high = mid - 1;
        }
    }

    return -1;
}
