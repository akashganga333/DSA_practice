package LinkedList;

class Node<T>{
    T data;
    Node<T> next;
    public Node(T data) {
        this.data = data;
        this.next = null;
    }
    public Node(T data, Node<T> next) {
        this.data = data;
        this.next = next;
    }
}

public class BasicLinkedList {

    private static Node insertAtHead(int data) {
        return new Node(data);
    }
    private static Node insertAtHead(Node head,int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        return head;
    }
    private static Node deleteNode(Node<Integer> head, int data){
        if(head.data == data){
            return head.next;
        }
        Node<Integer> temp = head;
        while(temp!=null && temp.next!=null) {
            if (temp.next.data == data) {
                temp.next = temp.next.next;
                break;
            }
            temp = temp.next;
        }
        return head;
    }

    public static void main(String[] args) {
        int []arr = {1,2,3,4,5};
        Node head = insertAtHead(arr[0]);
        for(int i=1;i<arr.length;i++){
            head = insertAtHead(head,arr[i]);
        }
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }

        temp = deleteNode(head,3);
        System.out.println();
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }


    }
}
