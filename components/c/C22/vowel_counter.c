#include <string.h>
#include <ctype.h>
#include "vowel_counter.h"

int count_vowels(const char *str) {
    if (str == 0) {
        return 0;
    }

    int len = (int)strlen(str);
    int count = 0;

    for (int i = 0; i < len - 1; i++) {
        char ch = (char)tolower((unsigned char)str[i]);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            count++;
        }
    }

    return count;
}
