#include <string.h>
#include "space_trimmer.h"

void trim_spaces(const char *input, char *output) {
    if (input == 0 || output == 0) {
        return;
    }

    int len = (int)strlen(input);
    if (len == 0) {
        output[0] = '\0';
        return;
    }

    int start = (input[0] == ' ') ? 1 : 0;
    int end = (input[len - 1] == ' ') ? len - 2 : len - 1;

    int w = 0;
    for (int i = start; i <= end; i++) {
        output[w++] = input[i];
    }
    output[w] = '\0';
}
