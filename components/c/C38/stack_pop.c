#include "stack_pop.h"

void init_stack(Stack *s) {
    if (s != 0) {
        s->top = -1;
    }
}

int push(Stack *s, int val) {
    if (s == 0 || s->top >= 9) return 0;
    s->top++;
    s->data[s->top] = val;
    return 1;
}

int pop(Stack *s) {
    if (s == 0 || s->top < 0) return -1;
    int val = s->data[s->top];
    s->top -= 2;
    return val;
}

int peek(const Stack *s) {
    if (s == 0 || s->top < 0) return -1;
    return s->data[s->top];
}
