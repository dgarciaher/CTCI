# Problems from chapter one

# 2.2
* I: Create a method that will give you the information of the node k positions from the tail.
* D: Goal is to find the way to get to the node at the position we need.
* E&A:

  Step 1:
  
    * 1-5-2-8-5-4   k= 3    ->
    * returns 2
      
  Step 2:
 
     * traversed the list to know the length of it. if the counter is less than the k we were given then the node we are looking for does not exist. else you subtract the k from the length of the list and add one to account for the last node, and traverse until you get to that number.
     
  Step 3: 
      
      
     * while and for loops used.
     * for loop only used to traverse list once.
     * no need to store data
     
     Step 4:
     
     * 1-5-2-8-5-4   k= 3 
      * counter=6
      * returns 2
     
     Step 5: 
     
     * code in folder
     
     Step 6:
     
     * 1-5-2-8-5-4  k=3
     * 1-3-4    k=2
     * 1-6-3-7-3-7  k=7
     
     Step 7:
     
     * need to add one to the operation if not returns wrong number 


* L: Strategy works for all cases with added exeptions.

---------------------------------------------------------------------------------------------------------------------------

# 2.5

* I: Create a method that will take every digit from a linked list and put them together as one number
* D: Goal is to be able to put all the numbers together digit by digit from the linked list, and then add them together.
* E&A:

  Step 1:
  
    * 5-7-2   3-8-3  = 572+383 = 955
      
  Step 2:
 
     * first check length of the linked list so we can determine to what power we have to multiply the digits in the linked list by, in order to add them in the correct position, once the fist node in the list is multiplied by the original power, the power will be divided by 10 in order to put the number in the correct thousands, hundreds, and tenths position.
     
  Step 3: 
      
      
     * only while loops used
     * a lot of temporary variables used
     
     Step 4:
     
     * 5-7-2   3-8-3
      * pow = 10^2
      * 5*100 + 7*10 + 2*1 = 572
      * 3*100 + 8*10 + 3*1 = 383
      * 572+383 = 955
     
     Step 5: 
     
     * code in folder
     
     Step 6:
     
     * 5-7-2  3-8-3
     * 4-7   3-5-3
     * 2   3-5-2-6
     
     Step 7:
     
     * Make sure to subtract one from the exponent used for the pow variable or it will go on over.


* L: Strategy works for all cases with added exeptions.

----------------------------------------------------------------------------------------------------------------------

# 2.1
* I: Create a method that will remove every duplicate in a list.
* D: Goal is to find all the numbers that have a dupicate in the list, and only leave one copy of it in the list.

  Step 1:
  
    * 2-7-1-6-9-3-5-3-6-8     ->
    * 2-7-1-6-9-3-5-8
      
  Step 2:
 
     * taverse through the array and every node check if value is already in the hash set, if it is not, add it, if it is, change next pointer of prev node to next of current node.
     
  Step 3: 
      
      
     * hash set used to store data.
     * while loop and conditionals.
     
     Step 4:
     
     * 2-7-1-6-9-3-5-3-6-8   
      * set vals: 2,7,1,6,9,3,5,8
      * 3 and 6 repeat
      * new list:   2-7-1-6-9-3-5-8
      
     
     Step 5: 
     
     * code in folder
     
     Step 6:
     
     * 2-7-1-6-9-3-5-3-6-8 
     * 2-5-3-7-1-9
     * 2-2-2-2-2-2-2-2
     * 2
     
     Step 7:
     
     * hash set is the best way to find repetitions.


* L: Strategy works for all cases with added exeptions.

----------------------------------------------------------------------------------------------------------------------------------------

# 2.6
* I: Create a method that will check if a linked list is a palindrome.
* D: Goal is to find if a list is the same traversed forward than it is traversed backwards.
  Step 1:
  
    * a-b-b-a -> true
    * a-b-b-b -> false
      
  Step 2:
 
     * first go through array and push each value into a queue, then reverse the list, traverse the list and pop values you see in the list. If stack is empty after traversing then it is a palindrome, if it is not then it is not a palindrome.
     
  Step 3: 
      
      
     * uses while loops to reverse and traverse the list.
     * uses a stack to check if list has same characters forwards and backwards.
     
     Step 4:
     
    * a-b-b-a
    * stack [a,b,b,a]
    * list reversed: a-b-b-a
    * stack after peeking and popping: []
    * true
     
     Step 5: 
     
     * code in folder
     
     Step 6:
     
     * a-b-b-a
     * a-a
     *
     * a-d-c-c-d-a
     
     Step 7:
     
     * Bugs trying to reverse list.


* L: Strategy works for all cases with added exeptions.

---------------------------------------------------------------------------------------------------------------------------------------

# 2.8

* I: Create a method that will find the node at the beggining of the loop in a circular linked list.
* D: Goal is to find the loop and figure out which node is at the begging of it.

  Step 1:
  
    * A-B-C-D-E-C
    * returns C
      
  Step 2:
 
     * Traverse list with two temporary node pointers, one going twice as fast as the other, when and if they meet signals that ther is a cycle.
     
  Step 3: 
      
     * several while loops and temporary node pointer are needed.
     
     
     Step 4:
     
    
    * A-B-C-D-E-C
    * front= C
    * back= C
    * return= C
     
     Step 5: 
     
     * code in folder
     
     Step 6:
     
     * A-B-C-D-E-C
     * A-A-A-A-A
     * A-B-B-C-A

     
     Step 7:
     
     * finding the loop created many problems.


* L: Strategy works for all cases with added exeptions.

