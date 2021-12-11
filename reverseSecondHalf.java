package linkedlist;

public class reverseSecondHalf {
    public static void main(String[] args) {
        LinkedListNode head = MyLinkedList.takeInput();
        reverseSecondHalf(head);
        MyLinkedList.print(head);
    }
    public static LinkedListNode reverse(LinkedListNode head){
        if(head == null || head.next == null){
            return  head;
        }
        LinkedListNode tempHead = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return tempHead;
    }
    public static LinkedListNode reverseSecondHalf(LinkedListNode head){
        if(head == null){
            return  null;
        }
        LinkedListNode fast = head;
        LinkedListNode slow = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        reverse(slow);
        return head;
    }
}
