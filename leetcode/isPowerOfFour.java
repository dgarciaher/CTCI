class Solution {
    public boolean isPowerOfFour(int num) {
        if(num==0){
            return false;
        }
        int p= (int) (Math.log(num)/Math.log(4));
        if(num==Math.pow(4,p)){
            return true;
        }else{
            return false;
        }
    }
}