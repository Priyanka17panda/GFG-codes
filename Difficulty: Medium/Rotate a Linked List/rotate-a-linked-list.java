/*
class Node {
    int data;
    Node next;

    Node(int d){
        data=d;
        next=null;
   }
}
*/

class Solution {
    public Node rotate(Node head, int k) {
        // code here
        if(k==0||head==null){
            return head;
        }
        Node temp = head;
        int length = 1;
        while (temp.next != null) {
            temp = temp.next;
            length++;
        }

        // Step 2: Reduce k
        k = k % length;
        if (k == 0)
            return head;

        // Step 3: Find k-th node
        Node curr = head;
        for (int i = 1; i < k; i++) {
            curr = curr.next;
        }

        // Step 4: Rotate
        Node newHead = curr.next;
        curr.next = null;
        temp.next = head;

        return newHead;
    }
}
