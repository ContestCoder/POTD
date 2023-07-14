
class Solution {
    public void deleteMidValue(Stack<Integer> s, int sizeOfStack, int mid) {
        if (sizeOfStack == mid) {
            s.pop();
            return;
        }
        int temp = s.peek();
        s.pop();
        deleteMidValue(s, s.size(), mid);
        s.push(temp);
    }

    public void deleteMid(Stack<Integer> s, int sizeOfStack) {
        int mid = (int) Math.ceil((float) sizeOfStack / 2);
        deleteMidValue(s, sizeOfStack, mid);
    }
}
