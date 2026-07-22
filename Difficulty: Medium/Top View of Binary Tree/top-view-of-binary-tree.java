/*
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
class NodewithHD {
        Node node;
        int hd;
        NodewithHD(Node node, int hd) {
            this.node = node;
            this.hd = hd;
        }
    }
class Solution {
    public ArrayList<Integer> topView(Node root) {
        ArrayList<Integer> result=new ArrayList<>();
        if(root==null)
        return result;
        TreeMap<Integer, Integer>map=new TreeMap<>();
        Queue<NodewithHD> q=new LinkedList<>();
        q.offer(new NodewithHD(root,0));
        while(!q.isEmpty())
        {
            NodewithHD curr=q.poll();
            Node node=curr.node;
            int hd=curr.hd;
            if(!map.containsKey(hd))
            {
                map.put(hd, node.data);
            }
            if(node.left!=null)
            {
                q.offer(new NodewithHD(node.left,hd-1));
            }
            if(node.right!=null)
            {
                q.offer(new NodewithHD(node.right,hd+1));
            }
        }
        for(int i:map.values())
        {
            result.add(i);
        }
        return result;
    }
}