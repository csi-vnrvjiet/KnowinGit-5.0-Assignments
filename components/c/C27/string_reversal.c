#include <string.h>
#include "string_reversal.h"

void reverse_string(char *str) {
    if (str == 0) {
        return;
    }

    int len = (int)strlen(str);
    for (int i = 0; i < len; i++) {
        char temp = str[i];
        str[i] = str[len - 1 - i];
        str[len - 1 - i] = temp;
    }
}
