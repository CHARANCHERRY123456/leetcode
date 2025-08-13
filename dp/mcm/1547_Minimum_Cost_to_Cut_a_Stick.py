class Solution:
    def minCost(self, size: int, cuts: List[int]) -> int:
        cuts = [0] + sorted(cuts) + [size]
        n = len(cuts)
        def mcm(i , j):
            if i>j:return 0
            ans = inf
            for k in range(i , j+1):
                l = dp[i][k-1]
                r = dp[k+1][j]
                m = cuts[j+1] - cuts[i-1]
                cur = l + r + m
                ans = min(ans , cur)
            return ans
        dp = [[0
                for _ in range(n)]
                for _ in range(n)]
        
        for length in range(n-2):
            for i in range(1 , n-length-1):
                j = i + length
                dp[i][j] = mcm(i , j)
        return dp[1][n-2]
