package linkedlist;

public class ReverseALinkedList {
    public static void main(String[] args) {
        LinkedListNode head =MyLinkedList.takeInput();
        LinkedListNode revAns = reverseIterative(head);
        MyLinkedList.print(revAns);

    }
    public static LinkedListNode reverseRecursion(LinkedListNode head){
        if(head == null || head.next == null){
            return head;
        }
        LinkedListNode tempHead = reverseRecursion(head.next);
        head.next.next = head;
        head.next = null;
        return tempHead;
    }
    public static LinkedListNode reverseIterative(LinkedListNode head){
        LinkedListNode prev= null;
        LinkedListNode curr = head;
        while(curr != null){
            LinkedListNode agla = curr.next;
            curr.next = prev;
            prev= curr;
            curr = agla;
        }
        return prev;
    }
}
