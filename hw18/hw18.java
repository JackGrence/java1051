import java.io.*;
public class hw18
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
		int[] price = { 10, 20, 15, 24, 16 };
		String[][] produce = {{ "銷售員", "產品A", "產品B", "產品C", "產品D", "產品E", "總金額" }, 
							  { "單價", "10", "20", "15", "24", "16", "---" }};
		int[][] count = new int[5][6];
		int i, j, collen, rowlen;
		for( i = 0; i < count.length - 1; i++ ) //leave one col and row store total money
		{
			for( j = 0; j < count[0].length - 1; j++ )
			{
				count[i][j] = (int) (Math.random() * 101);
			}
		}
		
		rowlen = count.length;
		collen = count[0].length;
		for( i = 0; i < 3; i++ )// calc total amount
		{
			for( j = 0; j < collen - 1; j++ )
			{
				count[i][collen - 1] += count[i][j] * price[j];// 銷售員總業績
				count[3][j] += count[i][j] * price[j];// 產品總金額
			}
			count[3][collen - 1] += count[i][collen - 1];// 總計
		}
		
		for( i = 0; i < collen; i++ )// 業績最佳
		{
			count[4][i] = count[0][i] > count[1][i] ? count[0][i] > count[2][i] ? 1 : 3 : count[1][i] > count[2][i] ? 2 : 3;
		}
		
		for( i = 0; i < 7; i++ )//format output
		{
			for( j = 0; j < produce[0].length; j++ )
			{
				if( i == 0 ) System.out.printf( "%s\t", produce[0][j] );
				else if( i <= 3 ) 
				{
					if( j == 0 ) System.out.printf( "%d\t", i );
					else System.out.printf( "%d\t", count[ i - 1 ][ j - 1 ] );
				}
				else if( i == 4 ) System.out.printf( "%s\t", produce[1][j] );
				else if( i == 5 )
				{ 
					if( j == 0 ) System.out.printf( "%s\t", "總金額" );
					else System.out.printf( "%d\t", count[3][j-1] );
				}
				else
				{
					if( j == 0 ) System.out.printf( "%s\t", "業績" );
					else System.out.printf( "%d\t", count[4][j-1] );
				}
			}
			System.out.println();
		}
		
	}

}







