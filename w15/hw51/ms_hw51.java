public class hw51
{
	public static void main( String args[] )
	{
		Phone wong[] = new Phone[3];
		wong[0] = new Telephone( 30, 50 );
		wong[1] = new Cellphone( 120, 40, 120 );
		wong[2] = new table( 30, 20, 30 );
		for( Phone cur: wong )
		{
			cur.showMessage();
		}
	}
}
