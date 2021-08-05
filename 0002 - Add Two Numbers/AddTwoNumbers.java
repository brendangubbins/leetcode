/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int sum = 0;
        int carry = 0;
        ListNode l3 = new ListNode();
        ListNode copy = l3;
        while (l1 != null || l2 != null) {
            if (l1 == null) {
                sum = (l2.val + carry) % 10;
                carry = (l2.val + carry) / 10;
                ListNode temp = new ListNode(sum);
                l3.next = temp;
                l3 = l3.next;
                l2 = l2.next;
            }
            else if (l2 == null) {
                sum = (l1.val + carry) % 10;
                carry = (l1.val + carry) / 10;
                ListNode temp = new ListNode(sum);
                l3.next = temp;
                l3 = l3.next;
                l1 = l1.next;
            }
            else {
                sum = (l1.val + l2.val + carry) % 10;
                carry = (l1.val + l2.val + carry) / 10;
                ListNode temp = new ListNode(sum);
                l3.next = temp;
                l3 = l3.next;
                l1 = l1.next;
                l2 = l2.next;
            }
        }
        if (carry > 0) {
            ListNode temp = new ListNode(carry);
            l3.next = temp;
        }
        return copy.next;
    }
}
