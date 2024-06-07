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
        1. Finds the start of the target word inside the selected checking word.
        2. Removes the target word completely from the checking word.
        3. Adds the new word into the newly made arraylist.
  *  If target word isn't within the selected word then nothing is added to the new arraylist.
  +  Returns the new arraylist.
 
 ____________________________________________________________________
> For Exemplary Purposes
### First method:
Arraylist = (an, band, band, abandon)
: Returns **true**.
#
Arraylist = (to, too, tools, stool)
: Returns **false**.
____________________________________________________________________
> For Exemplary Purposes
### Second method:

- Will play after Red (Team 1) recieves no point.
- If point(s) are recieved then turn continues and the value of the point is added to the score.
- If no point(s) recieved then turn ends and it's the oppositions turn.
