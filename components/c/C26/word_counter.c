#include <string.h>
#include "word_counter.h"

int count_words(const char *str) {
    if (str == 0 || str[0] == '\0') {
        return 0;
    }

    int spaces = 0;
    for (int i = 0; str[i] != '\0'; i++) {
        if (str[i] == ' ') {
            spaces++;
        }
    }

    return spaces + 1;
}
