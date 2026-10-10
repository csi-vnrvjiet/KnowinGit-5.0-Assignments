#include "array_list_insert.h"

int insert_at_index(int array[], int *count, int capacity, int index, int value) {
    if (array == 0 || count == 0 || *count >= capacity) {
        return 0;
    }

    if (index < 0 || index >= *count) {
        return 0;
    }

    for (int i = *count; i > index; i--) {
        array[i] = array[i - 1];
    }

    array[index] = value;
    (*count)++;
    return 1;
}
