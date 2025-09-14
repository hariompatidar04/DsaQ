public class MovesZeroAtLast {
    public static void main(String[] args) {
        int arr[]={1,2,0,3,0,0,9,4,0,10};
        for(int i:movesZeroLast(arr)){
            System.out.print(i+" ");
        }
    }

        //Brute Forse Approch
        //TimeComplaxity O(N)
        //Space Complaxity O(N)
    //     static int[] movesZeroLast(int[]arr){
    //     int []nums=new int[arr.length];
    //     int j=0;
    //     for(int i=0;i<arr.length;i++){
    //         if(arr[i]!=0){
    //             nums[j]=arr[i];
    //             j++;
    //         }
    //     }
    //     return nums;
    // }

    //better Approch
    // static int[] moveZeros(int[]arr){
    //     int i=0,j=1;
    //     while(i<j && j<arr.length){
    //         if(arr[i]!=0 && arr[j]!=0){
    //             j++;
    //             i++;
    //         }
    //         else if(arr[i]!=0 && arr[j]==0){
    //             i++;
    //             j++;
    //         }

    //         else if (arr[i]==0 && arr[j]!=0){
    //             int temp=arr[j];
    //             arr[j]=arr[i];
    //             arr[i]=temp;
    //             i++;
    //             j++;
    //         }
    //         else if(arr[j]==0 && arr[i]==0){
    //             j++;
    //         }
    //     }
    //     return arr;
    // }

    //optimal Approch
    static int[] movesZeroLast(int arr[]){
        int pos=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0)            {
                arr[pos]=arr[i];
                pos++;
            }
        }
        while(pos<arr.length){
            arr[pos]=0;
            pos++;
        }
        return arr;
    }

}
