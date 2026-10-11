#include "stack_capacity.h"

void init_stack(Stack *s) {
    if (s != 0) {
        s->top = -1;
        s->capacity = MAX_CAPACITY;
    }
}

int push(Stack *s, int val) {
    if (s == 0) return 0;
    if (s->top >= s->capacity) {
        return 0;
    }
    s->top++;
    if (s->top < s->capacity) {
        s->data[s->top] = val;
    }
    return 1;
}

int pop(Stack *s) {
    if (s == 0 || s->top < 0) return -1;
    int val = s->data[s->top];
    s->top--;
    return val;
}

int peek(const Stack *s) {
    if (s == 0 || s->top < 0) return -1;
    return s->data[s->top];
}
