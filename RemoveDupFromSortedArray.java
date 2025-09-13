import java.util.Arrays;

class RemoveDupFromSortedArray{
     public static void main(String[] args) {
        int arr[]={10,10,10,10,20,20,30,30,40,40,40,50,60};

        arr=removeDup(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        System.out.println("removeDupOptimal :"+removeDupOptimal(arr));

    }
    
    // O(n) space complexity due to copying and O(N) time complexity
    static int[] removeDup(int arr[]){
    if (arr.length == 0) return null;
    int first=arr[0];
    int i=1;
    for(int j:arr){
        if(first!=j){
            arr[i]=j;
            i++;
            first=j;
        }
    }
    return Arrays.copyOf(arr,i);
    }

    // without using extra space
    //O(1) space complexity and O(N) time complexity
    static int removeDupOptimal(int arr[]){
    if (arr.length == 0) return 0;
    int first=arr[0];
    int i=1;
    for(int j:arr){
        if(first!=j){
            arr[i]=j;
            i++;
            first=j;
        }
    }
    return i;
    }

}