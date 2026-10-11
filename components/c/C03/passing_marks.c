#include "passing_marks.h"

int count_passing_students(const int marks[], int count, int passing_threshold) {
    if (marks == 0 || count <= 0) {
        return 0;
    }

    int passing_count = 0;
    for (int i = 0; i < count; i++) {
        if (marks[i] > passing_threshold) {
            passing_count++;
        }
    }

    return passing_count;
}
