//to print the the maximum of a subarray in java
public class Main {
    public static long maxSubarraySum(int[] arr, int n) {
        long maxi = Long.MIN_VALUE; // maximum sum
        long sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            maxi=Math.max(maxi,sum);
            // If sum < 0: discard the sum calculated
            if (sum < 0) {
                sum = 0;
            }
        }
        return maxi;
    }
