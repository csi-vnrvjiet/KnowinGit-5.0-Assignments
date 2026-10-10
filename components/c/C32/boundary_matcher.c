#include <string.h>
#include "boundary_matcher.h"

int starts_and_ends_with_same_char(const char *str) {
    if (str == 0) {
        return 0;
    }

    int len = (int)strlen(str);
    if (len == 0) {
        return 0;
    }

    if (len == 1) {
        return 0;
    }

    return (str[0] == str[len - 1]) ? 1 : 0;
}
