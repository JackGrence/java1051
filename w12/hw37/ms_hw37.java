import java.io.*;
class Car
{
	private String modelName;
	private int carLength, engCC, maxSpeed;
	public void setModel( String name )
	{
		this.modelName = name;
	}
	public void setCarlength( int length )
	{
		carLength = length > 0 ? length : 0;
	}
	public void setEngCC( int engcc )
	{
		this.engCC = engCC >= 2000 && engCC <= 5000 ? engCC : 0;
	}
	public void setMaxSpeed( int speed )
	{
		this.maxSpeed = speed >= 0 && speed <= 400 ? speed : 0;
	}
	public void showProfile()
	{
		System.out.println( "車種：" + modelName );
		System.out.println( "車身長度：" + carLength );
		System.out.println( "汽缸CC數：" + engCC );
		System.out.println( "最高車速：" + maxSpeed );
	}
	Car( String modelName, int carLength, int engCC, int maxSpeed )
	{
		setModel( modelName );
		setCarlength( carLength );
		setEngCC( engCC );
		setMaxSpeed( maxSpeed );
	}
}
public class hw37
{
	public static void main( String args[] ) throws IOException
	{
		BufferedReader buf = new BufferedReader( new InputStreamReader( System.in ) );
		Car tom, bob, jack;
		tom = new Car( "max", 100, 2500, 400 );
		bob = new Car( "mid", -10, 1000, -10 );
		jack = new Car( "min", 0, 6000, 500 );
		tom.showProfile();
		bob.showProfile();
		jack.showProfile();
	}

}
