package LinkedList;


//Given the head of a singly linked list, group all the nodes with odd indices together followed by the nodes with even indices, and return the reordered list.
//The first node is considered odd, and the second node is even, and so on.
//Note that the relative order inside both the even and odd groups should remain as it was in the input.
//You must solve the problem in O(1) extra space complexity and O(n) time complexity.
//Input: head = [1,2,3,4,5]
//Output: [1,3,5,2,4]
public class OddEvenLinkedList {
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
        Node<Integer> node = OddEven(head);
        temp = node;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }

    }

    private static Node<Integer> OddEven(Node<Integer> head) {
        Node<Integer> odd = head;
        Node<Integer> even = head.next;
        Node<Integer> evenHead = head.next;
        while(even!=null && even.next!=null){
            odd.next = odd.next.next;
            even.next = even.next.next;
            odd = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
        return head;
    }
}
