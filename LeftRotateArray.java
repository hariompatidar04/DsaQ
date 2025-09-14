class LeftRotateArray{
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int d=2;
        int len=arr.length-1;
       for(int i:leftRotate(arr,d,len)){
           System.out.print(i+" ");
       }
    }
    
    static int[] leftRotate(int []arr,int d,int len){
        rev(arr,0,d-1);
        rev(arr,d,len);
        rev(arr,0,len);
        return arr;
    }
    
    public static int[] rev(int arr[],int s,int e){
        while(s<e){
            int temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;
            e--;
        }
        return arr;
    }

    //brute force approch
    
    // public static int[] leftRotate(int arr[],int d){
    //     // int len=arr.length;
    //     // d=d%len;
    //     // int nums[]=new int[d];
    //     // // O(d)
    //     // for(int i=0;i<d;i++){
    //     //     nums[i]=arr[i];
    //     // }
    //     // //O(n-d)
    //     // for(int j=d;j<len;j++){
    //     //     arr[j-d]=arr[j];
    //     // }
        
    //     // int x=0;
        
    //     // //O(d)
    //     // for(int p=len-d;p<len;p++ ){
    //     //     arr[p]=nums[x++];
    //     // }
    //     // return arr;
    // }
}