# javacode
package accessmodifierscheck;

abstract class shape1 {
String colour;
int area;
public shape1(String colour) {
	this.colour=colour;
}
abstract void calcArea();
public void setOutercolour(String colour) {
	this.colour=colour;
}
public int getArea() {
  return area;
}
}
class rectangle extends shape1{
	int length=9;
	int breadth=8;
	public rectangle(String colour,int length,int breadth) {
		super(colour);
		this.length=length;
		this.breadth=breadth;
		calcArea();
	}
	
	void calcArea() {
		area=length*breadth;
	}
}
class Circle extends shape1{
	int radius;
    public Circle(String colour,int radius) {
    	super(colour);
	    this.radius=radius;
	    calcArea();
}
     
     void calcArea() {
    	 area=(int)(22.0/7*radius*radius);
     }
}
public class shape{
	public static void main(String[] args) {
		rectangle rectangle =new rectangle("red",5,10);
		System.out.println("Area of rectangle:"+rectangle.getArea());
		System.out.println("colour of rectangle:"+rectangle.colour);
		Circle circle=new Circle("blue",7);
	    System.out.println("area of circle:"+circle.getArea());
	    System.out.println("colour of circle:"+circle.colour);
	}
}
