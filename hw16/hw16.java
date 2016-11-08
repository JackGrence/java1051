import java.io.*;
public class hw16
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
		boolean error = true;
		int people = -1;
		int fail = 0, sucess = 0, max = 0, min = 0;
		
		
		while( people < 0 ) people = intjudge( "�п�J�ǥͤH�ơG" );
		int score[] = new int[ people ];
		System.out.println( "--------------------------------------" );
		System.out.println( "�}�l��J�ǥͦ��Z" );
		int i;
		for( i = 0; i < people; i++ )
		{
			
			score[i] = -1;
			while( score[i] < 0 || score[i] > 100 ) score[i] = intjudge( "�п�J��" + (i + 1) + "��ǥͦ��Z�G" );
			if( i == 0 )
			{
				max = score[i];
				min = score[i];
			}
			max = score[i] > max ? score[i] : max;
			min = score[i] < min ? score[i] : min;
			if( score[i] < 60 ) fail++;
			else sucess++;
		}
		System.out.println( "--------------------------------------" );
		System.out.println( "���Z�έp���G�p�U�G" );
		System.out.printf( "�`�@��%d����ơA%d�H���ή�A%d�H�ή�A�̰�����%d�A�̧C����%d\n", people, fail, sucess, max, min );
		
		
	}

}







