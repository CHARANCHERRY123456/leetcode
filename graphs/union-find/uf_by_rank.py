# rank means the heihgt of the tree
# always attach the smaller tree to the bigger tree
# use path compression to speed up the find operation

class UF:
    def __init__(self , n):
        self.parents = list(range(n))
        self.ranks = [0] * n
    def find(self,node):
        if self.parents[node] != node:
            self.parents[node] = self.find(self.parents[node])
        return self.parents[node]
    def union(self,n1,n2):
        p1 = self.find(n1)
        p2 = self.find(n2)
        if p1 == p2:return False
        r1 , r2 = self.ranks[p1] , self.ranks[p2]
        if r1 > r2:
            self.parents[p2] = p1
        elif r1 < r2:
            self.parents[p1] = p2
        else:
            self.parents[p1] = p2
            self.ranks[p2] += 1
        return True