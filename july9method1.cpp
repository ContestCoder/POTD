//O(N) space complexity and O(N) time complexity
class Solution
{
    public:
    //Function to find the smallest positive number missing from the array
    int missingNumber(int arr[], int n) 
    { 
        // Your code here
        int N=1e6+10;
        int a[N]={0};
        for(int i=0;i<n;i++){
            if(arr[i]>0)
                a[arr[i]]+=1;
        }
        for(int i=1;i<N;i++){
            if(a[i]==0){
                return i;
            
            }
        }

    } 
};
