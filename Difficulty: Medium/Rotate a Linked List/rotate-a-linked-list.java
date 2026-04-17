/*
class Node {
    int data;
    Node next;

    Node(int d){
        data=d;
        next=null;
   }
}
*/

class Solution {
    public Node rotate(Node head, int k) {
       if(head==null)
       return head;
       Node curr=head;
       int t=0;
       while(curr!=null)
       {
           t+=1;
           curr=curr.next;
       }
       k=k%t;
       if(k==0)
       return head;
       curr=head;
       for(int i=1;i<k;i++)
       curr=curr.next;
       Node newn=curr.next;
       curr.next=null;
       Node temp=newn;
       while(temp.next!=null)
       temp=temp.next;
       temp.next=head;
       return newn;
    }
}
