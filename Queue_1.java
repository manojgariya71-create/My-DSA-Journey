package hellowaorldcom.company;

public class Queue_1 {
    static int arr[];
    static int size;
    static int rear=-1;
    Queue_1(int n){
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
        if(isEmpty()){
            System.out.println("queue is empty");
            return -1;
        }
        int front=arr[0];
        for(int i=0;i<rear;i++){
            arr[i]=arr[i+1];
        }
        return front;
    }
    public static int peek(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        return arr[0];
    }
    public static void main(String args[]){

    }
}
