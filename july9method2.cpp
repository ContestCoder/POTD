//O(N) time and O(1) space complexity
class Solution
{
    public:
    //Function to find the smallest positive number missing from the array
    void partition(int arr[], int n)
    {
        int pivot = 0;
 
        for (int i=0;i<n;i++)
        {
            if(arr[i]>0)    // pivot is 0
            {
                swap(arr[i],arr[pivot]);
                pivot++;
            }
        }
    }
    int missingNumber(int arr[], int n) 
    { 
        // Your code here
        partition(arr,n);
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]>0) count++;
        }
        for(int i=0;i<count;i++){
            int curr = abs(arr[i]) - 1;
            if(curr >= 0 && curr < n){
                if(arr[curr]>0) 
                arr[curr]=-arr[curr];
            }
        }
        
        for(int i=0;i<=count;i++){
            if(arr[i]>0) return i+1;
        }
       
        return count+1;
    }  
};
