import java.io.*;
public class hw19
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
		String[] data = { "���ɦ��Z(0~100)�G", "�������Z(0~100)�G", "�������Z(0~100)�G" };
		String[] name;
		int student = -1;
		double[] multiply = { 0.3, 0.35, 0.3 };// ���Z��
		double[] semester;// �Ǵ����Z
		int[][] score;
		double max = -1, min = 100;
		
		while( student < 0 ) student = intjudge( "�п�J�ǥͤH�ơG" );
		
		name = new String[student];
		score = new int[student][3];
		semester = new double[student];
		
		int i, j;
		for( i = 0; i < student; i++ )
		{
			System.out.print( "�m�W�G" );
			name[i] = buf.readLine();
			for( j = 0; j < data.length; j++ )
			{
				do score[i][j] = intjudge( data[j] ); while( score[i][j] < 0 || score[i][j] > 100 );
				semester[i] += score[i][j] * multiply[j];
			}
			max = semester[i] > max ? semester[i] : max;
			min = semester[i] < min ? semester[i] : min;
		}
		System.out.println( "----------output----------" );
		for( i = 0; i < student; i++ )
		{
			System.out.println( "�m�W:" + name[i] );
			for( j = 0; j < 3; j++ )
			{
				System.out.println( data[j].substring( 0, 4 ) + "�G" + score[i][j] );
			} 
			System.out.printf( "�Ǵ����Z:%.2f\n", semester[i] );
			System.out.println( "--------------------");
		}
		System.out.printf( "�Ǵ����Z�̰��G%.2f\n�Ǵ����Z�̧C�G%.2f\n", max, min );
		System.out.println( "--------------------");
		
		for( i = 0; i < student; i++ )
		{
			if( semester[i] < 60 ) System.out.printf( "%s ���ή�A���ơG%.2f\n", name[i], semester[i] );
			
		}
		System.out.println( "--------------------");
		
		int[] group = new int[10];
		for( i = 0; i < student; i++ )
		{
			for( j = 0; j < 10; j++ )//�Ǵ����Z���i��F��100�ҥH�i���γB�z
			{
				if( semester[i] >= j * 10 && semester[i] < (j+1) * 10 ) group[j]++;
			}
		}
		
		for( i = 0; i < 10; i++ )
		{
			System.out.println( (i * 10) + "~" + (i * 10 + 10) + "���� " + group[i] + " �H" );
		}
		System.out.println( "---------------------------------------------");
		System.out.println( "���Z\t�̰���\t����\t|\t�̧C��\t����");
		System.out.println( "---------------------------------------------" );
		
		int ranktop = 0, rankbottom = 0; // store index
		for( i = 0; i < 3; i++ )
		{
			System.out.print( data[i].substring( 0, 2 ) + "\t" );
			for( j = 0; j < student; j++ )
			{
				ranktop = score[j][i] > score[ranktop][i] ? j : ranktop;
				rankbottom = score[j][i] < score[rankbottom][i] ? j : rankbottom;
			}
			System.out.printf( "%s\t%d\t|\t%s\t%d\n", name[ranktop], score[ranktop][i], name[rankbottom], score[rankbottom][i] );
		}
		System.out.println( "---------------------------------------------" );
		
	}

}







