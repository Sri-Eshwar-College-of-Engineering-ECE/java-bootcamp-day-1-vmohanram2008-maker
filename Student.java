package mukunda;

public class Student {
	String Name;
	int rollno;
	void display()
	{
		String college ="ABC Engineering";
		System.out.println("Name: "+Name);
		System.out.println("Roll No: "+rollno);
		System.out.println("College: "+college);
	}

	public static void main(String[] args) {
		Student s1=new Student();
		s1.Name="Raj";
		s1.rollno=101;
		s1.display();
	}

}
