package LinkedList;

//Given the head of a linked list,
//remove the nth node from the end of the list and return its head.
//Input: head = [1,2,3,4,5], n = 2
//Output: [1,2,3,5]
public class RemoveNthNodeFromEndofList {
    private static Node insertAtHead(Node head,int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        return head;
    }
    public static void main(String[] args) {
        int arr[] = {5,4,3,2,1};
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

        head = removeNthNodeFromBack(head,2);
        temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    private static Node removeNthNodeFromBack(Node<Integer> head, int n) {
        if(head==null || head.next==null) return null;
        Node fast = head;
        while(n-->0) fast = fast.next;
        //if n == size of LL delete head;
        if(fast==null) return head.next;
        Node slow = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return head;
    }
}
