public class SingleElement {
    // leetcode 136 prob 
        public static void main(String[] args) {
        int [] nums = {2,2,1};
        System.out.println("single element : "+singleNumber1(nums));
        // System.out.println("single element : "+singleNumber(nums));

        
    }

    //Hashing 
     public static int singleNumber1(int[] nums) {
       int max=nums[0];
       for(int i:nums){
        max=Math.max(i,max);
       }

       int arr[]=new int[max+1];

       for(int i=0;i<max+1;i++)
       {
        arr[nums[i]]++;
       }

       for(int j:arr){
        if(arr[j]==1){
            return j;
        }
       }
       return -1;
    }



    //XOR Approch
       public static int singleNumber(int[] nums) {
        int xor=0;
        for(int i:nums){
            xor^=i;
        }
        return xor;        
    }
}
