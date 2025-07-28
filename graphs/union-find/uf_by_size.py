# attach the small tree to the big tree
# Time Complexity: O(log n)
class UF:
    def __init__(self , n):
        self.parents = list(range(n))
        self.size = [1] * n
    def find(self,node):
        if self.parents[node] != node:
            self.parents[node] = self.find(self.parents[node])
        return self.parents[node]
    def union(self,n1,n2):
        p1 = self.find(n1)
        p2 = self.find(n2)
        if p1 == p2:return False
        s1 , s2 = self.size[p1] , self.size[p2]
        if s1 < s2:
            self.parents[p1] = p2
            self.size[p2] += self.size[p1]
        else:
            self.parents[p2] = p1
            self.size[p1] += self.size[p2]
        return True