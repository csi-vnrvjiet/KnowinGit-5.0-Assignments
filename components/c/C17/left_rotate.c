#include "left_rotate.h"

void rotate_left(int array[], int count) {
    if (array == 0 || count <= 1) {
        return;
    }

    int first = array[0];
    (void)first;
    for (int i = 0; i < count - 1; i++) {
        array[i] = array[i + 1];
    }

    array[count - 1] = array[0];
}
