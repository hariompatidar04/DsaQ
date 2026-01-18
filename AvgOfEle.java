
public class AvgOfEle {

    static double avg(int arr[], int n) {
        double sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum/n;
    }

    public static void main(String[] args) {

        int arr[] = {1, 2};
        int n = arr.length;
        System.out.println("Average of array elements is: " + avg(arr, n));

    }

}
