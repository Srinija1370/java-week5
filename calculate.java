import java.util.*;
abstract class Shape{
	abstract void getArea(double x);
	abstract void getVolume(double y);
}
class Square extends Shape{
	void getArea(double s)
	{
		System.out.println("Area of square: "+(s*s));
	}
	void getVolume(double s)
	{
		System.out.println("Can't calculate volume of square");
	}
}
class Circle extends Shape{
	void getArea(double r)
	{
		System.out.println("Area of circle: "+(Math.PI*r*r));
	}
	void getVolume(double r)
	{
		System.out.println("Can't calculate volume of Circle");
	}
}
class Cube extends Shape{
	void getArea(double s)
	{
		System.out.println("Area of cube: "+(6*s*s));
	}
	void getVolume(double s)
	{
		System.out.println("Volume of cube: "+(s*s*s));
	}
}
class Sphere extends Shape{
	void getArea(double r)
	{
		System.out.println("Area of circle: "+(4*Math.PI*r*r));
	}
	void getVolume(double r)
	{
		System.out.println("Volume of square:"+(4/3*Math.PI*r*r*r));
	}
}
class calculate{
	public static void main(String args[])
	{
		Square sq=new Square();
		Circle cr=new Circle();
		Cube cu=new Cube();
		Sphere sp=new Sphere();
		Scanner sc=new Scanner(System.in);
		//square
		System.out.println("enter side of a square: ");
		double s=sc.nextDouble();
		sq.getArea(s);
		sq.getVolume(s);
		
		//circle
		System.out.println("enter radius of circle: ");
		double r=sc.nextDouble();
		cr.getArea(r);
		cr.getVolume(r);
		
		//cube
		System.out.println("enter side of a cube: ");
		double a=sc.nextDouble();
		cu.getArea(a);
		cu.getVolume(a);
		
		//sphere
		System.out.println("enter radius of a sphere: ");
		double r1=sc.nextDouble();
		sp.getArea(r1);
		sp.getVolume(r1);
	}
}

