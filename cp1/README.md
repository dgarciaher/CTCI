# Problems from chapter one

# 1.1
* I: Create an algorithm that will check if a string contains all unique characters.
* D: Goal is to determine whether at least one character of a string is found more than one time.
* E&A:

  Step 1:
  
    * "abcd" -> true
    * "abbd" -> false
      
  Step 2:
 
     * traversed the whole string and used i and i+1 in a nested for loop to check that not one character was equal to another, and as soon as an instance was found, it stops and returns false.
     
  Step 3: 
      
      
     * for loops used 
     * no need to store data
     
     Step 4:
     
     * "abc"
      * a=b false
      * a=c false
      * b=c false
      * return true
     
     Step 5: 
     
     * code in folder
     
     Step 6:
     
     * "abcd"
     * "abbc"
     * "a3io"
     * "3bbc"
     * "a"
     * " "
     
     Step 7:
     
     * Make sure to have exeptions for empty strings and strings with characters that are not a-z. Also be able to handle really long strings and one character strings.


* L: Strategy works for all cases with added exeptions.

---------------------------------------------------------------------------------------------------------------------------

# 1.2

* I: Create an algorithm that will decide if one string is the permutation of the other.
* D: Goal is to find out if all the characers in one string are present in the other.
* E&A:

  Step 1:
  
    * "abcd" "cdab" -> true
    * "abbd" "adbc" -> false
      
  Step 2:
 
     * first check length of two strings, if they are not equal, return false. Sort strings in alphabetical order, and then compare them to each other.
     
  Step 3: 
      
      
     * a lot of for loops used 
     * probably a faster solution in terms of run time
     * Stores data in a char array
     * use of java array package
     
     Step 4:
     
     * "odc" "dco"
      * length1 == length2? -> will keep progrm going
      * sort1 = "cdo"
      * sort2 = "cdo"
      * sort1 == sort2? -> true
     
     Step 5: 
     
     * code in folder
     
     Step 6:
     
     * "abcd" "cabd"
     * "abbc" "bbaa"
     * " " "a"
     * "ba" "bc"
     * "afg" "afga"
     * " " " "
     
     Step 7:
     
     * Tried to compare arrays using .equals() method as if comparing strings, Array.equals() was needed.


* L: Strategy works for all cases with added exeptions.

----------------------------------------------------------------------------------------------------------------------

# 1.3
* I: Create a method that will replace every space in a string with the string "%20"
* D: Goal is to find all spaces in a string and replace every single one with the string.

  Step 1:
  
    * "go to work" -> "go%20to%20work"
    * "Mr John Smith" -> "Mr%20John%20Smith"
      
  Step 2:
 
     * first create a string r containing the string we want to replace the spaces with, then create a new string that will use the .replaceAll method to replace the spaces in the new string with r.
     
  Step 3: 
      
      
     * no loops, or any need to store data.
     * uses already-existing methods. 
     
     Step 4:
     
     * "go to work"
      * r="%20"
      * new string= "go%20to%20work"
     
     Step 5: 
     
     * code in folder
     
     Step 6:
     
     * "go to work"
     * "go"
     * "twenty seconds "
     * " "
     * "bird   fly"
     
     Step 7:
     
     * tried using .replace .replaceAll was needed.


* L: Strategy works for all cases with added exeptions.

----------------------------------------------------------------------------------------------------------------------------------------

# 1.8
* I: Create a method that will find the zeroes in a 2D array and make the row and column where it is located all equal to 0.
* D: Goal is to find all ones and modify the matrix to have more 0s in the columns and rows where the original ones were located.

  Step 1:
  
    * {{5,2,7,0},
    * {4,7,3,9},
    * {7,2,6,3},
    * {3,8,5,7}}  ->
    -----
    
    * {{0,0,0,0},
    * {4,7,3,0},
    * {7,2,6,0},
    * {3,8,5,0}}
      
  Step 2:
 
     * first go through array and switch elements in the array with a double for loop and a simple [i][j]=[j][i] switch, and then doing another element switch that requires more steps and an element i,k,and j also inside the for loop.
     
  Step 3: 
      
      
     * many for loops needed to traverse matrix.
     
     Step 4:
     
    * {{5,2,7,0},
    * {4,7,3,9},
    * {7,2,6,3},
    * {3,8,5,7}}
    
    
    * row=i
    * column=j
    
    
    * {{0,0,0,0},
    * {4,7,3,0},
    * {7,2,6,0},
    * {3,8,5,0}}
     
     Step 5: 
     
     * code in folder
     
     Step 6:
     
     * {{5,2,7,0},
     * {4,7,3,9},
     * {0,0,0,0},
     * {3,8,5,7}}
     
     -----
     
     
     * {{0,0,0,0},
     * {0,0,0,0},
     * {0,0,0,0},
     * {0,0,0,0}}
     
     Step 7:
     
     * Had some bugs trying yo figure out how to save more than one row and column value.


* L: Strategy works for all cases with added exeptions.

---------------------------------------------------------------------------------------------------------------------------------------

# 1.7

* I: Create a method that will flip a matrix 90 degrees.
* D: Goal is to be able to flip the matrix by 90 degrees to the left.

  Step 1:
  
    * {{1,2,3,4},
    * {5,6,7,8},
    * {9,10,11,12},
    * {13,14,15,16}};   ->
    
    ------
    
    * {{4,8,12,16},
    * {3,7,11,15},
    * {2,6,10,14},
    * {1,5,9,13}}; 
      
  Step 2:
 
     * first go through array and switch elements in the array with a double for loop and a simple [i][j]=[j][i] switch, and then doing another element switch that requires more steps and an element i,k,and j also inside the for loop.
     
  Step 3: 
      
     * many for loops needed to traverse matrix.
     * uses a new array to store and return values.
     * uses an array that serves as a temp value to save parts of the matrix.
     
     
     Step 4:
     
    
    * {{5,2,7,0},
    * {4,7,3,9},
    * {7,2,6,3},
    * {3,8,5,7}}
    
    
    * temp= arr[j][i]
    * arr[j][i]=arr[k][i]   where j is increasing in count and k is decreasing
    * arr[k][i]= temp
    
    
    * {{0,0,0,0},
    * {4,7,3,0},
    * {7,2,6,0},
    * {3,8,5,0}}
     
     Step 5: 
     
     * code in folder
     
     Step 6:
     
     * {{5,2,7,0},
     * {4,7,3,9},
     * {0,0,0,0},
     * {3,8,5,7}}
     
     -----
     
     
     * {{5,5,5,5},
     * {4,3,8,1},
     * {5,2,3,6}};

     
     Step 7:
     
     * Tried flipping only using i and j and a third variable was needed.


* L: Strategy works for all cases with added exeptions.




```java
public static void main(String args[]){

}

```



