package number;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HashSet1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet set = new HashSet();
		set.add("one");
		set.add("two");
		set.add("three");
		set.add("Four");
		set.add("Five");
		set.add("Two");
		Iterator<String>i=set.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}


	}

}
