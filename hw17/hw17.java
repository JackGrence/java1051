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
				System.out.println( "�п�J�Ʀr" );
			}
		}
		return result;
	}
	public static void main( String args[] ) throws IOException
	{
		BufferedReader buf = new BufferedReader( new InputStreamReader( System.in ) );
		String name, id;
		String pokemon[] = { "�֥d�C", "�ǥ��t", "�Q���s", "����ؤl", "�d���~", "���s" };
		int len = pokemon.length, rnd;
		
		System.out.println( "���ߧA�o����쪺�������_�_�����O���G" );
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







