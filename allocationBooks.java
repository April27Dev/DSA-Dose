import java.util.ArrayList;
public class Solution {
    public static int studentsreq(ArrayList<Integer> arr, int a) {
        int count = 1; // starting with 1 student
        int load = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (load + arr.get(i) > a) { // condition corrected to strictly greater
                count++;
                load = arr.get(i);
                if (load > a) return Integer.MAX_VALUE; // if any single book has more pages than 'a', impossible to allocate
            } else {
                load += arr.get(i);
            }
        }
        return count;
    }

    public static int findPages(ArrayList<Integer> arr, int n, int m) {
        if(m>n){
            return -1;
        }
        int low = 0, high = 0;
        for (int i = 0; i < arr.size(); i++) {
            high += arr.get(i);
        }
        int ans = high; // Initialize answer to high (total sum)

        while (low <= high) {
            int mid = (low + high) / 2;
            int req = studentsreq(arr, mid);
            if (req <= m) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }}
    
    
