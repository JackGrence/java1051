import java.io.*;
public class hw17_1
{
	public static void main( String args[] ) throws IOException
	{
		int a;
		BufferedReader buf = new BufferedReader( new InputStreamReader( System.in ) );
		System.out.print( "請輸入您的年齡：" );
		try
		{
			a = Integer.parseInt( buf.readLine() );
			System.out.println( "您的年齡為：" + a );
		}
		catch( NumberFormatException e )
		{
			System.out.println( "輸入錯誤，請重新輸入" );
			main( args );
		}
	}
}
