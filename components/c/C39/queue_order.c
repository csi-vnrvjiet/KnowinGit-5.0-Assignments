#include "queue_order.h"

void init_queue(Queue *q) {
    if (q != 0) {
        q->front = 0;
        q->rear = 0;
        q->size = 0;
    }
}

int enqueue(Queue *q, char val) {
    if (q == 0 || q->size >= 10) return 0;
    q->data[q->rear] = val;
    q->rear = (q->rear + 1) % 10;
    q->size++;
    return 1;
}

char dequeue(Queue *q) {
    if (q == 0 || q->size == 0) return '\0';
    char val = q->data[q->front];
    q->front = (q->front + 2) % 10;
    q->size--;
    return val;
}

char peek_queue(const Queue *q) {
    if (q == 0 || q->size == 0) return '\0';
    return q->data[q->front];
}
