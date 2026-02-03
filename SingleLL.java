package hellowaorldcom.company;

public class SingleLL {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
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
        while (currNode.next!=null){
            currNode=currNode.next;
        }
        currNode.next=newNode;
    }
    public void InsertAtIndex(int index, int data){
        if(index<0){
            System.out.println("Invalid Index");
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
        if(currNode==null){
            System.out.println("List is Out of Bound");
            return;
        }
        newNode.next=currNode.next;
        currNode.next=newNode;
    }
    public void Print(){
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
    public void DeleteAtFirst(){
        if(head==null){
            System.out.println("List is Empty");
            return;
        }
        head=head.next;
    }
    public void DeleteAtLast(){
        if(head==null){
            System.out.println("List is Empty");
            return;
        }
        Node secondLast=head;
        Node lastNode=head.next;
        while(lastNode.next!=null){
            secondLast=secondLast.next;
            lastNode=lastNode.next;
        }
        secondLast.next=null;

    }
    public void DeleteAtIndex(int index){
        if(head==null){
            System.out.println("List is Empty");
            return;
        }
        if(index<0){
            System.out.println("invalid index");
            return;
        }
        if(index==0){
            head=head.next;
            return;
        }
        Node currNode=head;
        int i=0;
        while(currNode!=null && i<index-1){
            currNode=currNode.next;
            i++;
        }
        if(currNode==null || currNode.next==null){
            System.out.println("List out of bound");
            return;
        }
        currNode.next=currNode.next.next;
    }
    public static void main(String args[]){
        SingleLL list=new SingleLL();

        list.InsertAtFirst(100);
        list.InsertAtFirst(200);
        list.InsertAtLast(500);
        list.InsertAtIndex(1, 300);

        System.out.println("Original List:");
        list.Print();

        list.DeleteAtFirst();
        System.out.println("After Deleting First:");
        list.Print();

        list.DeleteAtLast();
        System.out.println("After Deleting Last:");
        list.Print();

         list.DeleteAtIndex(0);
        System.out.println("After Deleting at Index 0:");
        list.Print();
    }
}
