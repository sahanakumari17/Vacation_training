package number;

import java.util.List;

public class ListToArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String>fruitList = new ArrayList<>();
		fruitList.add("mango");
		fruitList.add("Banana");
		fruitList.add("Apple");
		fruitList.add("strawberry");
		String[] array =fruitList.toArray(new String(fruitList.size()));
		System.out.println("printing array:"+Arrays.toString));
		System.out.println("printing List:"+fruitList);
		

	}

}
