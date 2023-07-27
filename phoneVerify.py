import re
def isPhoneNumber(numstr):
    if(numstr)!=(12):
        return False
    for i in len(numstr):
        if i==3 or i==7:
            if numstr[i]!='-':
                return False
        elif numstr[i].isdigit() is False:
            return False
        else:
            return False
    return True
def checkphone(numstr):
    phnopattern=re.compile(r'\d{3}-\d{3}-\d{4}')
    if phnopattern.match(numstr):
        return True
    else:
        return False
    
phno=input("Enter the phone number: ")
print("without using regular expression")
if isPhoneNumber(phno):
    print("Valid phone number")
else:
    print("Invalid phone number")
   
print("Using regular expression")
if checkphone(phno):
    print("Valid phone number")
else:
    print("Invalid phone number")
