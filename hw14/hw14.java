import java.io.*;
public class hw14
{
	public static void main( String args[] ) throws IOException
	{
		BufferedReader buf = new BufferedReader( new InputStreamReader( System.in ) );
		int min = 0, max = 0, base = 0, number, error = 1;
		
		
		while( error == 1 )
		{
			System.out.print( "�п�J�d�򪺳̤p�ơG" );
			try
			{
				min = Integer.parseInt( buf.readLine() );
				error = 0;
			}
			catch( NumberFormatException e )
			{
				System.out.println( "�п�J�Ʀr" );
			}
		}
		error = 1;
		while( error == 1 )
		{
			System.out.print( "�п�J�d�򪺳̤j�ơG" );
			try
			{
				max = Integer.parseInt( buf.readLine() );
				error = 0;
			}
			catch( NumberFormatException e )
			{
				System.out.println( "�п�J�Ʀr" );
			}
		}
		error = 1;
		while( error == 1 )
		{
			System.out.print( "�п�J�n�M�䪺���ƪ���ȡG" );
			try
			{
				base = Integer.parseInt( buf.readLine() );
				error = 0;
			}
			catch( NumberFormatException e )
			{
				System.out.println( "�п�J�Ʀr" );
			}
		}
		
		System.out.print( base + " �����Ƭ��G" );
		
		number = min - 1;
		while( true )
		{
			number++;
			if( number > max ) break;
			if( number % base != 0 )
			{
				continue;
			}
			System.out.print( number + " " );
		}
		
		
		
		
	}

}