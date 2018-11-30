package temp.leetcode;

public class AddTwoNum {



    public static void main(String[] args) {
        ListNode l3 = new ListNode(1);
        ListNode lh = l3;
        l3.next = new ListNode(2);
        l3 = l3.next;

        System.out.println(lh.val);


    }

}
class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }

}