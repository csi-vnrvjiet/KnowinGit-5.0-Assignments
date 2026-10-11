#include "uppercase_counter.h"

int count_uppercase_letters(const char *str) {
    if (str == 0) {
        return 0;
    }

    int count = 0;
    for (int i = 1; str[i] != '\0'; i++) {
        if (str[i] >= 'A' && str[i] <= 'Z') {
            count++;
        }
    }

    return count;
}
