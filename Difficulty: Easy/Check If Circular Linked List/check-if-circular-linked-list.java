/*
class Node
{
    int data;
    Node next;
    Node(int d)
    {
        data = d;
        next = null;
    }
}
*/
class Solution {
    boolean isCircular(Node head) {
        if(head==null)
        return true;
        Node dummy=head;
        while(dummy!=null)
        {
            dummy=dummy.next;
            if(dummy==head)
            return true;
        }
        return false;
    }
}