
package stacks;

import java.util.Scanner;
class Node{
    int data;
    Node next;
    Node(int el){
        data=el;
        next=null;
    }
}

public class Stacks {

    static Node push(Node head,int el){
        Node newNode=new Node(el);
        if(head==null){
            head=newNode;
            
        }
        
        else {
            Node current=head;
            Node parent =current;
            while(current!=null){
                parent=current;
                current=current.next;
            }
            parent.next=newNode;
            
        }
     return head;  
    }
    static void pop(Node head){
        if(head==null)
            System.out.println("underflow");
        else{
            Node current=head;
            Node parent=current;
            while(current.next!=null){
                parent=current;
                current=current.next;
            }
            System.out.print(current.data+" ");
            parent.next=null;
        }
 
        
        
    }
    static void peek(Node head){
        if(head==null)
            System.out.println("empty stack");
        else{
        Node current=head;
        while(current.next!=null)
            current=current.next;
        System.out.println();
        System.out.print(current.data+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Node head=null;
         System.out.println("enter the number of elements in the stack");
        int n=sc.nextInt();
       
        while(n!=0){
            System.out.println("enter the element to be pushed");
            int ele=sc.nextInt();
           head= push(head,ele);
            n--;
            
        }
       pop(head);
       pop(head);
       pop(head);
       peek(head);
       peek(head);
       
        
      
        
        
    }
    
}
