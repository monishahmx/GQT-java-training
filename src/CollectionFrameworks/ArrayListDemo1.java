package CollectionFrameworks;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class ArrayListDemo1 {

	public static void main(String[] args) {
		ArrayList a1 = new ArrayList();
		a1.add(56);
		a1.add(34);
		a1.add(89);
		a1.add(67);
		a1.add(43);
		a1.add(10);
		Iterator itr = a1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
		}
		Collections.sort(a1 );
		System.out.println(a1);
		// TODO Auto-generated method stub

	}

}
