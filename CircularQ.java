package hellowaorldcom.company;

public class CircularQ {
  static int arr[];
  static int size;
  static int front=-1;
  static int rear=-1;
  CircularQ(int n){
      arr=new int[n];
      this.size=n;
  }
  public static boolean isEmpty(){
      return front==-1&&rear==-1;
  }
  public static boolean isFull(){
      return (rear+1)%size==front;
  }
  public static void add(int data){
      if(isFull()){
          System.out.println("Queue is full");
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
      if(rear==front){
          rear=front=-1;
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
    public static void main(String [] args) {
        CircularQ s = new CircularQ(3);
        add(1);
        add(2);
        add(3);
        s.remove();
        add(4);
        while (!isEmpty()) {
            System.out.println(s.peek());
            s.remove();
        }
    }
}
