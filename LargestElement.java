import java.util.*;
class LargestElement{
    public static void main(String[] args) {
        int arr[]={1,4,2,5,7,10,3,22};
        System.out.println("max(Optimal Way): "+largest(arr));
        System.out.println("max(BrutForce Way): "+largestBrutForce(arr));
        
    }

    //sorting 
    //then last element
    //brut force tech 
    public static int largestBrutForce(int arr[]){
        Arrays.sort(arr);
        return arr[arr.length-1];
    }

    //optimal way
    public static int largest(int arr[]){
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }
}