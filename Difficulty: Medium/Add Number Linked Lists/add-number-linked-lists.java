/*
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}
*/

class Solution {
    static Node addTwoLists(Node head1, Node head2) {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        // Push elements into stacks
        while (head1 != null) {
            s1.push(head1.data);
            head1 = head1.next;
        }

        while (head2 != null) {
            s2.push(head2.data);
            head2 = head2.next;
        }

        int carry = 0;
        Node result = null;

        // Process stacks
        while (!s1.isEmpty() || !s2.isEmpty() || carry != 0) {
            int sum = carry;

            if (!s1.isEmpty()) sum += s1.pop();
            if (!s2.isEmpty()) sum += s2.pop();

            Node newNode = new Node(sum % 10);
            newNode.next = result;   // Insert at front
            result = newNode;

            carry = sum / 10;
        }

        // Remove leading zeros
        while (result != null && result.data == 0) {
            result = result.next;
        }

        return (result == null) ? new Node(0) : result;
    }
}

