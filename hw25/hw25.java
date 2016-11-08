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
				System.out.println( "�п�J�Ʀr" );
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
				System.out.println( "�п�J�Ʀr" );
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
				System.out.println( "�A�X�����_�_�����G" + pokemon[player] );
				System.out.println( "�q���X�����_�_�����G" + pokemon[computer] );
				System.out.println( "���G���G" + pkResult[status] );
				System.out.println( "���Z�G" + pkStatus[0] + "��" + pkStatus[1] + "��");
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
				System.out.println( "�A�X�����_�_�����G" + pokemon[player] );
				System.out.println( "�q���X�����_�_�����G" + pokemon[computer] );
				System.out.println( "���G���G" + pkResult[status] );
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
			System.out.print( "�п�J�z�n�X�����_�_����(0�G�p���s�B1�G�ǥ��t�B2�G����ؤl)�G" );
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
					System.out.println( "��J���~�I�Э��s��J" );
			}
		}
		return Integer.parseInt( choose );
	}
	private static int pk = 0;
	private static String pokemon[] = { "�p���s", "�ǥ��t", "����ؤl" };
	private static String finalResult[] = { "�԰��ӧQ�I�I�I", "�԰����ѡI�I�I", "���襭��I�I�I" };
	private static String pkResult[] = { "�AĹ�F�I", "�A��F�I", "����I" };
	private static void pokemonPkMode() throws IOException
	{
		BufferedReader buf = new BufferedReader( new InputStreamReader( System.in ) );
		String pkmode;
		boolean exit = true;
		while( exit )
		{
			System.out.print( "�п�ܾ԰�����(0:�T�Ԩ�ӡB1:�@���w�ӭt)�G" );
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
					System.out.println( "��J���~�I�Э��s��J" );
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







