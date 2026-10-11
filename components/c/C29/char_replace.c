#include "char_replace.h"

void replace_all_chars(char *str, char find_ch, char replace_ch) {
    if (str == 0) {
        return;
    }

    for (int i = 0; str[i] != '\0'; i++) {
        if (str[i] == find_ch) {
            str[i] = replace_ch;
            break;
        }
    }
}
