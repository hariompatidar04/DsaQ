
class SumOFElement {

    static int sumOfEle(int[] arr) {
        int sum = 0;

        //for loop
        // for(int i=0;i<arr.length;i++)
        // {
        //   sum+=arr[i];
        // }

        //enhanced for loop 
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int res = sumOfEle(arr);
        System.out.println("Sum of all elements in the array: " + res);
    }
}
