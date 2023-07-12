from typing import List

class Solution:
    def isFrequencyUnique(self, n : int, arr : List[int]) -> bool:
        # code here
        mp=dict();
        for i in range(n):
            mp[arr[i]]=0
            
        for i in range(n):
            mp[arr[i]]+=1
        
        unique=set()
        for i in mp.keys():
            unique.add(mp[i])
        
        if(len(unique)!=len((mp.keys()))):
            return False
        
        return True
        

