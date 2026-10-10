#include "remove_value.h"

int remove_all_occurrences(int array[], int count, int target) {
    if (array == 0 || count <= 0) {
        return 0;
    }

    int write_idx = 0;
    for (int i = 0; i < count; i++) {
        if (array[i] == target) {
            i++;
        } else {
            array[write_idx++] = array[i];
        }
    }

    return write_idx;
}
