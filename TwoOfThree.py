# Write a python program to find the best of two numbers from three numbers accepted by user

m1 = int (input("Enter the marks in the first test: "))
m2 = int (input("Enter the marks in second test: "))
m3 = int (input("Enter the marks in third test: "))

if (m1 > m3 and m2 > m3):
    print("greatest marks are ",m1,m2)
    total = m1 + m2
elif (m1 > m2 and m3 > m2):
    print("greatest marks are ",m1,m3)
    total = m1 + m3
else:
    print("greatest marks are ",m3,m2)
    total = m2 + m3
print ("The average of the best two test marks is: ",total/2)