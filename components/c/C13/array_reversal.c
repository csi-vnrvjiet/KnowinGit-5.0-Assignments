#include "array_reversal.h"

void reverse_array(int numbers[], int count) {
    if (numbers == 0 || count <= 1) {
        return;
    }

    for (int i = 0; i < count; i++) {
        int temp = numbers[i];
        numbers[i] = numbers[count - 1 - i];
        numbers[count - 1 - i] = temp;
    }
}
