package linkedlist;

public class DeleateMiddleELement {
    public static void main(String[] args) {
        LinkedListNode head = MyLinkedList.takeInput();
        LinkedListNode ans = deleMidEl(head);
        MyLinkedList.print(ans);
    }
    public static LinkedListNode deleMidEl(LinkedListNode head){
        LinkedListNode slow = head;
        LinkedListNode fast = head;
        LinkedListNode temp = head;
        while(fast!= null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        while (temp != null){
            if(temp.next == slow ){
                temp.next = temp.next.next;
                temp= temp.next;
            }
            temp = temp.next;
        }
      //  slow.next = slow.next.next;
        return head;
    }
}
