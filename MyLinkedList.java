package linkedlist;

import java.util.Scanner;

public class MyLinkedList {

    public static LinkedListNode takeInput(){

        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        LinkedListNode head = null;
        LinkedListNode tail = null;
        while(data != -1){
            LinkedListNode newNode = new LinkedListNode(data);
            if(head == null){
                head = newNode;
                tail = newNode;
            }
            else{
                tail.next = newNode;
                tail = newNode;
            }
            data = sc.nextInt();
        }
        return head;
    }
    public static void print(LinkedListNode head){
        LinkedListNode temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
}
