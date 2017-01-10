public class hw52
{
	public static void main( String args[] )
	{
		Object obj[] = new Object[4];
		int i;
		for( i = 0; i < 2; i++ )
		{
			obj[i] = new Bird( i + "號", i + "色" );
			obj[2+i] = new Plane( (2+i) + "號", i );
			((Bird) obj[i]).show();
			((Bird) obj[i]).fly();
			((Plane) obj[i+2]).show();
			((Plane) obj[i+2]).fly();
		}
	}
}
