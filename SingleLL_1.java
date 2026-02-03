package hellowaorldcom.company;

public class SingleLL_1 {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int n){
            this.data=n;
            this.next=null;
        }
    }
    public void InsertAtFirst(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
        return;
    }
    public void InsertAtLast(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node currNode=head;
        while(currNode.next!=null){
            currNode=currNode.next;
        }
        currNode.next=newNode;
    }
    public void print(){
        if(head==null){
            System.out.println("List is Empty");
            return;
        }
        Node currNode=head;
        while(currNode!=null){
            System.out.print(currNode.data + "->");
            currNode=currNode.next;
        }
        System.out.println("NULL");
    }
    public void InsertAtIndex(int index, int data){
        if(index<0){
            System.out.println("invalid index");
            return;
        }
        if(index==0){
            InsertAtFirst(data);
            return;
        }
        Node newNode=new Node(data);
        Node currNode=head;
        int i=0;
        while(currNode!=null && i<index-1){
            currNode=currNode.next;
            i++;
        }
        if(currNode.next==null){
            System.out.println("List is Out of Bound");
            return;
        }
        newNode.next=currNode.next;
        currNode.next=newNode;



    }
    public void DeleteAtFirst(){
        if(head==null){
            System.out.println("Empty List");
            return;
        }
        head=head.next;
    }
    public void DeleteAtLast(){
        if(head==null){
            System.out.println("Empty List");
            return;
        }
        Node SecondLastNode=head;
        Node LastNode=head.next;
        while (LastNode.next!=null){
            SecondLastNode=SecondLastNode.next;
            LastNode=LastNode.next;
        }
        SecondLastNode.next=null;
    }
    public void DeleteAtIndex(int index){
        if(index<0){
            System.out.println("Empty List");
            return;
        }
        if(index==0){
            DeleteAtFirst();
            return;
        }
        Node currNode=head;
        int i=0;
        while(currNode!=null && i<index-1){
            currNode=currNode.next;
            i++;
        }
        if(currNode==null&&currNode.next==null){
            System.out.println("List is out of Bound");
        }
        currNode.next=currNode.next.next;
    }

    public static void main(String args[]){
        SingleLL_1 n=new SingleLL_1();
        n.InsertAtFirst(100);
        n.InsertAtFirst(200);
        n.InsertAtFirst(300);
        n.print();
        n.InsertAtLast(1000);
        n.print();
        n.InsertAtIndex(3,15);
        n.print();
    }
}
