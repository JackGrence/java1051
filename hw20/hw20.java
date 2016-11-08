import java.io.*;
public class hw20
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
		String[] id;
		int student = -1;
		double[] multiply = { 0.3, 0.35, 0.3 };// ���Z��
		double[] semester;// �Ǵ����Z
		int[][] score;
		double max = -1, min = 100;
		
		while( student < 0 ) student = intjudge( "�п�J�ǥͤH�ơG" );
		
		name = new String[student];
		id = new String[student];
		score = new int[student][3];
		semester = new double[student];
		
		int i, j;
		for( i = 0; i < student; i++ )
		{
			System.out.print( "�m�W�G" );
			name[i] = buf.readLine();
			
			do 
			{
				System.out.print( "�Ǹ��G" );
				id[i] = buf.readLine();
				for( j = 0; j < i; j++ )
				{
					
					if( id[i].equals( id[j] ) )
					{
						System.out.println( "�Ǹ��Фŭ���" );
						id[i] = "";
						break;
					}
				}
			}while( id[i] == "" );
			
			
			for( j = 0; j < data.length; j++ )
			{
				do score[i][j] = intjudge( data[j] ); while( score[i][j] < 0 || score[i][j] > 100 );
				semester[i] += score[i][j] * multiply[j];
			}
			max = semester[i] > max ? semester[i] : max;
			min = semester[i] < min ? semester[i] : min;
		}
		
		int[] group = new int[10];// �նZ�p��
		for( i = 0; i < student; i++ )
		{
			for( j = 0; j < 10; j++ )//�Ǵ����Z���i��F��100�ҥH�i���γB�z
			{
				if( semester[i] >= j * 10 && semester[i] < (j+1) * 10 ) group[j]++;
			}
		}
		
		int[] ranktop = new int[3], rankbottom = new int[3]; // store index
		for( i = 0; i < 3; i++ )// ���Z���C
		{
			ranktop[i] = 0;
			rankbottom[i] = 0;
			//System.out.print( data[i].substring( 0, 2 ) + "\t" );
			for( j = 0; j < student; j++ )
			{
				ranktop[i] = score[j][i] > score[ranktop[i]][i] ? j : ranktop[i];
				rankbottom[i] = score[j][i] < score[rankbottom[i]][i] ? j : rankbottom[i];
			}
			//
		}
		
		
		String mode;
		boolean run = true;
		while( run )
		{
			System.out.printf( "(1)�C��ǥͪ����Z\n(2)���ή檺�P�ǥH�Τ���\n(3)��ܦU�Ӥ��ƲնZ���H��\n(4)�d�߬Y�@�Ǹ������Z\n(5)�C�X�̰����P�̧C��\n(6)Exit\n>>" );
			mode = buf.readLine();
			System.out.println( "--------------------");
			switch ( mode )
			{
				case "1":
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
					break;
					
				case "2":
					for( i = 0; i < student; i++ )
					{
						if( semester[i] < 60 ) System.out.printf( "%s ���ή�A���ơG%.2f\n", name[i], semester[i] );
						
					}
					System.out.println( "--------------------");
					break;
					
				case "3":
					for( i = 0; i < 10; i++ )
					{
						System.out.println( (i * 10) + "~" + (i * 10 + 10) + "���� " + group[i] + " �H" );
					}
					System.out.println( "--------------------");
					break;
				
				case "4":
					String idsearch;
					j = 0;
					System.out.print( "�п�J�Ǹ��G" );
					idsearch = buf.readLine();
					
					for( i = 0; i < student; i++ )
					{
						if( id[i].equals( idsearch ) )
						{
							System.out.println( "�m�W:" + name[i] );
							for( j = 0; j < 3; j++ )
							{
								System.out.println( data[j].substring( 0, 4 ) + "�G" + score[i][j] );
							} 
							System.out.printf( "�Ǵ����Z:%.2f\n", semester[i] );
							break;
						}
						
					}
					
	
					if( j != 3 ) System.out.println( "�d�L���H" );
					
					System.out.println( "--------------------");
					break;
					
				case "5":
					String grade;
					int g;
					do
					{
						System.out.printf( "(a)���ɦ��Z\n(b)�������Z\n(c)�����Ҧ��Z\n(d)�Ǵ����Z\n>>");
						grade = buf.readLine();
						g = grade.charAt(0) - 97;
					}while( g < 0 || g > 3 );
					
					System.out.println( "---------------------------------------------" );
					if( g == 3 )
					{
						System.out.printf( "�Ǵ����Z�̰��G%.2f\n�Ǵ����Z�̧C�G%.2f\n", max, min );
					}
					else
					{
						
						System.out.println( "���Z\t�̰���\t����\t|\t�̧C��\t����");
						System.out.println( "---------------------------------------------" );
						System.out.printf( "%s\t%s\t%d\t|\t%s\t%d\n",data[g].substring(0, 2), name[ ranktop[g] ], score[ ranktop[g] ][g], name[ rankbottom[g] ], score[ rankbottom[g] ][g] );
						
					}
					System.out.println( "---------------------------------------------" );
					break;
				
				case "6":
					run = false;
					break;
			}
		}
	}

}







