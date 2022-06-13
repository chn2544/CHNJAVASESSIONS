package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListConcept {

	public static void main(String[] args) {
		
		
		//ArrayList : Default class in Java
		//Dynamic Array
		//create the object of ArrayList using new keyword
		//default vc = 10
		// Important Functions with arraylist  - add,remove,set,size
		// Important Functions with Collections - sort,reverse
		
		ArrayList ar = new ArrayList();
		System.out.println("Arraylist Size : "+ ar.size());  // by default size will be 0
		System.out.println("Printing List ");
		System.out.println(ar);  // by default it will be []
		
		System.out.println("Adding 100 and testing to List");
		ar.add(100);//0
		ar.add("testing");//1
		
		System.out.println("Arraylist Size : "+ ar.size());  // now size will be 2
		System.out.println(ar);
		
		System.out.println("Adding 12.33 and true to List");
		ar.add(12.33);//2
		ar.add(true);//3
		System.out.println("Arraylist Size : "+ ar.size());  // now size will be 4
		System.out.println(ar);
		System.out.println("-----");

		System.out.println("li = " + 0);
		System.out.println("size: " + ar.size());
		System.out.println("hi:" + (ar.size()-1));
		System.out.println("-----");
		System.out.println("Printing ele 0 and 3 = "+ ar.get(0) + " "+ar.get(3));
		//System.out.println(ar.get(4));//IOB

		ar.add(4, 600);
		System.out.println("Adding 600 at 4th Index");
		System.out.println("Printing ele 4 = "+ar.get(4) );
		
//		
		ar.add(1, 1100);
		System.out.println("Adding 1100 at 1st Index");
		System.out.println("Printing ele 1 = = "+ar.get(1));
		System.out.println("Arraylist Size : "+ ar.size());  // now size will be 6
		System.out.println("Printing List ");
		System.out.println(ar);
		
		
		ar.remove(2);
		System.out.println("Removing ele at Index 2");
		System.out.println("Post Removal of Index(2) Arraylist Size : "+ ar.size());  // now size will be 5
		System.out.println("Now Element at Index 2 - "+ar.get(2));
		System.out.println("And List is = "+ar);
		System.out.println("-----");
		
		ar.set(3,"CHIN");   // For Replacement of existing value
		System.out.println("Replacing true with CHIN , Element at Index 3 - "+ar.get(3));
		System.out.println("Post Replacement of Index(3) Arraylist Size : "+ ar.size());  // now size will be 5
		System.out.println("And List is = "+ar);
		System.out.println("-----");
		
		
		//to print all the values from arraylist: for loop
		System.out.println("Printing List Using Iterative For Loop");
		for(int i=0; i<ar.size(); i++) {
			System.out.print(ar.get(i)+" ");
			if(i==ar.size()-1)
			{
				System.out.println();
			}
		}
		
		System.out.println("-----");
		System.out.println("Printing List Using For Each Loop");
		for(Object e : ar) {
			System.out.print(e+" ");
		}
		System.out.println();
		System.out.println("-----");

		//generics in arraylist:
		ArrayList<String> empNames = new ArrayList<String>();
		empNames.add("Naveen");
		empNames.add("Monica");
		empNames.add("Prasanna");
		
		
		ArrayList<String> stNames = new ArrayList<String>();
		stNames.add("Tom");
		stNames.add("Ravi");
		stNames.add("Chitra");
		stNames.add(null);
		stNames.add(null);
		stNames.add("Ravi");
		
		System.out.println("Printing empNames = "+empNames);
		System.out.println("Printing Size of Arraylist empNames = "+empNames.size());
		System.out.println("Printing stNames = "+stNames);
		System.out.println("Printing Size of Arraylist stNames = "+stNames.size());
		

		System.out.println();
		System.out.println("Contatenating empNames with stNames");
		stNames.addAll(empNames);
		System.out.println("Printing stNames now = "+stNames);
		System.out.println("Contatenating Ar List with stNames");
		stNames.addAll(ar);
		System.out.println("Printing stNames now = "+stNames);
		System.out.println(stNames);


		System.out.println("Printing stNames with For Each Loop ");
		for(String e : stNames) {
			System.out.println(e);
				if(e.equals("Ravi")) 
				{
					System.out.println("Hi Ravi....");
					break;
				}
		}
		
		
		//
		ArrayList<Integer> marksList = new ArrayList<Integer>();
		marksList.add(100);
		
		ArrayList<Double> pricelist = new ArrayList<Double>();
		pricelist.add(12.33);
		pricelist.add(100.00);
		
		ArrayList<Character> charList = new ArrayList<Character>();

		//  Creating Arraylist of Object
		ArrayList<Object> empData = new ArrayList<Object>();
		empData.add("Sanjay");//0
		empData.add(30);//1
		empData.add(34.55);//2
		empData.add('m');//3
		empData.add(true);//4
		System.out.println("Printing List of Object Arraylist = "+empData);
		System.out.println("Concatenating stNames with empData...");
		empData.addAll(stNames);

		System.out.println("Printing Directly : "+empData);
		System.out.println("----Printing List of Object Arraylist now with For Each (after concatenation of stNames) = ");
		for(Object e : empData) {
			System.out.print(e+" ");
		}
		System.out.println();
		System.out.println("----Printing in Reverse way with For Loop");
		for(int c = empData.size()-1; c>=0; c--) {
			System.out.print(empData.get(c)+" ");
		}
		System.out.println();
		
		System.out.println(empData.contains("Naveen"));   // Checks if element is present in list
		System.out.println(empData.contains("1Naveen"));
		//
		
		//use cases:
		//total number of links/images
		//web elements
		//dynamic drop downs
		//footer list
		//top menu list
		//child menu
		
		System.out.println("-------------------------------");
		ArrayList<String> st1Names = new ArrayList<String>();
		st1Names.add("Tom");
		st1Names.add("Ravi");
		st1Names.add("Chitra");
		System.out.println("--Creating New List to Check Reverse Function of Collection Class");
		System.out.println("Printing List First "+st1Names);
		System.out.println("Sorting List now using Collections.sort ");
		Collections.sort(st1Names);
		System.out.println("Printing Post Sort : "+st1Names);
		System.out.println("Reversing now with collections.reverse");
		Collections.reverse(st1Names);
		System.out.println("Post Reverse  "+st1Names);
		System.out.print("With For Each = ");
		for(String e : st1Names) {
			System.out.print(e+" ");
		}
		

			
		

	}

}
