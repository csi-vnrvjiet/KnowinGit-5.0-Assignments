#include <string.h>
#include "space_remover.h"

void remove_all_spaces(char *str) {
    if (str == 0) {
        return;
    }

    int len = (int)strlen(str);
    for (int i = 0; i < len; i++) {
        if (str[i] == ' ') {
            for (int j = i; j < len; j++) {
                str[j] = str[j + 1];
            }
            len--;
        }
    }
}
