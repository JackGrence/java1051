import java.io.*;
public class hw9
{
	public static void main( String args[] ) throws IOException
	{
		BufferedReader buf = new BufferedReader( new InputStreamReader( System.in ) );
		String str;
		int score = -1;
		System.out.print( "請輸入學期成績：" );
		str = buf.readLine();
		try
		{
			score = Integer.parseInt( str );
		}
		catch( Exception e )
		{
			System.out.println( "您輸入的不是數字" );
			System.exit(1);
		}
		
		if( score > 100 || score < 0 )
		{
			System.out.println( "輸入格式錯誤。" );
		}
		else if( score >= 60 )
		{
			System.out.print( "本學期成績為：" );
			if( score <= 80) System.out.println("B");
			else System.out.println( "A" );
		}
		else System.out.println( "本學期成績為：F" );
		
	}

}