def RomanToDec(romstr):
    romandict = {'I':1, 'V':5, 'X':10, 'L':50, 'C':100, 'D':500, 'M':1000}
    romanback = list(romanstr)[::-1]
    value=0
    rightval =romandict[romanback[0]]
    for i in romanback:
        leftval = romandict[i]
        if leftval>=rightval:
            value += leftval
        else:
            value -= leftval
        rightval = leftval
    return value

romanstr = input("Enter a Roman numeral: ")
print("The decimal value of", romanstr, "is", RomanToDec(romanstr))