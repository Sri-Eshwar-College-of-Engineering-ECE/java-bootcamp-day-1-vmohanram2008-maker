package mukunda;

public class Circle {
int radius;
void calculateArea()
{
	double pi=3.14;
	double area=pi*radius*radius;
	System.out.println("Radius = "+radius);
	System.out.println("Area = "+area);
}
	public static void main(String[] args) {
		
Circle c1=new Circle();
c1.radius=7;
c1.calculateArea();

	}

}
