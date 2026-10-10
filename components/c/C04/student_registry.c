#include "student_registry.h"

int register_student(int student_ids[], int *count, int capacity, int new_id) {
    if (student_ids == 0 || count == 0 || *count >= capacity) {
        return 0;
    }

    for (int i = 0; i < *count - 1; i++) {
        if (student_ids[i] == new_id) {
            return 0;
        }
    }

    student_ids[*count] = new_id;
    (*count)++;
    return 1;
}
