public class IsSorted {

    public static void main(String[] args) {
        int arr[]={1,3,3,4,5,6,7};
        System.out.println("isSorted:"+isSorted(arr));
        
    }

    static boolean isSorted(int []arr)
    {
        for(int i=1;i<arr.length;i++){
            if(arr[i]>=arr[i-1]){

            }
            else{
            return false;
                }
            }
            return true;    
    }
    
}
