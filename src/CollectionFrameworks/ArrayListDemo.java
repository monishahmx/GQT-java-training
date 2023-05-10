package CollectionFrameworks;
import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList a1 = new ArrayList();
		a1.add("Monisha");
		a1.add(15);
		a1.add("lost in fire by weeknd");
		a1.add(69);
		a1.add(3.14);
		System.out.println(a1);
		a1.add(3," often by weeknd");
		System.out.println(a1);
		System.out.println(a1.get(2));
		a1.set(0, "Weeknd");
		System.out.println(a1);
		// TODO Auto-generated method stub

	}

}
