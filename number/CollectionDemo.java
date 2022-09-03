package number;

import java.util.Map;
import java.util.*;

public class CollectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map m1= new HashMap(); //no insertion order
		//LinkedHashMap m1 = new LinkedHashMap(); //inserion oorder
		TreeMap m1 = new TreeMap();
		m1.put("zara", "8");
		m1.put("mehnaz","31");
		m1.put("Ayan","12");
		m1.put("Daisy","14");
		System.out.println();
		System.out.println("map elements");
		System.out.println("\t"+m1);
		

	}

}
