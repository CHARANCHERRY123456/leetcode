class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        // ps -> count
        HashMap<Integer , Integer> map =  new HashMap();
        map.put(0 , 1);
        int ps = 0;
        int ans = 0;
        for(int i=0;i<n;i++){
            ps += nums[i];
            int need = ps - k;
            ans += map.getOrDefault(need , 0);
            map.put(ps , map.getOrDefault(ps ,0) + 1);
        }
        return ans;
    }
}

// O(n) , O(n)
