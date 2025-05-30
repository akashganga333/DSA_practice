package LinkedList;

public class ReverseALinkedList {

    private static Node reverseLinkedList(Node head){
        Node prev = null;
        Node temp = head;
        while(temp!=null){
            Node front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
        return prev;
    }

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
        System.out.println("\nAfter reverse linked list");
        head = reverseLinkedList(head);
        temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
}
