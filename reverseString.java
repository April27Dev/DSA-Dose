Example 1:Input: s = ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]
class Solution {
    public void reverseString(char[] s) {
        if(s.length==1){
            return;
        }
        int start=0,end=s.length-1;
        while(start<end){
            char temp= s[start];
            s[start]=s[end];
            s[end]=temp;
            start++;
            end--;
        }
    }
}
