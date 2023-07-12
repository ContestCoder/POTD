class Solution {
    public boolean isFrequencyUnique(int n, int[] arr) {
        Map<Integer, Integer> mp = new HashMap<>();
        Set<Integer> s = new HashSet<>();
        for (int i = 0; i < n; i++) {
            if (mp.containsKey(arr[i])) {
                mp.put(arr[i], mp.get(arr[i]) + 1);
            } else {
                mp.put(arr[i], 1);
            }
        }
        
        for (int k : mp.values()) {
            s.add(k);
        }
        
        return mp.size() == s.size();
    }
}

        
