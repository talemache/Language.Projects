print("This program converts from inches to centemeters\n")
length = eval(input("Please enter inches: "))

if length<0:
    print("Invalid entry, closing program")
    exit
elif length>0:
    print("You entered: ", length)
    length *= 2.54
    print("\nIn centimeters, this is: ", length)
else:
    print("Some unkown error occured, closing program\n")
    exit
