package LinkedList;
//You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
//You may assume the two numbers do not contain any leading zero, except the number 0 itself.
//Input: l1 = [2,4,3], l2 = [5,6,4]
//Output: [7,0,8]
//Explanation: 342 + 465 = 807.
//Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
//Output: [8,9,9,9,0,0,0,1]
public class AddTwoNumbers {
    private static Node insertAtHead(Node head,int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        return head;
    }

    private static Node addNumbers(Node head1, Node head2) {
        Node res = new Node(0);
        Node curr = res;
        Node<Integer> temp1 = head1;
        Node<Integer> temp2 = head2;
        int carry = 0;
        while(temp1 != null || temp2 != null || carry == 1){
            int sum = carry;
            if(temp1 != null){
                sum+=temp1.data;
                temp1 = temp1.next;
            }
            if(temp2 != null){
                sum+=temp2.data;
                temp2 = temp2.next;
            }
            carry = sum/10;
            sum = sum%10;
            Node newNode = new Node(sum);
            curr.next = newNode;
            curr = curr.next;
        }
        return res.next;
    }

    public static void main(String[] args) {
        int[] ll1 = {3,4,2};
        int[] ll2 = {4,6,5};
        Node head1 = new Node<>(ll1[0]);
        for(int i=1;i<ll1.length;i++){
            head1 = insertAtHead(head1,ll1[i]);
        }
        Node head2 = new Node<>(ll2[0]);
        for(int i=1;i<ll2.length;i++){
            head2 = insertAtHead(head2,ll2[i]);
        }

        Node ans = addNumbers(head1,head2);
        Node temp = ans;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }

}
