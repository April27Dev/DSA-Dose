public class Solution {
    public int solve(ArrayList<Integer> A, int B) {
        int N=A.size();
      // Step 1: Calculate the initial sum of the first B elements
        int currentSum = 0;
        for (int i = 0; i < B; i++) {
            currentSum += A.get(i);
        }
      if(B==A.size()) return currentSum;
        // Initialize maximum sum with the initial sum
        int maxSum = currentSum;

        // Step 2: Slide the window from right end
        for (int i = 0; i < B; i++) {
            currentSum = currentSum - A.get(B - 1 - i) + A.get(N - 1 - i);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }
}
