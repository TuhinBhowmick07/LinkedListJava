package linkedlist;

public class MiddleElement {
    public static void main(String[] args) {
       // MyLinkedList obj = new MyLinkedList();
        LinkedListNode head = MyLinkedList.takeInput();
        LinkedListNode ans = getMiddleElementBetter(head);
        System.out.println(ans.data);
    }
    public static LinkedListNode getMiddleElementBetter(LinkedListNode head){
        LinkedListNode slow = head;
        LinkedListNode fast = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
    public static LinkedListNode getMiddleElement(LinkedListNode head){
        int len = getLength(head);
        int i = 0;
        LinkedListNode middle = head;
        while (i<len/2){
            middle = middle.next;
            i++;
        }
        return middle;
    }
    public static int getLength(LinkedListNode head){
        LinkedListNode current = head;
        int length = 0;
        while(current  != null){
            length++;
            current = current.next;
        }
        return length;
    }
}
