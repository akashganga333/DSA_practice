package LinkedList;
//Input: head = [1,3,4,7,1,2,6]
//Output: [1,3,4,1,2,6]
//Explanation:
public class DeletetheMiddleNodeofLinkedList {
    private static Node insertAtHead(Node head,int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        return head;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        Node<Integer> head = new Node<>(arr[0]);
        for(int i=1;i<arr.length;i++){
            head = insertAtHead(head,arr[i]);
        }
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
        Node node = middleOfLL(head);
        temp = node;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }

    private static Node middleOfLL(Node<Integer> head) {
        if(head==null || head.next==null) return null;
        Node slow = head, fast = head.next.next;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        slow.next = slow.next.next;
        return head;

    }
}
