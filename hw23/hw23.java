import java.io.*;
public class hw23
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
		String lunch;
		lunchList = new String[1];
		inputOption();
		lunch = lunchSelect();
		lunchPlan( lunch );
	}
	private static String lunchList[];
	private static int lunchCount = 0;
	private static void inputOption() throws IOException
	{
		BufferedReader buf = new BufferedReader( new InputStreamReader( System.in ) );
		
		int addCount, i;
		do addCount = intjudge( "請輸入午餐選項的數目：" ); while( addCount < 0 );
		lunchList = new String[lunchCount+addCount];
		for( i = 0; i < addCount; i++ )
		{
			System.out.print( "請輸入第" + (i + 1 + lunchCount) + "個午餐選項：" );
			lunchList[ i + lunchCount ] = buf.readLine();
		}
		lunchCount += addCount;
	}
	private static String lunchSelect()
	{
		int rnd = (int) ( Math.random() * lunchCount );
		System.out.printf( "選到第%d個午餐選項，今天午餐吃%s\n", rnd + 1, lunchList[ rnd ] );
		return lunchList[ rnd ];
	}
	
	private static void lunchPlan( String lastLunch )
	{
		int rnd, i;
		String lunch;
		if( lunchCount <= 1 )
		{
			System.out.println( "午餐選項不夠，每天吃一樣的會膩。" );
			return;
		}
		System.out.println( "明天開始一周的午餐選項是：" );
		for( i = 0; i < 7; i++ )
		{
			do 
			{
				rnd = (int) ( Math.random() * lunchCount );
				//System.out.println( rnd );
				lunch = lunchList[rnd];
			} while( lastLunch.equals( lunch ) );
			System.out.printf( "第%d天吃%s\n", i+1, lunch );
			lastLunch = lunch;
		}
	}
	//Math.random()
}







