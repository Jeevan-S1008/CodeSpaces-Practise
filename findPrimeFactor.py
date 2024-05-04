def PrimeFactor(number):
    list1=[]
    divisor = 2
    while divisor <= number:
        if number % divisor == 0:
            number = number / divisor
            list1.append(divisor)
        else:
            divisor = divisor + 1
        
    return list1

number = int(input("Enter the number: "))
print(PrimeFactor(number))
