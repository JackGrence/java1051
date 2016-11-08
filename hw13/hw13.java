import java.io.*;
public class hw13
{
	public static void main( String args[] ) throws IOException
	{
		BufferedReader buf = new BufferedReader( new InputStreamReader( System.in ) );
		int ph;
		do
		{
			System.out.print( "請輸入PH值：" );
			try
			{
				ph = Integer.parseInt( buf.readLine() );
			}
			catch( NumberFormatException e )
			{
				System.out.println( "請輸入數字" );
				ph = -1;
			}
		}while( ph < 0 || ph > 14 );
		
		System.out.print( "PH 值等於 " + ph + " 為：" );
	
		if( ph == 7 ) System.out.println("中性");
		else if( ph < 7 ) System.out.println( "酸性" );
		else System.out.println( "鹼性" );
		
	}

}