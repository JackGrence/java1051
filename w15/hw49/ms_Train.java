public class Train extends Vehicle
{
	public Train( String name, double speed )
	{
		super( name, speed );
	}
	public void move()
	{
		System.out.println( "火車在路上跑" );
	}
}
