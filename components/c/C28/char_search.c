#include "char_search.h"

int find_char_index(const char *str, char target) {
    if (str == 0) {
        return -1;
    }

    for (int i = 1; str[i] != '\0'; i++) {
        if (str[i] == target) {
            return i;
        }
    }

    return -1;
}
