package vacation;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("HCL");
		list.add("Dell");
		Collections.sort(list);
		list.forEach(System.out::println);
	}

}
