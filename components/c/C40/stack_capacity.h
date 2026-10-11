#ifndef STACK_CAPACITY_H
#define STACK_CAPACITY_H

#define MAX_CAPACITY 3

typedef struct {
    int data[MAX_CAPACITY];
    int top;
    int capacity;
} Stack;

void init_stack(Stack *s);
int push(Stack *s, int val);
int pop(Stack *s);
int peek(const Stack *s);

#endif
