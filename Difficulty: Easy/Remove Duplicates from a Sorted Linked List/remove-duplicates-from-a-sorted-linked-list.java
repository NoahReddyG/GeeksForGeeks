/*
class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
*/

class Solution {
    Node removeDuplicates(Node head) {
        Node dummy=head;
        while(head!=null && head.next!=null)
        {
            if(head.data==head.next.data)
            head.next=head.next.next;
            else
            head=head.next;
        }
        return dummy;
    }
}