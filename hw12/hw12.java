import java.io.*;
public class hw12
{
	public static void main( String args[] ) throws IOException
	{
		BufferedReader buf = new BufferedReader( new InputStreamReader( System.in ) );
		int minute = -1, cell = 1;
		while( minute < 0 || minute > 30 )
		{
			System.out.print( "請輸入分鐘數(0~30)：" );
			try
			{
				minute = Integer.parseInt( buf.readLine() );
			}
			catch( NumberFormatException e )
			{
				System.out.println( "請輸入數字" );
				minute = -1;
			}
		}
		
		int i;
		for( i = 0; i < minute; i++ )
		{
			cell *= 2;
		}
		
		System.out.println( "經過 " + minute + " 分鐘後，細胞分裂為： " + cell + " 個" );
		
		
		
	}

}