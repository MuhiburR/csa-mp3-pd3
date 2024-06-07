# 2024 AP CSA Question 3

### This code is about consecutively finding the previous word in the next word within an arraylist of words.
    For the first method:
  -  Checks within the arraylist if the current word consecutively and fully exists within the next upcoming word.
  *  If the previous word consecutively appears within the next word for the entire arraylist then **true** is returned.
  +  If previous word does not consecutively appear within the next word for the entire arraylist then **false** is returned.
###
    For the second method:
  -  Checks if the inputted "target" word exists within all the words in the arraylist.\
  +  A new arraylist is created in order to be added with new edited words after the method is done.
  *  If the target words exists within the currently checking word then the target word, the following procedure happens:
        1. Finds the index of the target word inside the selected checking word.
        2. Removes the target word completely from the checking word, keeping only the letters after the target word ends..
        3. Adds the new word into the newly made arraylist.
  *  If target word isn't fully within the selected word then nothing is added to the new arraylist.
  +  Returns the new arraylist.
 
 ____________________________________________________________________
> For Exemplary Purposes
### First method:
Arraylist = (an, band, band, abandon)
: Returns **true**.

Arraylist = (to, too, tools, stool)
: Returns **false**.
____________________________________________________________________
> For Exemplary Purposes
### Second method:

Arraylist = (catch, bobcat, catchacat, cat, at)

Target1 = cat : Returns [ch, catchacat] 

Target2 = catch : Returns [acat]

Target3 = dog : Return []
