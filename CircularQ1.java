package hellowaorldcom.company;

public class CircularQ1 {
    static int arr[];
    static int size;
    static int rear=-1;
    static int front=-1;
    CircularQ1(int n){
        arr=new int[n];
        this.size=n;
    }
    public static boolean isEmpty(){
        return rear==-1 && front==-1;
    }
    public static boolean isFull(){
        return (rear+1)%size==front;
    }
    public static void add(int data){
        if(isFull()){
            System.out.println("Queue is Full");
            return;
        }
        if(front==-1){
            front=rear=0;
        }else{
            rear=(rear+1)%size;
            arr[rear]=data;
        }
    }
    public static int remove(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }
        int result=arr[front];
        if(front==rear){
            front=rear=-1;
        }else{
            front=(front+1)%size;
        }
        return result;
    }
    public static int peek(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        return arr[front];
    }
}
