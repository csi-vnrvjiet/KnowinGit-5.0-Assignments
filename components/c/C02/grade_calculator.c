#include "grade_calculator.h"

double calculate_average(const int marks[], int count) {
    if (marks == 0 || count <= 0) {
        return 0.0;
    }

    int sum = 0;
    for (int i = 0; i < count; i++) {
        sum += marks[i];
    }

    return sum / count;
}
