import java.util.*;
class MissingNoInArray{
    public static void main(String[] args) {
        int arr[]={0,1,2,4};
        // System.out.print("missingNo :"+missingNo1(arr));
        // System.out.print("missingNo :"+missingNo2(arr));
        // System.out.print("missingNo :"+missingNo3(arr));
        System.out.print("missingNo :"+missingNo4(arr));
        
    }
    //TimeComplaxity -O(N^2)
    //Space Complexity -O(1)
    // Brute Force

    public static int missingNo1(int[]arr){
       for(int i=1;i<=arr.length;i++){
        boolean flag=false;
        for(int j=0;j<arr.length;j++){
            if(arr[j]==i){
                flag=true;
                break;
            }
        }
        if(!flag){
            return i;
        }
       }
    return -1;       
    }


    //Hashing 
    // better soln    
    public static int missingNo2(int[]arr){
        int [] nums=new int[arr.length+1]; 

        for(int i=0;i<arr.length;i++){
         nums[arr[i]-1]=1;
        }
        for(int j=0;j<nums.length;j++){
            if(nums[j]==0){
                return j+1;
            }
        }
        return -1;
    }
 
    //optimal sol^n 1  using sum
    public static int missingNo3(int[]arr){
        int len=arr.length+1;
        int sum=(len*(len+1))/2;

        int newSum=0;
        for(int i=0;i<arr.length;i++){
            newSum+=arr[i];
        }        
        int result=(sum-newSum);
        return result ;
    }

    //optimal sol^n 1  using sum
   public static int missingNo4(int[] nums) {
        int n=nums.length;
        // [0,n]
        int xor1=0;
        int xor2=0;
        for(int i=0;i<n;i++){
            xor1^=nums[i];
            xor2^=i+1;
        }
        return xor1^xor2;        
    }
}