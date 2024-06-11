public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head==null || head.next==null){
            return false;
        }
        HashMap<ListNode,Integer> hm=new HashMap<>();
        ListNode temp=head;
        while(temp.next!=null){
            if(hm.containsKey(temp)){
                return true;
            }
            hm.put(temp,1);
            temp=temp.next;
        }
        return false;
    }
}
