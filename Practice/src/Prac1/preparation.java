package Prac1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class preparation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// part 1 (how to take input)

//					System.out.println("What is your name?");
//					String word = sc.next();
//					System.out.println("My name is : "+word);
//					System.out.println("What is your Id?");
//					int num = sc.nextInt();
//					System.out.println("My id is : "+num);
//					System.out.println("Are you studying in iqra university?");
//					boolean bool = sc.nextBoolean();
//					System.out.println("Yes it's : "+bool);
//					System.out.println("What's ur age?");
//					double decimalNumber= sc.nextDouble();
//					System.out.println("My age is : "+decimalNumber);

		// part 2 (how to change data type of variable)
//					System.out.println("convert string to num");
//					String word2 = sc.next();
//					int num2 = Integer.parseInt(word2);
//					System.out.println(num2);

		// part 3 (compare integer)
//					int x = 5;
//					int y =7;
//					boolean xGreater = x>y;
//					System.out.println(xGreater);
//					boolean yGreater = x<y;
//					System.out.println(yGreater);
//					boolean equal = x == y;
//					System.out.println(equal);
//					boolean notEqual = x!=y;
//					System.out.println(notEqual);
//					boolean ylessEqual = x>=y;
//					System.out.println(ylessEqual);
//					boolean xlessEqual = x<=y;
//					System.out.println(xlessEqual);

		// part 4 (compare String)
//					String a = "dhara";
//					String b = "rajput";					
//					boolean equal2 = a == b;
//					System.out.println(equal2);
//					boolean notEqual2 = a!=b;
//					System.out.println(notEqual2);

//		part 5 (conditional operator)	

//			int alpha = 5;
//			int beta = 7;
//			int gamma = 9;
//		
//			boolean andOp = alpha>beta && alpha>gamma;
//			System.out.println(andOp);
//			boolean OrOp = alpha>beta || gamma>alpha;
//			System.out.println(OrOp);		
//			boolean NotOp = !(alpha>beta || gamma>alpha);
//			System.out.println(NotOp);		
//			
//			boolean comparsion = (alpha>beta && gamma>alpha ) || !(beta+2 >gamma) || (alpha + 2 >beta);
//					System.out.println(comparsion);	
//					
//					
//			boolean comparsion2 = (alpha>beta && gamma>alpha ) || (beta+2 >gamma) || (alpha + 2 >beta) || (alpha+2 >= beta);
//			System.out.println(comparsion2);	

//		part 6 (string) (if else if )	

//		String s = sc.nextLine();
//		if (s.equals("tim")) {
//			System.out.println("You typed tim");
//		} else if (s.equals("hello")) {
//			System.out.println("Hie");
//
//		} else if (s.equals("hi")) {
//			System.out.println("hello!");
//		} else if (s.equals("hi")) {
//			System.out.println("i win!");
//		} else {
//			System.out.println("Print");
//		}

//		part 6 (integer) (if else if )		
//		String s = sc.nextLine();
//		int age = Integer.parseInt(s); 
//		if (age >= 18) { 
//			System.out.println("You are an adult"); 
//		} else if (age >= 13) {
//			System.out.println("You are a teenager"); 
//		} else { 
//			System.out.println("Yoo are not a teenager or an adult"); 
//		} 

//		String s = sc.nextLine();
//		int age = Integer.parseInt(s);
//		if (age >= 18) {
//			System.out.print("Input your fav food: ");
//			String food = sc.nextLine();
//			if (food.equals("pizza")) {
//				System.out.println("Mine too");
//			} else {
//				System.out.println("Not mine");
//			}
//		} else if (age >= 13) {
//			System.out.println("You are a teenager");
//		} else {
//			System.out.println("You are not a teenager or an adult");
//		}

		// part 7 array
		// String Array
//		String[] newArr = new String[5]; 
//		newArr[0] = "hello"; 
//		newArr[1] = "hi"; 
//		newArr[2] = "tim"; 
//		newArr[3] = "bill"; 
//		newArr[4] = "joe"; 
//		String x = newArr[4]; 
//		System.out.println(x); 

		// int array

//		int[] numArr = {2,3,45,5,3,3}; 
//	
//		int y = numArr[4]; 
//		System.out.println(y); 

		// double array

//		double[] numArr2 = {2.54,3.34,45.32,5,3,3}; 
//	
//		double z = numArr2[4]; 
//		System.out.println(z); 

		// part 8 for
		// array for loop

//		int[] arr = {1,5,7,3,4,5}; 
//		for(int i = 0; i < arr.length ; i++) { 
//				System.out.println(arr[i]);
//		}
//		
		// array for each loop

//		
//		int[] arr = {1,5,7,3,4,5}; 
//		for (int i : arr) { 
//			System.out.println(i);
//		}

		// array for loop advance

//		
//		int[] arr = {1,5,7,3,4,5}; 
//		for (int i = 0; i < arr.length ; i++) { 
//			if (arr[i] == 5) 
//				System.out.println("Found a 5! at index " + i);
//			} 	
//	

		// ==========

//		int[] arr = {1,5,7,3,4,5}; 
//		int count = 0;
//		for (int i : arr) { 
//			
//			System.out.println(i+" "+count++);
//		}		
//		

		// ==============

//		 String[] names = new String[5]; 
//		 for (int i =0;i < names.length; i++) { 
//			 System.out.print( "Input: "); 
//			 String input = sc.nextLine(); 
//			 names[i] = input; 
//		 } 
//		 for(String n : names) {
//			 System.out.println(n);
//			 if(n.equals("stop")) {
//				 break;
//			 }
//		 }

		// ==============

		// part 9 while

