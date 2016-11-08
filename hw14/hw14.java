import java.io.*;
public class hw14
{
	public static void main( String args[] ) throws IOException
	{
		BufferedReader buf = new BufferedReader( new InputStreamReader( System.in ) );
		int min = 0, max = 0, base = 0, number, error = 1;
		
		
		while( error == 1 )
		{
			System.out.print( "請輸入範圍的最小數：" );
			try
			{
				min = Integer.parseInt( buf.readLine() );
				error = 0;
			}
			catch( NumberFormatException e )
			{
				System.out.println( "請輸入數字" );
			}
		}
		error = 1;
		while( error == 1 )
		{
			System.out.print( "請輸入範圍的最大數：" );
			try
			{
				max = Integer.parseInt( buf.readLine() );
				error = 0;
			}
			catch( NumberFormatException e )
			{
				System.out.println( "請輸入數字" );
			}
		}
		error = 1;
		while( error == 1 )
		{
			System.out.print( "請輸入要尋找的倍數的基值：" );
			try
			{
				base = Integer.parseInt( buf.readLine() );
				error = 0;
			}
			catch( NumberFormatException e )
			{
				System.out.println( "請輸入數字" );
			}
		}
		
		System.out.print( base + " 的倍數為：" );
		
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