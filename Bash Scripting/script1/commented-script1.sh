#!/bin/bash

# This script clears the terminal, displays a greeting and gives information about currently connected users. The two example variables are set and displayed.

# clear terminal window
clear

echo "The script starts now."

# dollar sign is used to get content of variable
echo "Hi, $USER!"

echo

echo "I will now fetch you a list of connected users:"
echo
# show wo is logged on and what they are doing
set -x        # activate debugging from here
w
set +x        # stop debugging from here

echo

echo "I'm setting two variables now."
# set a local shell variable
COLOR="black"

# set a local shell variable
VALUE="9"

# display content of variable
echo "This is a string: $COLOR"

# display content of variable
echo "And this is a number: $VALUE"

echo

echo "I'm giving you back your prompt now."
echo
