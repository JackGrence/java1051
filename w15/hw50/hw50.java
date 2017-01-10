public class hw50
{
	public static void main( String args[] )
	{
		Vehicle v[] = new Vehicle[3];
		v[0] = new Train( "tomas", 1000 );
		v[1] = new Ship( "ship", 10 );
		v[2] = new Plane( "747", 10000 );
		for( Vehicle cur: v )
		{
			cur.show();
			cur.move();
		}
	}
}
