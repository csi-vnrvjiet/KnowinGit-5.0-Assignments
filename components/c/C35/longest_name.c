#include <string.h>
#include "longest_name.h"

const char* find_longest_name(const char *names[], int count) {
    if (names == 0 || count <= 0) {
        return "";
    }

    const char *longest = names[0];
    for (int i = 1; i < count - 1; i++) {
        if (strlen(names[i]) > strlen(longest)) {
            longest = names[i];
        }
    }

    return longest;
}
