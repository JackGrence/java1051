import java.io.*;
public class hw17
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
		String name, id;
		String pokemon[] = { "皮卡丘", "傑尼龜", "噴火龍", "妙蛙種子", "卡比獸", "快龍" };
		int len = pokemon.length, rnd;
		
		System.out.println( "恭喜你這次扭到的五隻神奇寶貝分別為：" );
		int i;
		for( i = 0; i < 5; i++ )
		{
			rnd = (int) ( Math.random() * len );
			System.out.println( pokemon[rnd] );
			len--;
			pokemon[ rnd ] = pokemon[ len ];
		}
		
		
	}

}







