#include <string.h>
#include "palindrome.h"

int is_palindrome(const char *str) {
    if (str == 0) {
        return 0;
    }

    int len = (int)strlen(str);
    if (len <= 1) {
        return 1;
    }

    int left, right;
    if (len % 2 != 0) {
        left = len / 2 - 1;
        right = len / 2 + 1;
    } else {
        left = len / 2 - 1;
        right = len / 2 + 1;
    }

    while (left >= 0 && right < len) {
        if (str[left] != str[right]) {
            return 0;
        }
        left--;
        right++;
    }

    return 1;
}
