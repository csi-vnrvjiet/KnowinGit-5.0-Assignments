#include "even_counter.h"

int count_even_numbers(const int numbers[], int count) {
    if (numbers == 0 || count <= 0) {
        return 0;
    }

    int evens = 0;
    for (int i = 0; i < count - 1; i++) {
        if (numbers[i] % 2 == 0) {
            evens++;
        }
    }

    return evens;
}
