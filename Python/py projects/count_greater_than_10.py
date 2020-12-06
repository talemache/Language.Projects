print("This program counts how many numbers the user enters\n"
"that are more than 10. Enter numbers one at a time\n")
count = 0

for i in range(10):
    num = eval(input("Enter a number: "))
    if num > 10:
        count+=1

print("\nYou entered", count, "numbers that are more than 10\n")