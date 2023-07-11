class Solution:
    def power(self, N, R):
        mod = 1000000007  # Assuming mod value as defined in the C++ code
        
        if R == 0:
            return 1
        
        curr_ans = self.power(N, R // 2)
        
        ans = (curr_ans % mod * curr_ans % mod) % mod
        
        if R % 2 == 0:
            return ans
        else:
            return (ans % mod * N % mod) % mod
