/*
Definition for Node
class Node {
    int data;
    Node left, right;

    Node(int val) {
        this.data = val;
        this.left = null;
        this.right = null;
    }
}
*/

class Solution {
    public ArrayList<Integer> rightView(Node root) {
        ArrayList<Integer> result=new ArrayList<>();
        if(root==null)
        return result;
        Queue<Node>q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty())
        {
            int s=q.size();
            for(int i=0;i<s;i++)
            {
                Node curr=q.poll();
                if(i==0)
                result.add(curr.data);
                if(curr.right!=null)
                q.offer(curr.right);
                if(curr.left!=null)
                q.offer(curr.left);
            }
        }
        return result;
    }
}