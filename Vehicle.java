package Abstract30Secdember;

 interface Vehicle
{
	 abstract void  numWheels(); 
}
class Car implements Vehicle
{
	public void numWheels() 
	{
		System.out.println("Its Four Wheels in car");
		
	}
	
}
class Truck implements Vehicle
{
	public void numWheels() 
	{
		System.out.println("Its six Wheels in Truck");
		
	}
}
