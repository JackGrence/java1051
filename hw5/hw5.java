import java.io.*;
public class hw5
{
	public static void main( String args[] ) throws IOException
	{
		BufferedReader buf = new BufferedReader( new InputStreamReader( System.in ) );
		String born;
		
		System.out.print( "請輸入你的出生年份：" );
		born = buf.readLine();
		int old = Integer.parseInt( born );
		old = 2016 - old;
		System.out.println( "你今年" + old + "歲" );
		
	}

}