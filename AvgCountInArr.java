class AvgCountInArr
{

    //gfg probleam https://www.geeksforgeeks.org/problems/average-count-array2215/1
    static int[] avgCount(int [] arr,int n)
    {
      int li[]=new int[arr.length];
      for(int i=0;i<arr.length;i++){
         int count=0;
         int avg=(arr[i]+n)/2;
         for(int j:arr){
            if(avg==j){
                count++;
            }
         }
         li[i]=count;
      }
      return li;   
    }
    public static void main(String[] args) {
        int arr[]={9,5,2,4,0,3};
        int n=3;

        for(int i:avgCount(arr,n)){
            System.out.print(i+" ");
        }

        
    }
}