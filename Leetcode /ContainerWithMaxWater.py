a= [1,8,6,2,5,4,8,3,7]
temp=0
value=0
for i in range(len(a)):
    for j in range(i,len(a)):
        width = j - i
        height = min(a[i], a[j])
        temp = width * height
        value= max(value, temp)
print(value)