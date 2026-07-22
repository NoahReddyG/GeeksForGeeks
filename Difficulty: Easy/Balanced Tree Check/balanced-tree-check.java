/*
Definition for Node
class Node {
    int data;
    Node left, right;

    Node(int d)
    {
        data = d;
        left = right = null;
    }
}
*/

class Solution {
    public boolean isBalanced(Node root) {
        return height(root)!=-1;
    }
    private int height(Node node)
    {
        if(node==null)
        return 0;
        int lefth=height(node.left);
        if(lefth==-1)
        return -1;
        int righth=height(node.right);
        if(righth==-1)
        return -1;
        if(Math.abs(lefth-righth)>1)
        return -1;
         return 1+Math.max(lefth,righth);
    }
}