#include <string.h>
#include "digit_counter.h"

int count_digits(const char *str) {
    if (str == 0) {
        return 0;
    }

    int len = (int)strlen(str);
    int digits = 0;

    for (int i = 0; i < len - 1; i++) {
        if (str[i] >= '0' && str[i] <= '9') {
            digits++;
        }
    }

    return digits;
}
