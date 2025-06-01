package LinkedList;

import java.util.Optional;

//Given the heads of two singly linked-lists headA and headB, return the node at which the two lists intersect.
//If the two linked lists have no intersection at all, return null.
//Input: intersectVal = 8, listA = [4,1,8,4,5], listB = [5,6,1,8,4,5], skipA = 2, skipB = 3
//Output: Intersected at '8'
public class IntersectionofTwoLinkedLists {

    private static Optional<Node> deleteIntersection(Node<Integer> headA, Node<Integer> headB) {
        Node temp1 = headA, temp2 = headB;
        if(temp1 == null || temp2 == null) return null;
        while (temp1!=temp2){
            temp1 = temp1==null?headB:temp1.next;
            temp2 = temp2==null?headA:temp2.next;
        }
        return Optional.ofNullable(temp1);
    }

    public static void main(String[] args) {
        Node<Integer> first = new Node<>(4);
        Node<Integer> second = new Node<>(1);
        Node<Integer> third = new Node<>(8);
        Node<Integer> fourth = new Node<>(4);
        Node<Integer> fifth = new Node<>(5);
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        Node<Integer> first2 = new Node<>(5);
        Node<Integer> second2 = new Node<>(6);
        Node<Integer> third2 = new Node<>(1);
        first2.next = second2;
        second2.next = third2;
        third2.next = third;

        System.out.println("first List:");
        Node temp = first;
        while (temp != null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println("\nsecond List:");
        temp = first2;
        while (temp != null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }

        Optional<Node> ans = deleteIntersection(first,first2);
        System.out.println();
        System.out.println(ans.isPresent()?ans.get().data:"not found");


    }
}
