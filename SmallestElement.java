
import java.util.Arrays;

public class SmallestElement {
    public static void main(String[] args) {
        int arr[]={6,6,6,6,6};
        System.out.println("smallest: "+smallest(arr));
        System.out.println("smallestEle: "+smallestEle(arr));
    }


      //brut force approch
       public static int smallestEle(int arr[]){
        Arrays.sort(arr);//O(nlogn)
        return arr[0];
    }


    //optimal
    public static int smallest(int arr[]){
        int smallest=arr[0];
        for(int i=1;i<arr.length;i++){
            if(smallest>arr[i]){
                smallest=arr[i];
            }
        }
        return smallest;
    }
    
}
