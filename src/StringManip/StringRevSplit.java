package StringManip;

public class StringRevSplit {

	public static void splitstr(String str)
	{
		String arr[]=str.split(" ");
		
		for(int i=arr.length-1;i>=0;i--)
		{
			reverse(arr[i]);
		}
	
	}
		public static void reverse(String str2)
		{
			for(int j=str2.length()-1;j>=0;j--)
			{
				System.out.print(str2.charAt(j));
			}
			System.out.print(" ");
		}
		
		
		
		
	
	public static void main(String[] args) {

		
		String str="This is my selenium code";
		splitstr(str);
//		String str2="One More New Programme Introduced";
//		splitstr(str2);
		
	}

}
