def bubble(arr , n):
    if n==1:return
    swapped = False
    for i in range(n-1):
        if arr[i] > arr[i+1]:
            arr[i] , arr[i+1] = arr[i+1] , arr[i]
            swapped = True
    if not swapped:return
    bubble(arr , n-1)
    
arr = [4,3,5,2,5,1]
bubble(arr , len(arr))
print(arr)

# time : O(N**2) , best O(N) with falg
# space : O(N)