package linkedlist;

public class PalindromeLL {
    public static void main(String[] args) {
        LinkedListNode head = MyLinkedList.takeInput();
        if(isPalindrome(head)){
            System.out.println("true");
        }
        else {
            System.out.println("False");
        }
    }
    public static boolean isPalindrome(LinkedListNode head){
        LinkedListNode fast = head;
        LinkedListNode slow = head;
        while (fast !=null && fast.next !=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        fast = head;
        LinkedListNode temp = reverse(slow);
        while (temp != null && fast !=null){

            if(fast.data != temp.data){
                return false;
            }
            fast = fast.next;
            temp = temp.next;
        }
        return true;
    }
    public static LinkedListNode reverse(LinkedListNode head){
        if(head == null || head.next == null){
            return head;
        }
        LinkedListNode tempHead = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return tempHead;
    }
}
