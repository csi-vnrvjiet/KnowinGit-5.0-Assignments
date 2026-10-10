public class StackPop {
    private int[] data = new int[10];
    private int top = -1;

    public boolean push(int val) {
        if (top >= 9) return false;
        top++;
        data[top] = val;
        return true;
    }

    public int pop() {
        if (top < 0) return -1;
        int val = data[top];
        top -= 2;
        return val;
    }

    public int peek() {
        if (top < 0) return -1;
        return data[top];
    }
}
