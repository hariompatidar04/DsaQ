
import java.util.Arrays;

public class SecondLargestElement {

    public static void main(String[] args) {
        int arr[]={2,3,3,4,4,4,5,6};
        System.out.println("secondLargest:"+secondLargest(arr));
        System.out.println("secondLargestElement:"+secondLargestElement(arr));
        System.out.println("slargest:"+slargest(arr));
        
    }


    //Brute Force Approch
    //first sort(complexity ->nlog(n))
    //treverse arr to find second largest in worst case ->n
    // total time complexity->(nlog(n)+n)
    public static int  secondLargest(int arr[]){
        //sort
        Arrays.sort(arr);
        //largest
        int max=arr[arr.length-1];
        for(int i=arr.length-1;i>=0;i--){
            if(max!=arr[i]){
                return arr[i];
            }
        }
        return -1;
    }

    //first find largest
    //then sLargest=-1
    //check arr ele not equal to largest but is greater then sLargest 
    //return slargest 
    //time compexity 
    //largest->o(n)
    //find sLargest->O(n)
    // total->O(n)+O(n)->O(2n)
    //this is good then brute force but not optimal
    public static int secondLargestElement(int arr[]){

        //find largest then find second largest
        int largest=largest(arr);
        int sLargest=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=largest && sLargest<arr[i]){
                sLargest=arr[i];
            }
        }
        return sLargest;
    }

    public static int largest(int arr[]){
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }


    //this is optimal approch 
    //time compaxity O(n)
    public static int slargest(int arr[]){
    //if length of array is less then 2 then there is no sacond largest return -1
        if(arr.length<2){
            return -1;
        }
        //we le largest and slargest as Min bcs they also be applicable for the -ve nos
        int largest=Integer.MIN_VALUE;
        int slargest=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            //check the arr ele is larger then the largest 
            if(arr[i]>largest){
                // so obviously the privious largest is secand largest 
                slargest=largest;
                // and arr[i] is new largest 
                largest=arr[i];
            }
            //if arr[i]!=largest but arr[i]<slargest then new slargest will be arr[i]
            else if(arr[i]>slargest && arr[i]!=largest){
                slargest=arr[i];
            }
        }

        return slargest;
    }


    
}
