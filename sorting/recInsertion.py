def insertion(arr ,i , n):
    if i == n:return
    temp = arr[i]
    j = i-1
    while j>=0 and arr[j] > temp:
        arr[j+1] = arr[j]
        j -= 1
    arr[j+1] = temp
    insertion(arr , i+1 , n)
    
arr = [4,3,5,2,5,1]
insertion(arr ,1, len(arr))
print(arr)

# time : O(N**2) , best O(N) 
# space : O(N)