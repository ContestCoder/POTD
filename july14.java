


class twoStacks {
    private int[] arr;
    private int size;
    private int top1;
    private int top2;

    twoStacks() {
        size = 100;
        arr = new int[100];
        top1 = -1;
        top2 = size;
    }

    // Function to push an integer into stack1.
    public void push1(int x) {
        top1++;
        arr[top1] = x;
    }

    // Function to push an integer into stack2.
    public void push2(int x) {
        top2--;
        arr[top2] = x;
    }

    // Function to remove an element from the top of stack1.
    public int pop1() {
        if (top1 == -1) {
            return -1;
        }
        int value = arr[top1];
        top1--;
        return value;
    }

    // Function to remove an element from the top of stack2.
    public int pop2() {
        if (top2 == size) {
            return -1;
        }
        int value = arr[top2];
        top2++;
        return value;
    }
}
