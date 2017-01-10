public class Plane extends Vehicle
{
	public Plane( String name, double speed )
	{
		super( name, speed );
	}
	public void move()
	{
		System.out.println( "飛機在天上飛" );
	}
}
