/* Definition for Node
class Node {
    int data;
    Node left, right;

    Node(int val) {
        data = val;
        left = right = null;
    }
}
*/

class Solution {
     public boolean isSumTree(Node node) {
        if(node==null||(node.left==null&&node.right==null))
        return true;
        int left=sum(node.left);
        int right=sum(node.right);
        int s=left+right;
        return (node.data==s)&&isSumTree(node.left)&&isSumTree(node.right);
    }
    int sum(Node x)
    {
        if(x==null)
        return 0;
        if(x.left==null&&x.right==null)
        return x.data;
        return sum(x.left)+sum(x.right)+x.data;
    }
}