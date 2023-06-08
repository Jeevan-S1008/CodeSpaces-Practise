#To check wheather a number is palindrome or not
num = int(input("Enter the number"))
temp = num
rev = 0
while num!=0:
    rem = num%10
    rev = rev*10 + rem
    num = num//10

if temp == rev:
    print("the number is palindrome")
else:
    print("the number is not palindrome") 