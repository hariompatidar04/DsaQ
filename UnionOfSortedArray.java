import java.util.ArrayList;

class UnionOfSortedArray{
    public static void main(String[] args) {
        
        int []a={1,2,2,3,3,4,5,6};
        int []b={2,3,3,5,6,6,7};
        for(int i:unionArr(a,b)){
            System.out.print(i+" ");
        }
        
    }
    static ArrayList<Integer> unionArr(int []a,int[]b){
        ArrayList<Integer> li=new ArrayList<>();
        int prev=-1;
        int i=0;
        int j=0;
        while(i<a.length && j<b.length){
            if(a[i]<=b[j]){
                if(prev!=a[i]){
                    li.add(a[i]);
                    prev=a[i];
                }
                i++;
            }
            else{
                if(prev!=b[j]){
                    li.add(b[j]);
                    prev=b[j];
                }
                j++;
            }
        }
        
        while(i<a.length){
            if(prev!=a[i]){
            li.add(a[i]);
            prev=a[i];
            }
            i++;
        }
         while(j<b.length){
            if(prev!=b[j]){
            li.add(b[j]);
            prev=b[j];
            }
            j++;
        }
        return li;
    }
}