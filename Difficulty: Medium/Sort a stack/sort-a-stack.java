class Solution {
    public void sortStack(Stack<Integer> st) {
        ArrayList<Integer> a=new ArrayList<>();
        while(!st.isEmpty())
        {
            a.add(st.pop());
        }
        Collections.sort(a);
        for(int i=0;i<a.size();i++)
        st.push(a.get(i));
    }
}