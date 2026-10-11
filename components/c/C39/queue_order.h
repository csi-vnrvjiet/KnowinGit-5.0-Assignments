#ifndef QUEUE_ORDER_H
#define QUEUE_ORDER_H

typedef struct {
    char data[10];
    int front;
    int rear;
    int size;
} Queue;

void init_queue(Queue *q);
int enqueue(Queue *q, char val);
char dequeue(Queue *q);
char peek_queue(const Queue *q);

#endif
