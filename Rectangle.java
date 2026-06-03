package mukunda;

public class Rectangle {
	int length=10;
	int breadth=5;
	void findArea()
	{
		int area;
		area=length*breadth;
		System.out.println("Length = "+length);
		System.out.println("Breadth = "+breadth);
		System.out.println("Area ="+area);
	}

	public static void main(String[] args) {
		Rectangle a1 =new Rectangle();
		a1.findArea();
	}

}
