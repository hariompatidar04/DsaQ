public class LinearSearch {

    static int linearSearch(int[] arr,int n){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==n){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={10,20,110,40,50};
        int n=30;
        int result=linearSearch(arr,n);
        if(result==-1){
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element found at index: "+result);
        }
        
    }
    
}
