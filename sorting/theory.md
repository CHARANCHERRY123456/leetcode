## Heap Sort algorithm [GFG](https://www.geeksforgeeks.org/dsa/heap-sort/)


1) build heap
2) now pop elements from the top
3) now this element will stay in the array but we don't consider it
4) and even after removing it the array should be heapified ignoring those poped or sorted elements


## Deatailed working of heap

### 1) Treat array as complete binary tree left = 2*i+1 , right = 2*i+2

