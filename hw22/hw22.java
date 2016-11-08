import java.io.*;
public class hw22
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
		int pokemon[] = new int[3];
		int i;
		for( i = 0; i < pokemonCount; i++ )
		{
			pokemon[i] = intjudge( "�п�J��" + (i + 1) + "�����_�_�������šG" );
		}
		printPokemon( pokemon );
		levelUP( pokemon );
		printPokemon( pokemon );
	}
	private static int pokemonCount = 3;
	private static void levelUP( int arr[] )
	{
		int i = 0;
		for( i = 0; i < pokemonCount; i++ )
		{
			arr[i] += 5;
		}
		System.out.println( "�@��" + i + "�����_�_���ɯŧ����I" );
	}
	
	private static void printPokemon( int arr[] )
	{
		int i;
		System.out.println( pokemonCount + "�����_�_�������Ť��O���G" );
		for( i = 0; i < pokemonCount; i++ )
		{
			System.out.println( arr[i] );
		}
		
	}
}







