package ConstructorConcept;

public class Student {
	
	String name;
	int sid;
	String subject[];

	public Student(String name) {
		this.name = name;
	}

	public Student(String name, int sid) {
		this.name = name;
		this.sid = sid;
	}

	public Student(String name, int sid, String[] subject) {
		this.name = name;
		this.sid = sid;
		this.subject = subject;
	}
}
