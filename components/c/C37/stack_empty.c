#include "stack_empty.h"

void init_stack(Stack *s) {
    if (s != 0) {
        s->top = -1;
    }
}

int is_empty(const Stack *s) {
    if (s == 0) return 1;
    return (s->top == -1) ? 1 : 0;
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
    if (s->top > 0) {
        s->top--;
    }
    return val;
}

int peek(const Stack *s) {
    if (s == 0 || s->top < 0) return -1;
    return s->data[s->top];
}
