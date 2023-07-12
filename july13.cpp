//User function Template for C++
class Solution
{
    public:
    bool isFrequencyUnique(int n, int arr[])
    {
        unordered_map<int, int> mp;
        set<int> s;
        for(int i=0;i<n;i++){
            mp[arr[i]]++;
        }
        
        
        for(auto k: mp){
            s.insert(k.second);
        }
        if(mp.size()==s.size()) return true;
        
        return false;
    }
};
