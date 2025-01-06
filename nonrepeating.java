class Solution {
    public int[] singleNumber(int[] nums) {
      int xor=0;
      int a=0,b=0;
      for(int i:nums)
      {
        xor^=i;
      }
      int rmsb=(xor & -xor);
      for(int i:nums)
      {
        if((rmsb & i)==0){
        a = a^i;}
        else{
        b = b ^ i;}
      }  
      return new int[]{a,b};
    }
}