/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/

class Solution {
    Node reverseList(Node head) {
        Node n=null;
        while(head!=null)
        {
            Node t=head.next;
            head.next=n;
            n=head;
            head=t;
        }
        return n;
    }
}