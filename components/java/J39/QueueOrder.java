public class QueueOrder {
    private char[] data = new char[10];
    private int front = 0;
    private int rear = 0;
    private int size = 0;

    public boolean enqueue(char val) {
        if (size >= 10) return false;
        data[rear] = val;
        rear = (rear + 1) % 10;
        size++;
        return true;
    }

    public char dequeue() {
        if (size == 0) return '\0';
        char val = data[front];
        front = (front + 2) % 10;
        size--;
        return val;
    }

    public char peek() {
        if (size == 0) return '\0';
        return data[front];
    }
}
