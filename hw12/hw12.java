import java.io.*;
public class hw12
{
	public static void main( String args[] ) throws IOException
	{
		BufferedReader buf = new BufferedReader( new InputStreamReader( System.in ) );
		int minute = -1, cell = 1;
		while( minute < 0 || minute > 30 )
		{
			System.out.print( "�п�J������(0~30)�G" );
			try
			{
				minute = Integer.parseInt( buf.readLine() );
			}
			catch( NumberFormatException e )
			{
				System.out.println( "�п�J�Ʀr" );
				minute = -1;
			}
		}
		
		int i;
		for( i = 0; i < minute; i++ )
		{
			cell *= 2;
		}
		
		System.out.println( "�g�L " + minute + " ������A�ӭM�������G " + cell + " ��" );
		
		
		
	}

}