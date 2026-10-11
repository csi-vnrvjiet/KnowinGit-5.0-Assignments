#include "letter_counter.h"

int count_letters_only(const char *str) {
    if (str == 0) {
        return 0;
    }

    int count = 0;
    for (int i = 0; str[i] != '\0'; i++) {
        if (str[i] != ' ') {
            count++;
        }
    }

    return count;
}
