# Problems from chapter one

1.1
* I: Create an algorithm that will check if a string contains all unique characters.
* D: Goal is to determine whether at least one character of a string is found more than one time.
* E&A:
  Step 1:
    * "abcd" -> true
    * "abbd" -> false
 Step 2: 
    * traversed the whole string and used i and i+1 in a nested for loop to check that not one character was equal to another, and as soon as an instance was found, it stops and returns false.
