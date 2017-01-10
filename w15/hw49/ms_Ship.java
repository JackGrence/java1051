public class Ship extends Vehicle
{
	public Ship( String name, double speed )
	{
		super( name, speed );
	}
	public void move()
	{
		System.out.println( "船在水中航行" );
	}
}
