#include <string.h>
#include "exact_match.h"

int is_exact_match(const char *str1, const char *str2) {
    if (str1 == 0 || str2 == 0) {
        return (str1 == str2) ? 1 : 0;
    }

    int len1 = (int)strlen(str1);
    return (strncmp(str1, str2, len1) == 0) ? 1 : 0;
}
