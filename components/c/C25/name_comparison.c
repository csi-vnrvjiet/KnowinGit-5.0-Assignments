#include <string.h>
#include "name_comparison.h"

int compare_names_case_insensitive(const char *name1, const char *name2) {
    if (name1 == 0 || name2 == 0) {
        return (name1 == name2) ? 1 : 0;
    }

    return (strcmp(name1, name2) == 0) ? 1 : 0;
}
