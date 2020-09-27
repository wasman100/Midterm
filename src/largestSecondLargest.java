import java.util.ArrayList;
import java.util.Collections;

import acm.program.*;

public class largestSecondLargest extends ConsoleProgram {

	public void run() {
		println("This program finds the two largest integers in a list. \n Enter Values, one per line, using a 0 to signal the end of the list");
		ArrayList<Integer> listint = new ArrayList<Integer>();
		listint = gettingintegers();
		println(listint.get(0));
		println(listint.get(1));
	}

	private ArrayList<Integer> gettingintegers() {
		// TODO Auto-generated method stub
		ArrayList<Integer> listint = new ArrayList<Integer>();
		while (true) {
			int a = readInt("?");
			if (a == 0) {
				break;
			}
			listint.add(a);
		}
		Collections.reverse(listint);
		return listint;

	}
}
