package MyEncapsulation;

import java.util.ArrayList;

public class HiddenClass2 {

	private int salary;
	private char gender;
	public String city;
	private ArrayList<String> al;
	
	public void setsalary(int salary)
	{
		this.salary=salary;
	}
	
	public int getsalary ()
	{
		return salary;
	}
	
	public void setgender(char gender)
	{
		this.gender=gender;
	}
	
	public char getgender()
	{
		return gender;
	}

	public void setAL(ArrayList<String> al)
	{
		this.al=al;
	}
	
	public ArrayList<String> getAl()
	{
		return al;
	}
	
	
	
}
