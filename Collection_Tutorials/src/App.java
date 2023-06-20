import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class App {
	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		List<String> asList = Arrays.asList("A", "B", "C", "D");
		Iterator<String> iterator = asList.iterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		ListIterator<String> listIterator = asList.listIterator(asList.size());
		while (listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}
	}
}
