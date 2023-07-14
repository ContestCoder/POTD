//User function template for C++

class Solution
{
    public:
    //Function to delete middle element of a stack.
    void deleteMidValue(stack<int>&s, int sizeOfStack, int mid){
        if (sizeOfStack == mid){
            s.pop();
            return;
        }
        int temp = s.top();
        s.pop();
        deleteMidValue(s,s.size(),mid);
        s.push(temp);
    }
    void deleteMid(stack<int>&s, int sizeOfStack)
    {
        // code here.. 
        int mid = (int)(ceil((float)sizeOfStack/2));
        deleteMidValue(s,sizeOfStack,mid);
            
            
    }
};
