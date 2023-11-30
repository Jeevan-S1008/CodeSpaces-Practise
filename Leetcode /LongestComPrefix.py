str = ["apple", "app", "apricot"]
length=100
for i in str:
    length=min(length,len(i))
print("Common Integer are: ")
for i in range(length):
    c=str[0][i]
    for j in str:
        b=j[i]
        if c!=b:
            break
    else:
        print(c)



