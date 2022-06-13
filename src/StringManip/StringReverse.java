package StringManip;

public class StringReverse {

	
	public static String reverse(String str)
	{
		if(str==null)
		{
			return "This is invalid string (null) ";
		}
		int len=str.length();
		if(len==1)
			return str;
		String rev="";
		for(int i=len-1;i>=0;i--)
			{ 
			rev=rev+str.charAt(i);
			
			}
		return rev;
		
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String rev=reverse("Test This Prog");
		String rev2=reverse("T");
		String rev3=reverse(null);
		String rev4=reverse("level");
		System.out.println("Reversed String :"+rev);
		System.out.println("Reversed String :"+rev2);
		System.out.println("Reversed String :"+rev3);
		System.out.println("Reversed String :"+rev4);
		
	
		if(rev4.equals("level"))
		{
			System.out.println("String "+rev4+" is palindrome");
		}
		else
		{
			System.out.println("String "+rev4+" is not palindrome");
		}
		
	}

}
