/*
class Node
{
    int data;
    Node next;
}
*/

class Solution {
    public static void removeLoop(Node head) {
        // code here
        Node slow=head;
        Node fast=head;
        while(fast!=null&&fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
            {
                slow=head;
                while(fast!=slow)
                {
                    slow=slow.next;
                    fast=fast.next;
                }
                Node temp=slow;
                while(temp.next!=slow)
                {
                    temp=temp.next;
                }
                temp.next=null;
            }
        }
    }
}