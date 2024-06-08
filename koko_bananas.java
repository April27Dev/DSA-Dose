/*Return the minimum integer k such that she can eat all the bananas within h hours.
Example 1:Input: piles = [3,6,7,11], h = 8
Output: 4 */
class Solution {
//finding time taken with a speed
  public int timetaken(int piles[],int a){
        int time=0;
    for(int i=0;i<piles.length;i++){
        time+=Math.ceil((double)piles[i]/(double)a);
    }
    return time;
  }
    public int minEatingSpeed(int[] piles, int h) {
        int maxi=Arrays.stream(piles).max().getAsInt();
        if(h==piles.length){
            return maxi;
        }
//range can be from 1 to maxi
      int low=1,high=maxi;
      while(low<=high){
        int mid=(low+high)/2;
        int res=timetaken(piles,mid);
        if(res<=h){
            high=mid-1;
        }
        else{
            low=mid+1;
        }
      }
      return low;
    }
}
