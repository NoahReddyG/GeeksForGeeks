/*
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/
class Solution {
    public Node insertAtEnd(Node head, int x) {
        Node newn=new Node(x);
        if(head==null)
        return newn;
        
        Node t=head;
        while(t.next!=null)
        {
            t=t.next;
        }
        t.next=newn;
        return head;
    }
}