public class Plane extends Vehicle implements Flyer
{
	public Plane( String name, double speed )
	{
		//super( name, speed );
		super.setName(name);
		super.setSpeed(speed);
	}
	public void fly()
	{
		System.out.println( name + "在天上飛" );
	}
}
