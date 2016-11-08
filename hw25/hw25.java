import java.io.*;
public class hw25
{
	private static double doubleJudge( String msg ) throws IOException
	{
		BufferedReader buf = new BufferedReader( new InputStreamReader( System.in ) );
		int error;
		double result = 0;
		error = 1;
		while( error == 1 )
		{
			System.out.print( msg );
			try
			{
				result = Double.parseDouble( buf.readLine() );
				error = 0;
			}
			catch( NumberFormatException e )
			{
				System.out.println( "請輸入數字" );
			}
		}
		return result;
	}
	private static int intJudge( String msg ) throws IOException
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
		int round, computer, player, status;
		int pkStatus[] = { 0, 0, 0 };
		pokemonPkMode();
		if( pk == 0 )
		{
			for( round = 0; round < 3; round++ )
			{
				player = selectPokemon();
				computer = (int) ( Math.random() * 3 );
				status = pokemonPK( player, computer );
				pkStatus[ status ]++;
				System.out.println( "你出的神奇寶貝為：" + pokemon[player] );
				System.out.println( "電腦出的神奇寶貝為：" + pokemon[computer] );
				System.out.println( "結果為：" + pkResult[status] );
				System.out.println( "戰績：" + pkStatus[0] + "勝" + pkStatus[1] + "敗");
				if( pkStatus[0] >= 2 || pkStatus [1] >= 2 ) break;
			}
			status = pkStatus[0] == pkStatus[1] ? 2 : pkStatus[0] > pkStatus[1] ? 0 : 1;
			
		}
		else
		{
			do
			{
				player = selectPokemon();
				computer = (int) ( Math.random() * 3 );
				status = pokemonPK( player, computer );
				System.out.println( "你出的神奇寶貝為：" + pokemon[player] );
				System.out.println( "電腦出的神奇寶貝為：" + pokemon[computer] );
				System.out.println( "結果為：" + pkResult[status] );
			} while( status == 2 );
		}
		System.out.println( finalResult[status] );
	}
	private static int selectPokemon() throws IOException
	{
		BufferedReader buf = new BufferedReader( new InputStreamReader( System.in ) );
		String choose = "0";
		boolean exit = true;
		while( exit )
		{
			System.out.print( "請輸入您要出的神奇寶貝為(0：小火龍、1：傑尼龜、2：妙蛙種子)：" );
			choose = buf.readLine();
			exit = false;
			switch( choose )
			{
				case "0":
				case "1":
				case "2":
					break;
				default:
					exit = true;
					System.out.println( "輸入錯誤！請重新輸入" );
			}
		}
		return Integer.parseInt( choose );
	}
	private static int pk = 0;
	private static String pokemon[] = { "小火龍", "傑尼龜", "妙蛙種子" };
	private static String finalResult[] = { "戰鬥勝利！！！", "戰鬥失敗！！！", "雙方平手！！！" };
	private static String pkResult[] = { "你贏了！", "你輸了！", "平手！" };
	private static void pokemonPkMode() throws IOException
	{
		BufferedReader buf = new BufferedReader( new InputStreamReader( System.in ) );
		String pkmode;
		boolean exit = true;
		while( exit )
		{
			System.out.print( "請選擇戰鬥機制(0:三戰兩勝、1:一局定勝負)：" );
			pkmode = buf.readLine();
			exit = false;
			switch( pkmode )
			{
				case "0":
					pk = 0;
					break;
				case "1":
					pk = 1;
					break;
				default:
					System.out.println( "輸入錯誤！請重新輸入" );
					exit = true;
			}
		}
	}
	
	private static int pokemonPK( int player, int computer )
	{
		int winList[][] = {{2, 1, 0},
						   {0, 2, 1},
						   {1, 0, 2}};
		return winList[player][computer];
	}
}







