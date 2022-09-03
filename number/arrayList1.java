package number;
import java.util.*;

public class arrayList1 {
public static void main(String args[]) {
LinkedList<String> l1=new LinkedList<String>();
l1.add("one");
l1.add("two");
l1.add("Three");
l1.add("four");
l1.add("Three");
l1.add("one");
System.out.println(l1);
l1.remove("one");
System.out.println(l1);
l1.removeLastOccurrence("one");
System.out.println(l1);
l1.removeFirstOccurrence("Three");
System.out.println(l1);
l1.removeFirst();
System.out.println(l1);
l1.removeLast();
System.out.println(l1);

}



}
