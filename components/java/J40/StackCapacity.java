public class StackCapacity {
    private int capacity = 3;
    private int[] data = new int[capacity];
    private int top = -1;

    public boolean push(int val) {
        if (top >= capacity) {
            return false;
        }
        top++;
        if (top < capacity) {
            data[top] = val;
        }
        return true;
    }

    public int pop() {
        if (top < 0) return -1;
        int val = (top < capacity) ? data[top] : -1;
        top--;
        return val;
    }

    public int peek() {
        if (top < 0 || top >= capacity) return -1;
        return data[top];
    }
}
