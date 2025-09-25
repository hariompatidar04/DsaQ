class MaxConsicutive1{
    public static void main(String[]args){
        int arr[]={1,1,0,1,1,1,1,0,1,1};
        System.out.println("max consicutive 1's :"+maxConsicutive(arr));
    }
    public static int maxConsicutive(int []arr){
        int max=0;
        int count=0;
        for(int i:arr){
            if(i==1){
                count++;
                if(max<count){
                    max=count;
                }
            }
            else{
                count=0;
            }
        }
        return max;
    }
}