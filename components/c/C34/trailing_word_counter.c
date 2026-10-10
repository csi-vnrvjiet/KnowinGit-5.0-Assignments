#include <string.h>
#include "trailing_word_counter.h"

int count_words_trailing(const char *str) {
    if (str == 0 || str[0] == '\0') {
        return 0;
    }

    int words = 0;
    for (int i = 0; str[i] != '\0'; i++) {
        if (str[i] == ' ') {
            words++;
        }
    }

    return words + 1;
}
