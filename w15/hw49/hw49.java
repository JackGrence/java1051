public class hw49
{
	public static void main( String args[] )
	{
		Train t = new Train( "tomas", 1000 );
		Ship s = new Ship( "ship", 10 );
		Plane p = new Plane( "747", 10000 );
		t.show();
		t.move();
		s.show();
		s.move();
		p.show();
		p.move();
	}
}
