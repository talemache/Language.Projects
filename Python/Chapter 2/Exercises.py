# Write a program that uses input to prompt a user for their name 
# and then welcomes them.

name = input('What is your name?\n')

print(name)

# Write a program to prompt the user for hours and rate per hour 
# to compute gross pay.

promptHours = 'How many hours do you work?\n'
hours = input(promptHours)

promptRate = 'What is your rate of pay?\n'
rate = input(promptRate)

grossPay = rate * hours
print('The amount you will make is: ', grossPay)

# Write a program which prompts the user for a Celsius temperature, 
# convert the temperature to Fahrenheit, and print out the converted temperature.

promptTemp = 'What is the temperature in Celsius?\n'
input(promptTemp)

print(promptTemp * (9/5) + 32)