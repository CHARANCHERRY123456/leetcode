class Solution:
    def maxCoins(self, nums: List[int]) -> int:
        nums = [1] + nums + [1]
        @cache
        def mcm(i , j):
            if i>j:return 0
            ans = 0
            ansk = -1
            for k in range(i , j+1):
                l = mcm(i,k-1)
                r = mcm(k+1,j)
                m = nums[i-1] * nums[k] * nums[j+1]
                cur = l + r + m
                if cur > ans:
                    ans = cur
                    ansk = k
            print(i , j , ansk)
            return ans 
        n = len(nums)
        return mcm(1 ,n-2)
