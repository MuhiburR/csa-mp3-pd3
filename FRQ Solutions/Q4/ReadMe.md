# 2024 AP CSA Question 3

### This code is about finding the next grid with the lowest valued number next to a given starting grid and also to find a path to the bottom right of the grid via repeating this finding method.
    For the first method:
  -  Checks the numbers above, belowm, and to the sides of the given grid.
  *  Selects the grid containing the lowest valued number.
  +  Returns that newly selected grid.
###
    For the second method:
  +  Creates a int variable to represent sum; starting at 0.
  -  Repeats the first method within a loop until the bottom right grid is reached.
  *  As the loop processes, the current selected grid value is added to the sum variable.
  +  Returns sum once the loop is completed. 
