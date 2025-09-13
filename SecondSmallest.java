import java.util.Arrays;

class SecondSmallest{
    public static void main(String[] args) {
        int arr[]={-1,0,0};
        System.out.println("second smallest1 :"+sSmallest(arr));
        System.out.println("second smallest2 :"+secondSmallest(arr));

    }

    // brute force 
    public static int secondSmallest(int arr[]){
        if(arr.length<2){
            return -1;
        }
        Arrays.sort(arr);
        int smallest=arr[0];
        for(int i:arr){
            if(i!=smallest){
                return i;
            }
        }
        return -1;
    }

    //optimal solution 
    public static int sSmallest(int []arr){
        if(arr.length<2){
            return -1;
        }
        int smallest=Integer.MAX_VALUE;
        int sSmallest=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<smallest){
                sSmallest=smallest;
                smallest=arr[i];
            }
            else if(arr[i]<sSmallest && arr[i]!=smallest){
                sSmallest=arr[i];
            }
        }
    return (sSmallest == Integer.MAX_VALUE) ? -1 : sSmallest; 
}
    
}