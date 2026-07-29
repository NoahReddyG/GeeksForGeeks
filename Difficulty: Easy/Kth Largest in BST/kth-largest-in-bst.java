/* Structure of a Binary Tree Node
class Node {
    public int data;
    public Node left;
    public Node right;

    public Node(int val) {
        data = val;
        left = right = null;
    }
};*/

class Solution {
    public int kthLargest(Node root, int k) {
        List<Integer> l=new ArrayList<>();
        inorder(root,l);
        return l.get(l.size()-k);
    }
    private void inorder(Node node,List<Integer> res) 
    {
        if (node == null) return;
        inorder(node.left, res);  
        res.add(node.data);              
        inorder(node.right, res); 
    }
}