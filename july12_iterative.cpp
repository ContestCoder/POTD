class Solution{
    public:
    //You need to complete this fucntion
    
    long long power(int N,int R)
    {
       //Your code here
       long long result = 1;
       long long current = N;
       while(R > 0){
           if (R%2 != 0)
               result = (result * current) % mod;
           current = (current * current) % mod;
           R = R/2;
       }
       if(result == 1) result = current;
       return result;
    }

};
