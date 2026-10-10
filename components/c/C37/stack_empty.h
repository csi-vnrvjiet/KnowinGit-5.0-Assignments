#ifndef STACK_EMPTY_H
#define STACK_EMPTY_H

typedef struct {
    int data[10];
    int top;
} Stack;

void init_stack(Stack *s);
int is_empty(const Stack *s);
int push(Stack *s, int val);
int pop(Stack *s);
int peek(const Stack *s);

#endif