//		System.out.print("Type a number: ");
//		int x = sc.nextInt(); 
//		int count = 0; 
//		while (x != 10) { 
//			System.out.println("Type 10..."); 
//			System.out.print("Type a number: "); 
//			x = sc.nextInt(); 
//			count++; 
//		 
//		} 
//		System.out.println("You tried " + count + " times"); 

		// part 10 do while
//		int x;
//		do {
//			System.out.print("Type a number: ");
//			 x = sc.nextInt(); 	
//		}while (x != 10);

		// set specific element dont repeat

		// HashSet collection of unordered element
//		Set<Integer> t = new HashSet<Integer>();
//		t.add(5); 
//		t.add(7); 
//		t.add(5); 
//		t.add(9); 
//		t.add(-8); 		
//		System.out.println(t); 
//		boolean x = t.contains(9); 
//		System.out.println(x); 
//		t.remove(9); 
//		System.out.println(t);
//		boolean y = t.contains(9); 
//		System.out.println(y);
//		t.isEmpty(); 
//		System.out.println(t);
//		int z = t.size(); 
//		System.out.println(z);
//		t.clear(); 
//		System.out.println(t);

		// TreeSet collection of ordered element

//		Set<Integer> t = new TreeSet<Integer>();
//		t.add(5); 
//		t.add(7); 
//		t.add(5); 
//		t.add(9); 
//		t.add(-8); 		
//		System.out.println(t); 
//		boolean x = t.contains(9); 
//		System.out.println(x); 
//		t.remove(9); 
//		System.out.println(t);
//		boolean y = t.contains(9); 
//		System.out.println(y);
//		t.isEmpty(); 
//		System.out.println(t);
//		int z = t.size(); 
//		System.out.println(z);
//		t.clear(); 
//		System.out.println(t);

		// LinkedHashSet collection of unordered element its just faster then hashset

//				Set<Integer> t = new LinkedHashSet<Integer>();
//				t.add(5); 
//				t.add(7); 
//				t.add(5); 
//				t.add(9); 
//				t.add(-8); 		
//				System.out.println(t); 
//				boolean x = t.contains(9); 
//				System.out.println(x); 
//				t.remove(9); 
//				System.out.println(t);
//				boolean y = t.contains(9); 
//				System.out.println(y);
//				t.isEmpty(); 
//				System.out.println(t);
//				int z = t.size(); 
//				System.out.println(z);
//				t.clear(); 
//				System.out.println(t);

		// ArrayList when you dont know the size of array

//		ArrayList<Integer> t = new ArrayList<Integer>();
//		t.add(5); 
//		t.add(7); 
//		t.add(5); 
//		t.add(9); 
//		t.add(-8); 	
//		t.add(3);
//		System.out.println(t.subList(2, 4)); 
//		t.set(3, 6);
//		System.out.println(t.subList(2, 4)); 	
//		System.out.println(	t.get(3));

		// LinkedList is faster then ArrayList

//				LinkedList<Integer> t = new LinkedList<Integer>();
//				t.add(5); 
//				t.add(7); 
//				t.add(5); 
//				t.add(9); 
//				t.add(-8); 	
//				t.add(3);
//				System.out.println(t.subList(2, 4)); 
//				t.set(3, 6);
//				System.out.println(t.subList(2, 4)); 	
//				System.out.println(	t.get(3));

//		// HashMap
//		// unordered collection
//
//		Map m = new HashMap();
//		m.put("tim", 5);
//		m.put("joe", "x");
//		m.put(11, 999);
//		// overriding key
//		m.put(11, 994444);
//		System.out.println(m);

//		// TreeMap
//				// ordered collection -> we cNT usw different data type in this
//
//				Map m = new TreeMap();
//				m.put("tim", 5);
//				m.put("joe", "x");
//				m.put("c", "xsaddas");
//				System.out.println(m);

		// LinkedHashMap
		// maintain order in which added

//		Map m = new LinkedHashMap();
//		m.put("tim", 5);
//		m.put("joe", "x");
//		m.put("c", "xsaddas");
//		m.put(11, 999);
//		// overriding key
//		m.put(11, 994444);
//		m.put("joe", "xasdasdasd");
//		System.out.println(m);	
//		System.out.println(m.values());
//		System.out.println(m.get("tim"));
//		System.out.println(m.get(5));
//		System.out.println(m.containsKey(5));
//		System.out.println(m.containsValue(5));

		// chech alphabet count
//		Map m = new HashMap(); 
//		String str = "hello my name is tim and i am cool"; 
//		for(char x:str.toCharArray()) { 
//			if (m.containsKey(x)){ 
//				int old = (int) 
//						m.get(x); 
//				m.put(x , old+1); 
//		} else { m.put(x, 1); 
//			} } 
//		m.remove(' '); 
//		System.out.println(m); 

		
//		//sort
//		int[] x = {-99,5,6,3,2,1,7,8,0}; 
//		Arrays.sort(x, 3,6); 
//		for(int i:x) {
//		System.out.print(i + ","); 
//		} 

		
		
		//DOG CLASS
		
//		dog tim = new dog("tim", 4);
//		tim.speak();
//		dog bill = new dog("bill", 7);
//		bill.speak();
//		dog bob = new dog("bob", 11); 
//		bob.speak(); 
//		tim.setAge(10); tim.speak(); 
		
		
		
	}

}
