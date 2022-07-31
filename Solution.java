import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for(int i=0; i < n; i++){
            arr[i] = s.nextInt();
        }
        int d = s.nextInt();
        int m = s.nextInt();
        numberOfSubArrays(arr, n, d, m);
    }
    // Method to find number of subarrays of size m whose sum of elements is d
    static void numberOfSubArrays(int[] arr,int n, int d, int m){
        int count = 0;
        int sum = 0;
        //Find out whether there is a way to break the chocolate bar at all
        if(m <= n)
            for(int i = 0; i < m; i++)
                sum += arr[i];
        if(sum == d)
            count++;
        //Check other possible ways to break the bar using a sliding window
        for(int i = 0; i < n-m; i++)
        {
            sum = sum - arr[i] + arr[i+m];
            if(sum == d) count++;
        }
        System.out.println(count);
    }
}
