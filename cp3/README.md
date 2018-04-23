# Problems from chapter one

# 3.1
* I: How would you implement three stacks into a single array.
* D: Goal is to figure out how to make space for three stacks.
* E&A:

  Step 1:
  
    * Not applicable for this problem.
      
  Step 2:
 
     * We can divide the length of the array in 3, and only let each stack grow in that given space made by splitting the array on three.
     
  Step 3: 
      
      
     * storing three different sets of data in one array.
     
     Step 4:
     
     * array size 9
     * 9/3 = 3 spaces for each
     * [s1,s1,s1,s2,s2,s2,s3,s3,s3]
     
     Step 5: 
     
     * code in folder
     
     Step 6:
     
     * array size 9
     * array size 6
     * array size 8
     * array size 1
     
     Step 7:
     
     * need to fix arrays of size that do not divide into three evenly.


* L: Strategy works for all cases with added exeptions.

---------------------------------------------------------------------------------------------------------------------------

# 3.2

* I: Create a method that will find the minimum element in a stack
* D: Goal is to go through stack and find the element with the lowest value.
* E&A:

  Step 1:
  
    * [5,2,8,4,8]  returns 2
      
  Step 2:
 
     * go through stack by popping and check every element against previous smallest element, once found, return stack back into place and return min variable.
     
  Step 3:
      
     * temp stack used
     
     Step 4:
     
     * [5,2,8,4,8]
     * min=2
     * returns 2
     
     Step 5: 
     
     * code in folder
     
     Step 6:
     
     *  [5,2,8,4,8]
     *  [2,2,2,2,2]
     *  [0,0,0,0,0]
     
     Step 7:
     
     * Make sure to put the stack back in the correct order.

* L: Strategy works for all cases with added exeptions.

----------------------------------------------------------------------------------------------------------------------

# 3.5
* I: Create a method that will sort a stack with the smallest element at top and largest at bottom
* D: Goal is to sort stack from smallest to largest 

  Step 1:
  
    * [5,7,2,8,4,9,1] ->
    * [1,2,4,5,7,8,9]
      
  Step 2:
 
     * Had a hard time solving this, read the book solution and it made a lot of sense, plus it used one less stack than I was using.
     
  Step 3: 
      
      
     * Uses an extra stack to move items into place.
     * only while loops used.
     
     Step 4:
     
     * [5,7,2,8,4,9,1]   original stack
      *  [9,8,7,5,4,2,1]  temp stack
      * [1,2,4,5,7,8,9]  back into original stack
      
     
     Step 5: 
     
     * code in folder
     
     Step 6:
     
     * [5,7,2,8,4,9,1]
     * [5,0,0,1,5,1]
     * [0,0,0,0,0,0]
     
     Step 7:
     
     * It is possible to do with only one extra stack.


* L: Strategy works for all cases with added exeptions.

----------------------------------------------------------------------------------------------------------------------------------------

# 3.6
* I: Create a method that will get t  he first cat or dog that is found
* D: Goal is to return the first cat or dog we encounter depending on what the user wants 
  Step 1:
  
    * [dog5,cat6,cat3,dog7,dog1,cat9] cat  ->
    * returns cat6
      
  Step 2:
 
     * dequeue elements from the queue until you find the dog or the cat, once found put all other elements back into place.
     
  Step 3: 
      
      
     * uses temp queue to hold values that are not needed.
     
     Step 4:
     
    * s[cat3,dog7,dog1,cat9]
    * s2[dog5]
    * returns cat6
     
     Step 5: 
     
     * code in folder
     
     Step 6:
     
     * [dog5,cat6,cat3,dog7,dog1,cat9] cat
     * [dog5,dog6,dog3,dog7,dog1,dog9] cat
     
     Step 7:
     
     * Implement the dog and cat class 


* L: Strategy works for all cases with added exeptions.

---------------------------------------------------------------------------------------------------------------------------------------

# 3.4

* I: Create a queue using two stacks.
* D: Goal is to perform all opertions from a queue with two stacks.

  Step 1:
  
    * not appllicable
      
  Step 2:
 
     * Queue will implement two stacks in order to emulate the funtions that a queue would have
     * The size will be determined by adding the sizes of both the queues
     * the add function will add the element into the stack which was most recently updated which will emulate the top of the queue.
     * Both the peek and the pop function will use the older stack which will have the current elements.
     
  Step 3: 
      
     * Unnesecary use of stacks.
     
     
     Step 4:
     
    
    * not applicable.
     
     Step 5: 
     
     * code in folder
     
     Step 6:
     
     * not applicable.

     
     Step 7:
     
     * finding which stack to use for what is tricky.


* L: Strategy works for all cases with added exeptions.

