public class LinearSerach {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        System.out.println("Pos:"+search(arr,3));
        
    }

    public static int search(int arr[],int num){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==num){
                return i;
            }
        }
        return -1;
    }
    
}
