import random as rand

def mergeSort(lst):
    if len(lst)<=1:
        return lst
    mid = len(lst)//2
    lefthalf = lst[:mid]
    righthalf = lst[mid:]
    return merge (lefthalf, righthalf)  

def merge(lefthalf, righthalf):
    result = []
    i=j=0
    while i<len(lefthalf) and j<len(righthalf):
        if lefthalf[i]<righthalf[j]:
            result.append(lefthalf[i])
            i+=1
        else:
            result.append(righthalf[j])
            j+=1
    while i<len(lefthalf):
        result.append(lefthalf[i])
        i+=1
    while j<len(righthalf):
        result.append(righthalf[j])
        j+=1
    result += lefthalf[i:]
    result += righthalf[j:]
    return result

def insertionSort(lst):
    for i in range(1, len(lst)):
        key = lst[i]
        j = i-1
        while j>=0 and key<lst[j]:
            lst[j+1] = lst[j]
            j -= 1
        lst[j+1] = key
    return lst

mylist = []
for i in range(10):
    mylist.append(rand.randint(0,999))
print("Unsorted list: ", mylist)
print("Merge Sorted list:" , mergeSort(mylist))   

list2 = []
for i in range(10):
    list2.append(rand.randint(0,999))
print("Unsorted list: ", list2)
print("Insertion Sorted list:" , insertionSort(list2))

  
