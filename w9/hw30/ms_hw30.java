import java.io.*;
import java.util.*;
public class hw30
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
	public static void main(String args[]) throws IOException
	{
		BufferedReader buf = new BufferedReader( new InputStreamReader( System.in ) );
		int player[] = new int[6], luckyNum[] = new int[6];
		int i, j, tmp, numList[] = new int[49];
		boolean numUsage[] = new boolean[49];
		int match[] = new int[6];
		for( i = 1; i <= 49; i++ )
		{
			numList[i-1] = i;
			numUsage[i-1] = false;
		}
		for( i = 0; i < 6; i++ )
		{
			tmp = (int) (Math.random() * 49);
			luckyNum[i] = numList[tmp];
			numList[tmp] = numList[48-i];
			do
			{
				player[i] = intjudge( "第 " + (i+1) + " 個投注號碼(1-49)：");
				if( player[i] < 1 || player[i] > 49 ) System.out.println( "範圍1~49" );
				else if( numUsage[ player[i] ] ) System.out.println( "請勿輸入重複數字" );
			} while( player[i] < 1 || player[i] > 49 || numUsage[ player[i] ] );
			numUsage[ player[i] ] = true;
		}
		Arrays.sort( luckyNum );
		Arrays.sort( player );
		System.out.println( "開獎:" );
		for( i = 0; i < 6; i++ ) System.out.print( luckyNum[i] + " " );
		System.out.println();
		j = 0;
		for( i = 0; i < 6; i++ )
		{
			if( Arrays.binarySearch( player, luckyNum[i] ) >= 0 )
			{
				match[j] = luckyNum[i];
				j++;
			}
		}
		System.out.println( "中了 " + j + " 個號碼:");
		for( i = 0; i < j; i++ ) System.out.print( match[i] + " " );
		System.out.println();
	}
}
