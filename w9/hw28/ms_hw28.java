import java.io.*;
import java.util.Arrays;
public class hw28
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader buf = new BufferedReader( new InputStreamReader( System.in ) );
		int i = 0, r[] = new int[3];
		String judge;
		for( i = 0; i < 3; i++ )
		{
			if( i > 0 )
			{
				System.out.print( "請問是否有第 " + (i + 1) + " 個邊長要輸入?(y/n):" );
				judge = buf.readLine();
				if( judge.equals( "n" ) ) break;
			}

			System.out.print( "請輸入第 " + (i + 1) + " 個邊長:" );
			r[i] = Integer.parseInt( buf.readLine() );
		}

		switch( i )
		{
			case 1:
				calArea( r[0] );
				break;
			case 2:
				calArea( r[0], r[1] );
				break;
			case 3:
				calArea( r[0], r[1], r[2] );
				break;
		}

	}
	public static void calArea( int r )
	{
		System.out.println( "這是一個正方形，面積為 " + r * r );
	}
	public static void calArea( int r1, int r2 )
	{
		System.out.println( "這是一個長方形，面積為 " + r1 * r2 );
	}
	public static void calArea( int r1, int r2, int r3 )
	{
		int r[] = new int[3];
		r[0] = r1;
		r[1] = r2;
		r[2] = r3;
		Arrays.sort( r );
		int i;
		if( r[0] * r[0] + r[1] * r[1] == r[2] * r[2] )
		{
			System.out.println( "這是一個直角三角形，面積為 " + r[0] * r[1] / 2 );
		}
		else
		{
			System.out.println( "很抱歉您輸入的不是直角三角形我無法幫你計算面積." );
		}
	}
}
