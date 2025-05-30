package LinkedList;

public class PalindromeLinkedList {
    private static Node insertAtHead(Node head,int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        return head;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,2,1,3};
        Node<Integer> head = new Node<>(arr[0]);
        for(int i=1;i<arr.length;i++){
            head = insertAtHead(head,arr[i]);
        }

        System.out.println(findPalindrome(head));
    }

    private static boolean findPalindrome(Node<Integer> head) {
        Node<Integer> slow = head, fast = head;
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node head2 = reverse(slow.next);
        slow = head;
        while(head2!=null){
            if(slow.data!=head2.data) return false;
            slow = slow.next;
            head2 = head2.next;
        }
        return true;
    }

    private static Node reverse(Node head) {
        Node prev = null, temp = head;
        while(temp!=null){
            Node front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
        return prev;
    }
}
