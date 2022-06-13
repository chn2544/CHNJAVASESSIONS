package ApnaCollege;

import java.util.Arrays;
import java.util.Scanner;

public class StringPractice {

	public static void main(String[] args) {
		
		
		String str1="This is sample string";  // Allocated memory in String Constant Pool
		String str2=new String("New Example of Declaration");  //Assigns memory allocation in Heap
		String str4="This is sample string";
		String str5="THIS is sample string";
		String str6="    Giving some Spaces before and after     ";
		
//		System.out.println("Enter the String ");
//		Scanner sc=new Scanner(System.in);
//		String str=sc.nextLine();
//		System.out.println("Entered String is \n"+str);
//		System.out.println("\nEnter the String to check for sc.next()");
//		String str3=sc.next(); // Takes only first word of string
//		System.out.println("Entered String is (with next) \n"+str3);
//		
		
		System.out.println(str1+" "+str2);  //Concatination 
		System.out.println("Length of "+str1+" is : "+str1.length());  //Find Length of String
		System.out.println("Character at Index 11 is : "+str1.charAt(11)); //Printing Chat at 11
		System.out.println("Using char at in For Loop Below");
		for(int i=0;i<str1.length();i++)
		{
			System.out.print(str1.charAt(i));
		}
		System.out.println();
		System.out.println("First Occurance of Char n in Str1 is :"+str1.indexOf("n"));// Index of n
		System.out.println("Occurance of word - sample  in Str1 is :"+str1.indexOf("sample"));// Index of sample
		System.out.println("Trimming before and after spaces - "+str6.trim()); // Trim and Print
		String str7=str6.replace("f","!");
		System.out.println("Now String 7 looks like :"+str7);
		System.out.println("Convering all to Lower Case- "+str7.toLowerCase());
		System.out.println("Convering all to Upper Case- "+str7.toUpperCase());
		System.out.println("Checking with Substring Contains (some) - "+ str7.contains("some"));
		System.out.println("Checking with Substring Contains (s1ome) - "+ str7.contains("s1ome"));
		System.out.println("Without Checking case - "+str4.equals(str5));
		System.out.println("Check Equals Ignore Case FUnction- "+str4.equalsIgnoreCase(str5));
		System.out.println("Subsrting from index 6 -"+str1.substring(6));  // From Index 6 
		System.out.println("Subsrting from index 6 to 10  -"+str1.substring(6,10)); // From INdex 6 to 10 
		String data = "Java_Python_Ruby_JavaScript";
		String dataVal[] = data.split("_");
		System.out.println(dataVal.length);
		System.out.println(dataVal[0]);
		System.out.println(Arrays.toString(dataVal));
		System.out.println("------------String Comparison-----------");
		if(str1.equals(str4))
		{
			System.out.println(str1+" - Equals with - "+str4);
		}
		else
		{
			System.out.println(str1+" - Does not equals with - "+str4);
		}
		
		if(str1.equals(str5))
		{
			System.out.println(str1+" - Equals with - "+str5);
		}
		else
		{
			System.out.println(str1+" - Does not equals with - "+str5);
		}
	}

}
