package Abstract30Secdember;
 abstract class Shape 
{
	abstract void numberOfSides();
}
class Trapezoid extends  Shape 
{

	
	void numberOfSides()
	{
		System.out.println("Its Trapezoid its  Side : 4");
		
	}
	
}
class  Triangle extends Shape
{
	void numberOfSides()

	{
		System.out.println("Its Trinagle its  Side : 3");
		
	}
}
class Hexagon extends Shape
{
	
	void numberOfSides() 
{
		System.out.println("Its Hexagon its  Side : 6");
		
	}
}
