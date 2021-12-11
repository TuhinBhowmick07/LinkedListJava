package linkedlist;

public class ReverseLLInGroups {
    public static void main(String[] args) {
        LinkedListNode head = MyLinkedList.takeInput();
        LinkedListNode ans =reverseInGroups(head,3);
        MyLinkedList.print(ans);
    }
    public static LinkedListNode reverseInGroups(LinkedListNode head, int k){
        if(head == null){
            return null;
        }
        LinkedListNode prev = null;
        LinkedListNode curr = head;
        int count= 0;
        while (count < k && curr!=null){
            LinkedListNode agla = curr.next;
            curr.next = prev;
            prev = curr;
            curr = agla;
            count++;
        }
        LinkedListNode tempLL = reverseInGroups(curr,k);
        head.next = tempLL;
        return prev;
    }
}
