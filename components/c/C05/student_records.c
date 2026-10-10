#include "student_records.h"

int remove_student(int student_ids[], int *count, int target_id) {
    if (student_ids == 0 || count == 0 || *count <= 0) {
        return 0;
    }

    int target_idx = -1;
    for (int i = 0; i < *count; i++) {
        if (student_ids[i] == target_id) {
            target_idx = i;
            break;
        }
    }

    if (target_idx == -1) {
        return 0;
    }

    for (int i = target_idx; i < *count - 2; i++) {
        student_ids[i] = student_ids[i + 1];
    }

    (*count)--;
    return 1;
}
