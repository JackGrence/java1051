import java.io.*;
public class hw24
{
	private static double doubleJudge( String msg ) throws IOException
	{
		BufferedReader buf = new BufferedReader( new InputStreamReader( System.in ) );
		int error;
		double result = 0;
		error = 1;
		while( error == 1 )
		{
			System.out.print( msg );
			try
			{
				result = Double.parseDouble( buf.readLine() );
				error = 0;
			}
			catch( NumberFormatException e )
			{
				System.out.println( "請輸入數字" );
			}
		}
		return result;
	}
	public static void main( String args[] ) throws IOException
	{
		BufferedReader buf = new BufferedReader( new InputStreamReader( System.in ) );
		String mode;
		
		
		while( true )
		{
			System.out.print( "輸入運算面積的類型代號 (0:圓形 1:三角形 2:正方型 3:梯形)：" );
			mode = buf.readLine();
			switch(mode)
			{
				case "0":
					System.out.println( "面積為" + circle() );
					break;
				case "1":
					System.out.println( "面積為" + triangle() );
					break;
				case "2":
					System.out.println( "面積為" + square() );
					break;
				case "3":
					System.out.println( "面積為" + trapezium() );
					break;
				default:
					System.out.println( "輸入錯誤！請重新輸入" );
			}
		}
	}
	
	public static double trapezium() throws IOException
	{
		double up, down, high;
		do up = doubleJudge( "輸入上底：" ); while( up < 0 );
		do down = doubleJudge( "輸入下底：" ); while( down < 0 );
		do high = doubleJudge( "輸入高：" ); while( high < 0 );
		return (up + down) * high / 2;
	}
	
	public static double square() throws IOException
	{
		double r;
		do r = doubleJudge( "請輸入邊長：" ); while( r < 0 );
		return r * r;
	}
	
	private static boolean triangleJudge( double r[] )
	{
		boolean result = false;
		result = r[2] >= r[0] + r[1] ? false : r[1] >= r[0] + r[2] ? false : r[0] >= r[1] + r[2] ? false : true;
		return result;
	}
	
	public static double triangle() throws IOException
	{
		int i;
		double r[] = new double[3];
		for( i = 0; i < 2; i++ )
		{
			do r[i] = doubleJudge( "請輸入第" + (i + 1) + "個邊長：" ); while( r[i] <= 0 );
		}
		do 
		{
			r[2] = doubleJudge( "請輸入第" + (i + 1) + "個邊長：" );
			if( triangleJudge(r) == false ) 
			{
				System.out.println( "這不是三角形" );
				r[2] = -1;
			}
		} while( r[2] <= 0 );
		
		double s;
		s = ( r[0] + r[1] + r[2] ) / 2;
		return Math.sqrt( s*(s-r[0])*(s-r[1])*(s-r[2]) );
	}
	
	public static double circle() throws IOException
	{
		double r;
		do r = doubleJudge( "請輸入半徑：" ); while( r < 0 );
		return r * r * Math.PI;
	}
}







