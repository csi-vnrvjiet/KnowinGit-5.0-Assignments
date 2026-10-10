#ifndef STACK_POP_H
#define STACK_POP_H

typedef struct {
    int data[10];
    int top;
} Stack;

void init_stack(Stack *s);
int push(Stack *s, int val);
int pop(Stack *s);
int peek(const Stack *s);

#endif
