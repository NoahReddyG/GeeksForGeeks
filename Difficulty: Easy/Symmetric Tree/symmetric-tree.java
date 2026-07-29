/*
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}
*/

class Solution {
    public boolean isSymmetric(Node root) {
        if(root==null)
        return true;
        return check(root.left,root.right);
    }
    boolean check(Node x,Node y)
    {
        if(x==null&&y==null)
        return true;
        if(x==null||y==null||x.data!=y.data)
        return false;
        boolean left=check(x.left,y.right);
        boolean right=check(x.right,y.left);
        return left&&right;
    }
}