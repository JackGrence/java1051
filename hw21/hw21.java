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
				System.out.println( "�п�J�Ʀr" );
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
			cell = intjudge( "�п�J������(0~30)�G" );
			if( cell < 0 || cell > 30 ) System.out.println( "��J���~" );
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
		System.out.println( "�g�L " + minute + " ������A�ӭM�������G" + result + "�ӡC" );
	}
}







