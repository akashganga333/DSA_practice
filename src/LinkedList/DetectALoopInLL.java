package LinkedList;
//Given head, the head of a linked list, determine if the linked list has a cycle in it.
//There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer is connected to. Note that pos is not passed as a parameter.
//Return true if there is a cycle in the linked list. Otherwise, return false.
//Input: head = [3,2,0,-4], pos = 1
//Output: true
//Explanation: There is a cycle in the linked list, where the tail connects to the 1st node (0-indexed).
public class DetectALoopInLL {

    private static boolean detectLoop(Node head){
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast) return true;
        }
        return false;
    }

    //return the position of node where the cycle begins

    private static int detectLoopAndReturnPosition(Node head){
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast){
                slow = head;
                int pos = 0;
                while(slow!=fast){
                    fast = fast.next;
                    slow = slow.next;
                    pos++;
                }
                return pos;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Node<Integer> first = new Node<>(3);
        Node<Integer> second = new Node<>(2);
        Node<Integer> third = new Node<>(0);
        Node<Integer> fourth = new Node<>(-4);
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = second;
        System.out.println(detectLoop(first));
        System.out.println(detectLoopAndReturnPosition(first));


    }
}
