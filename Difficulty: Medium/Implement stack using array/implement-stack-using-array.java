class myStack {
    int top;
    int arr[];
    int size;

    public myStack(int n) {
        top=-1;
        size=n;
        arr=new int[n];
    }

    public boolean isEmpty() {
        return top==-1;
    }

    public boolean isFull() {
        if(top==size-1)
        return true;
        else
        return false;
    }

    public void push(int x) {
        if(isFull())
        return;
        top++;
        arr[top]=x;
    }

    public void pop() {
        if(isEmpty())
        return;
        top--;
    }

    public int peek() {
        if(isEmpty())
        return -1;
        return arr[top];
    }
}