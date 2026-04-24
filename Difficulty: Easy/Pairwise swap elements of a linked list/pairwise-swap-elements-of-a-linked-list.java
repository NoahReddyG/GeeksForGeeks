/* node class of the linked list

class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}

*/

class Solution {
    
    public Node pairwiseSwap(Node head) {
        if(head==null || head.next==null)
        return head;
        Node f=head;
        Node s=head.next;
        f.next=pairwiseSwap(s.next);
        s.next=f;
        return s;
    }
}