package hellowaorldcom.company;

public class Queue {
    static int arr[];
    static int size;
    static int rear=-1;
     Queue(int n){
         arr=new int[n];
         this.size=n;
     }
     public static boolean isEmpty(){
         return rear==-1;
     }
     public static void add(int data){
         if(rear==size-1){
             System.out.println("Queue is Full");
             return;
         }
         rear++;
         arr[rear]=data;
     }
     public static int remove(){
         if(rear==-1){
             System.out.println("Queue is Empty");
             return -1;
         }
         int front=arr[0];
         for(int i=0;i<rear;i++){
             arr[i]=arr[i+1];
         }
         rear--;
         return front;
     }
     public static int peek(){
         if(rear==-1){
             System.out.println("Queue is Empty");
             return -1;
         }
         return arr[0];
     }
    public static void main(String args[]){
        Queue s=new Queue(3);
        add(1);
        add(2);
        add(3);
        while(!isEmpty()){
            System.out.println(s.peek());
            s.remove();
        }
    }
}
