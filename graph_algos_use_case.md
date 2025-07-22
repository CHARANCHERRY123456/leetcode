#  Graph Algorithms: When and Why to Use Each

---

## 1. BFS (Breadth-First Search)
**Use When:**
- Finding shortest path in **unweighted** graphs
- Minimum operations (e.g., Word Ladder, Number transformations)
- Level-order traversal in trees or grids

**Why:**
- Guarantees shortest path
- Explores neighbors level by level

**Time Complexity:** O(V + E)

**Examples:**
- Word Ladder
- Maze solving (grid)
- Minimum multiplications to reach a number
- Checking bipartite

---

## 2. DFS (Depth-First Search)
**Use When:**
- Detecting cycles
- Topological sort
- Connected components
- Tree traversals
- Backtracking (sudoku, permutations)

**Why:**
- Goes deep into paths
- Good for recursion-style problems

**Time Complexity:** O(V + E)

**Examples:**
- Number of Islands
- Detecting cycles in graph
- Generating subsets/permutations

---

## 3. Dijkstra’s Algorithm
**Use When:**
- Finding shortest path in **weighted, non-negative** graphs
- Single-source shortest path problems

**Why:**
- Greedy approach ensures minimum path cost
- Uses priority queue (min-heap)

**Time Complexity:** O((V + E) log V)

**Examples:**
- Network routing
- Shortest delivery route
- Cheapest flights within K stops

---

## 4. Bellman-Ford Algorithm
**Use When:**
- Graph has **negative weights**
- Need to detect **negative weight cycles**

**Why:**
- Handles negative weights unlike Dijkstra
- Dynamic programming approach

**Time Complexity:** O(VE)

**Examples:**
- Currency arbitrage
- Negative cycle detection
- Time-dependent shortest path

---

## 5. Floyd-Warshall Algorithm
**Use When:**
- Need **all-pairs shortest paths**
- Small graph size (V ≤ 500)

**Why:**
- Dynamic Programming over all triplets
- Simple, exhaustive approach

**Time Complexity:** O(V³)

**Examples:**
- Distance matrix
- Transitive closure
- Path existence for all pairs

---

## 6. 🟧 Topological Sort
**Use When:**
- Task scheduling with dependencies
- DAG problems (Directed Acyclic Graph)

**Why:**
- Gives a valid linear task ordering
- Detects cyclic dependencies

**Time Complexity:** O(V + E)

**Examples:**
- Course Schedule
- Package install order
- Build systems

---

## 7. Union-Find / DSU (Disjoint Set Union)
**Use When:**
- Detecting cycles in undirected graphs
- Managing dynamic connected components
- Kruskal’s MST

**Why:**
- Fast group merging and cycle checking
- Uses path compression + union by rank

**Time Complexity:** Nearly O(1) per operation (amortized)

**Examples:**
- Friend circles
- Accounts merge
- Redundant connections

---

## 8. Kruskal’s Algorithm
**Use When:**
- Building Minimum Spanning Tree (MST)
- Sparse graphs, global edge view

**Why:**
- Sorts all edges and picks smallest ones without forming cycles
- Uses Union-Find for cycle detection

**Time Complexity:** O(E log E)

**Examples:**
- Connecting all cities with minimum cost
- Network cable layout

---

## 9. Prim’s Algorithm
**Use When:**
- MST for **dense graphs**
- Greedy growth from a node

**Why:**
- Selects cheapest edge from visited set
- Efficient with adjacency matrix + min-heap

**Time Complexity:** O((V + E) log V)

**Examples:**
- Water supply network from a base
- Power grid layout

---

## 10. Tarjan’s / Kosaraju’s Algorithm
**Use When:**
- Finding Strongly Connected Components (SCCs)
- Directed graph decomposition

**Why:**
- Efficient linear time algorithms
- Identifies circular dependencies

**Time Complexity:** O(V + E)

**Examples:**
- Compiler optimization
- 2-SAT solver
- Circuit analysis

---
