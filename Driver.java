//Notes by Caleb Arredondo OCT 20th
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Random;
import java.util.Stack;
import java.util.TreeMap;

public class Driver {

	final static int NUMBUCKETS = 133333;

	public static int intHash(int a) {

		return a % NUMBUCKETS;
	}

	public static void main(String[] args) {
		

		// Queue example
		Deque<Integer> Q = new ArrayDeque<Integer>();
// adding values to a Deque
		Q.add(6);
		Q.add(2);
		Q.add(3);
		Q.add(4);
		Q.add(5);
//prints out the next value and removes it from the Array Deque
		System.out.println(Q.pop());
		System.out.println(Q.pop());
		System.out.println(Q.pop());


		HashMap<String, String> quoteAuthors = new HashMap<String, String>();		
// this assigns a string value to a string key in the hash map
	
		quoteAuthors.put("Never help a child with a task at which he feels he can succeed.", "Maria Montessori");
		quoteAuthors.put("Cynicism is an unpleasant way of saying the truth.", "Lillian Hellman");
		quoteAuthors.put("Do it now. It is not safe to leave a generous feeling to the cooling influences of the world.", "Thomas Guthrie");
		quoteAuthors.put("Real love is a permanently self-enlarging experience.", "M. Scott Peck");
		quoteAuthors.put("ABC", "Maria Montessori");
		quoteAuthors.put("123", "Lillian Hellman");
		quoteAuthors.put("PQR", "Thomas Guthrie");
		quoteAuthors.put("XYZ", "M. Scott Peck");
		quoteAuthors.put("1", "Maria Montessori");
		quoteAuthors.put("A", "Lillian Hellman");
		quoteAuthors.put("M", "Thomas Guthrie");
		quoteAuthors.put("G", "M. Scott Peck");
		quoteAuthors.put("P", "Maria Montessori");
		quoteAuthors.put("5458", "Lillian Hellman");
		quoteAuthors.put("54553", "Thomas Guthrie");
		quoteAuthors.put("6464", "M. Scott Peck");

		System.out.println(quoteAuthors.get("Never help a child with a task at which he feels he can succeed."));
//loops through the map and prints out the entry key and value accordingly
		for (Map.Entry<String, String> entry : quoteAuthors.entrySet())
			System.out.println("[" + entry.getKey() + ", " + entry.getValue() + "]");		


		Weekdays D1 = Weekdays.SATURDAY;

		/* So this is a case statement. Basically if D1 happens to be a certain day of the week 
		the following code will execute if the values match.
		It's kinda like an if statement but not at the same time.
		*/
			switch(D1) {
			case FRIDAY:
			System.out.println("It's almost weekend! \n");
			break;
			case SATURDAY:
			System.out.println("It's weekend! \n");
			break;
			case SUNDAY:
			System.out.println("It's still weekend! \n");
			break;
		}

//   prints out the list of enum values
		for (Weekdays D2 : Weekdays.values()) {
			System.out.println(D2);
		}


// this is adding string values to an arraylist
		ArrayList<String> s = new ArrayList<String>();

		s.add("123");
		s.add("ABC");
		s.add("CS2334");
		s.add("Bye");
		s.add("123");
		s.add("ABC");
		s.add("CS2334");
		s.add("Bye");
		s.add("123");
		s.add("ABC");
		s.add("CS2334");
		s.add("Bye");
		s.add("123");
		s.add("ABC");
		s.add("CS2334");
		s.add("Bye");
		s.add("123");
		s.add("ABC");
		s.add("CS2334");
		s.add("Bye");
		
//shuffles the arraylist
		Collections.shuffle(s);

		System.out.println("List after the use of Collection.sort():\n" + s);


// Tree Map is similar to a hashMap but there are a few more functions we can do with a tree map
		TreeMap<String, String> quoteAuthorsWithTreeMap = new TreeMap<String, String>();		

		quoteAuthorsWithTreeMap.put("Never help a child with a task at which he feels he can succeed.", "Maria Montessori");
		quoteAuthorsWithTreeMap.put("Cynicism is an unpleasant way of saying the truth.", "Lillian Hellman");
		quoteAuthorsWithTreeMap.put("Do it now. It is not safe to leave a generous feeling to the cooling influences of the world.", "Thomas Guthrie");
		quoteAuthorsWithTreeMap.put("Real love is a permanently self-enlarging experience.", "M. Scott Peck");
/*gets the value of "Never help a child with a task at which he feels he can succeed." 
 and returns the value assigned to that key 
 */
		System.out.println(quoteAuthorsWithTreeMap.get("Never help a child with a task at which he feels he can succeed."));

		for (Map.Entry<String, String> entry : quoteAuthorsWithTreeMap.entrySet())
			System.out.println(
					"[" + entry.getKey()
					+ ", " + entry.getValue() + "]");

		LinkedList<String> L = new LinkedList<String>();

		// Adding elements to the linked list and printing them out accordingly
		
		L.add("A"); 		System.out.println(L);
		L.add("A");			System.out.println(L);
		L.add("B"); 		System.out.println(L);
		L.addLast("C"); 	System.out.println(L);
		L.addFirst("D"); 	System.out.println(L);
		L.add(2, "E"); 		System.out.println(L);
 
		
		// removes the values specified
		L.remove("A"); 		System.out.println(L);
		L.remove("E"); 		System.out.println(L);
	// removes the value of that element in the linkedList
		L.remove(3); 		System.out.println(L);
		L.removeFirst(); 	System.out.println(L);
		L.removeLast(); 	System.out.println(L);
		
		Random r = new Random();

		HashMap<Integer, Integer> intHashTest = new HashMap<Integer, Integer>();		

		// count hash values/buckets based on random inputs
		for(int i=0; i<1000000000; i ++) {
			intHashTest.put(r.nextInt(Integer.MAX_VALUE),r.nextInt(Integer.MAX_VALUE));
		}
		
		


	}
}
