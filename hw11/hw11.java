import java.io.*;
public class hw11
{
	public static void main( String args[] ) throws IOException
	{
		BufferedReader buf = new BufferedReader( new InputStreamReader( System.in ) );
		int year = -1, month = -1, day = 0;
		while( year < 0 )
		{
			System.out.print( "請輸入年份：" );
			try
			{
				year = Integer.parseInt( buf.readLine() );
			}
			catch( NumberFormatException e )
			{
				System.out.println( "請輸入數字" );
				year = -1;
			}
			
		}
		while( month < 1 || month > 12 )
		{
			System.out.print( "請輸入月份：" );
			try
			{
				month = Integer.parseInt( buf.readLine() );
			}
			catch( NumberFormatException e )
			{
				System.out.println( "請輸入數字" );
				month = -1;
			}
			
		}
		switch( month )
		{
			case 1:
				day = 31;
				break;
			case 3:
				day = 31;
				break;
			case 5:
				day = 31;
				break;
			case 7:
				day = 31;
				break;
			case 8:
				day = 31;
				break;
			case 10:
				day = 31;
				break;
			case 12:
				day = 31;
				break;
			case 4:
				day = 30;
				break;
			case 6:
				day = 30;
				break;
			case 9:
				day = 30;
				break;
			case 11:
				day = 30;
				break;
			case 2:
				if( year % 400 == 0 )
				{
					day = 29;
				}
				else if( year % 4 == 0 && year % 100 != 0 )
				{
					day = 29;
				}
				else
				{
					day = 28;
				}
		}
		System.out.println( month + " 月有 " + day + " 天" );
		
		
		
	}

}