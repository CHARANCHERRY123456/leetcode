class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int Realsom = (n * (n+1)) / 2;
        int som = 0;
        for(int num : nums) som += num;
        return Realsom - som;
    }
}

// O(N) , O(1)
