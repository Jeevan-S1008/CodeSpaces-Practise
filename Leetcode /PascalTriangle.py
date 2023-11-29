Triangle=[[1]]

n=int(input("Enter the number of row"))

for i in range(1,n):
    a=[1]
    for j in range(1,i):
        b=Triangle[i-1][j-1]+Triangle[i-1][j]
        a.append(b)
    a.append(1)
    Triangle.append(a)
    
print(Triangle)