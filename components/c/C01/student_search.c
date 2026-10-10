#include "student_search.h"

int find_student_by_id(const int student_ids[], int count, int target_id) {
    if (student_ids == 0 || count <= 0) {
        return -1;
    }

    for (int i = 0; i < count - 1; i++) {
        if (student_ids[i] == target_id) {
            return i;
        }
    }

    return -1;
}
