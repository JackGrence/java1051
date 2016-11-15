import java.io.*;
import java.util.*;
import java.text.*;
public class hw29
{
	public static void main(String args[]) throws IOException, ParseException
	{
		BufferedReader buf = new BufferedReader( new InputStreamReader( System.in ) );
		int i = 0, j, r[] = new int[3];
		double reduce;
		boolean chk[] = { false, false, false };
		String holidayName[] = { "元旦", "軍人節", "國慶節", };
		String holidayStr[] = { "/1/1", "/9/3", "/10/10" }, day;
		Date overDay;
		Date now = new Date();
		DateFormat df = new SimpleDateFormat( "yyyy/MM/dd" );
		System.out.print( "請輸入你的退伍日期(yyyy/MM/dd):" );
		overDay = df.parse( buf.readLine() );
		reduce = overDay.getTime() - now.getTime();
		reduce = reduce / 1000 / 60 / 60 / 24; //get days;
		reduce = reduce > (int) reduce ? (int) reduce + 1 : reduce;
		System.out.println( "你還有 " + (int) reduce + " 天退伍" );
		Date holiday[] = new Date[3];
		for( i = now.getYear(); i <= overDay.getYear(); i++ )
		{
			for( j = 0; j < 3; j++ )
			{
				day = (1900+i) + holidayStr[j];
				holiday[j] = df.parse( day );
				if( holiday[j].getTime() >= now.getTime() && holiday[j].getTime() <= overDay.getTime() ) chk[j] = true;
			}
		}
		System.out.println( "會遇到的節日有:" );
		for( i = 0; i < 3; i++ )
		{
			if( chk[i] ) System.out.print( holidayName[i] + " " );
		}
		System.out.println();
	}
}
