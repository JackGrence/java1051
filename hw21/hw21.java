import java.io.*;
public class hw21
{
	private static int intjudge( String msg ) throws IOException
	{
		BufferedReader buf = new BufferedReader( new InputStreamReader( System.in ) );
		int error, result = 0;
		error = 1;
		while( error == 1 )
		{
			System.out.print( msg );
			try
			{
				result = Integer.parseInt( buf.readLine() );
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
		int cell;
		do 
		{
			cell = intjudge( "請輸入分鐘數(0~30)：" );
			if( cell < 0 || cell > 30 ) System.out.println( "輸入錯誤" );
		} while( cell < 0 || cell > 30 );
		cellDivision( cell );
	}
	
	private static void cellDivision( int minute )
	{
		int i, result = 1;
		for( i = 0; i < minute; i++ )
		{
			result *= 2;
		}
		System.out.println( "經過 " + minute + " 分鐘後，細胞分裂為：" + result + "個。" );
	}
}







