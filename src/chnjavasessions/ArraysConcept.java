package chnjavasessions;

import java.util.Arrays;

public class ArraysConcept {

	public static void main(String[] args) {

		//Static Array:
		//limitations of array:
		//1. size is fixed: static array: to overcome this, we use dynamic array : ArrayList
		//2. it takes only similar types of data: To overcome this, we can use static Object Array
		//we use dynamic array : ArrayList
		
		//1. int:
		int i[] = new int[4];
		//li = 0
		//len = 4
		//hi = len -1 --> 3
		//len = hi + 1 --> 4
		i[0] = 10;
//		i[1] = 20;
//		i[2] = 30;
		i[3] = 40;
	//	i[4] = 50;//AIOB
		System.out.println(i);  // Will print some garbage value
		System.out.println(i[7]);  // //AIOB
		System.out.println(Arrays.toString(i));
		
		System.out.println(i[0]);
		System.out.println(i[1]);
		System.out.println(i[2]);
		//System.out.println(i[0]+i[2]);
		//System.out.println(i[4]);//AIOB
		//System.out.println(i[-1]);//AIOB
		
		System.out.println("li :" + 0);
		int len = i.length;
		System.out.println("length : " + len);
		System.out.println("hi : " + (len-1));
		
		System.out.println("-------");
		//to print the values from array: for loop
		for(int k=0; k<i.length; k++) {
			System.out.println(k + ":" + i[k]);//10 20 30 40
		}
		
		//for each loop:
		System.out.println("-------");
		int c = 0;
		for(int e : i) {
			System.out.println(c + ":" + e);
			c++;
		}
		System.out.println("-------");

		//double array:
		double d[] = new double[3];
		d[0] = 12.33;
		d[1] = 23.44;
		d[2] = 34.55;
		System.out.println(d);
		
		for(double e : d) {
			System.out.println(e);
				if(e == 23.44) {
					System.out.println("bye");
					break;
				}
		}
		System.out.println("-------");

		for(int k=0; k<d.length; k++) {
			System.out.println(d[k]);
			if(d[k] == 23.44) {
				System.out.println("hi");
				break;
			}
		}
		
		System.out.println("-------");
		
		char ch[] = new char[5];
		ch[0] = 'a';
		ch[1] = 'e';
		ch[2] = 'i';
		ch[3] = 'o';
		ch[4] = 'u';
		
		for(char e : ch) {
			System.out.println(e);
		}
		
		System.out.println(ch);
		System.out.println("-------");

		int f[] = new int[3];
		f[0] = 100;
		f[1] = 200;
		f[2] = 300;
		System.out.println(Arrays.toString(f));
		System.out.println("-------");

		//String array:
		String names[] = new String[3];
		names[0] = "Tom";
		names[1] = "Peter";
		names[2] = "Lisa";
		
		for(String e : names) {
			System.out.println(e);
		}
		
		System.out.println("-------");
		
		for(int p=0; p<names.length; p++) {
			System.out.println(names[p]);
		}
		
		System.out.println("-------");
		
		for(int p=names.length-1; p>=0; p--) {
			System.out.println(names[p]);
		}
		
		System.out.println("-------");
		
		Object emp[] = new Object[5];
		emp[0] = "Shifa";
		emp[1] = 25;
		emp[2] = 'f';
		emp[3] = 34.44;
		emp[4] = true;
		
		for(Object e : emp) {
			System.out.println(e);
		}

		//Array literals: static array
		int num[] = {12,2,3,45,100,25};
		System.out.println(num.length);
		//num[6] = 900;
		//System.out.println(num[6]);
		
		
	}


}
