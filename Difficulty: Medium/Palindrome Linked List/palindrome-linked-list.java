/*
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}*/

class Solution {
    Node curr;
    public boolean isPalindrome(Node head) {
        curr=head;
        return check(curr);
    }
    boolean check(Node head)
    {
        if(head==null)
        return true;
        boolean ans=check(head.next)&&head.data==curr.data;
        curr=curr.next;
        return ans;
    }
}