
a=[3,2,10,11,7,15]
t=21
for i in range(len(a)):
    for j in range(i,len(a)):
        if a[i]+a[j]==t:
            print("set is",a[i],a[j])



