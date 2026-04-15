/* Structure of node
class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
} */

class Solution {

    // Function to find the data of kth node from
    // the end of a linked list.
    int getKthFromLast(Node head, int k) {
        Node slow=head;
        Node fast=head;
        Node t=head;
        int c=0;
        while(t!=null)
        {
            c++;
            t=t.next;
        }
        if(k>c)
        return -1;
        for(int i=0;i<k;i++)
        {
            fast=fast.next;
        }
        while(fast!=null)
        {
            slow=slow.next;
            fast=fast.next;
        }
        return slow.data;
    }
}