package hellowaorldcom.company;
import java.util.*;

public class LL {
    public static void main(String args[]){
        LinkedList<String> ll=new LinkedList<>();
        ll.add("A");
        ll.add("B");
        ll.add("C");
        ll.addFirst("z");
        ll.addLast("M");
        ll.remove(1);
        ll.set(1,"A");
        for(int i=0;i<ll.size();i++){
            System.out.println(ll.get(i));

        }
    }
}
