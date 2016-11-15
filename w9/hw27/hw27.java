import java.io.*;
public class hw27
{
	public static void main(String args[]) {
		calArea(10);
		calArea(100,500);
		calArea(10.5);
		calArea(7.5, 13.6);
	}
	public static void calArea( double r )
	{
		System.out.println( "這是一個正方形，面積為 " + r * r );
	}
	public static void calArea( double r1, double r2 )
	{
		System.out.println( "這是一個長方形，面積為 " + r1 * r2 );
	}
}
