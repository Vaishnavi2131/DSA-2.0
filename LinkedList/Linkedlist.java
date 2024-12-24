/**
 * Linkedlist
 */
//import java.util.*;
public class Linkedlist {

    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }

        public static Node head;
        public static Node tail;
        
        public void addFirst(int data){
             // create newNode
             Node newNode=new Node(data);
            if(head==null){
                head=tail=newNode;
                return;
            }
           
            //newnodes point to head
            newNode.next=head;
            //head euals to newnode
            head=newNode;
        }

        public void addLast(int data){
            // create newNode
            Node newNode=new Node(data);
           if(head==null){
               head=tail=newNode;
               return;
           }
          
           //newnodes point to head
           tail.next=newNode;
           //head euals to newnode
           tail=newNode;
       }

       public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"-> ");
            temp=temp.next;
        }
        System.out.println("null");
       }

       public void middle(int index ,int data){
            Node newNode=new Node(data);
            Node temp=head;
            int i=0;
            while(i<index-1){
                temp=temp.next;
                i++;
            }
            newNode.next=temp.next;
            temp.next=newNode;
       }
        
    
    public static void main(String[] args) {
        Linkedlist ll= new Linkedlist();
        ll.print();
        ll.addFirst(1);
        ll.print();
        ll.addFirst(2);
        ll.print();
        ll.addLast(3);
        ll.print();
        ll.addLast(4);
        ll.print();
        ll.middle(2, 21);
        ll.print();
       
       
    }
}