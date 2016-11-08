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
				System.out.println( "請輸入數字" );
			}
		}
		return result;
	}
	public static void main( String args[] ) throws IOException
	{
		BufferedReader buf = new BufferedReader( new InputStreamReader( System.in ) );
		String[] data = { "平時成績(0~100)：", "期中成績(0~100)：", "期末成績(0~100)：" };
		String[] name;
		String[] id;
		int student = -1;
		double[] multiply = { 0.3, 0.35, 0.3 };// 成績比重
		double[] semester;// 學期成績
		int[][] score;
		double max = -1, min = 100;
		
		while( student < 0 ) student = intjudge( "請輸入學生人數：" );
		
		name = new String[student];
		id = new String[student];
		score = new int[student][3];
		semester = new double[student];
		
		int i, j;
		for( i = 0; i < student; i++ )
		{
			System.out.print( "姓名：" );
			name[i] = buf.readLine();
			
			do 
			{
				System.out.print( "學號：" );
				id[i] = buf.readLine();
				for( j = 0; j < i; j++ )
				{
					
					if( id[i].equals( id[j] ) )
					{
						System.out.println( "學號請勿重複" );
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
		
		int[] group = new int[10];// 組距計算
		for( i = 0; i < student; i++ )
		{
			for( j = 0; j < 10; j++ )//學期成績不可能達到100所以可不用處理
			{
				if( semester[i] >= j * 10 && semester[i] < (j+1) * 10 ) group[j]++;
			}
		}
		
		int[] ranktop = new int[3], rankbottom = new int[3]; // store index
		for( i = 0; i < 3; i++ )// 成績高低
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
			System.out.printf( "(1)每位學生的成績\n(2)不及格的同學以及分數\n(3)顯示各個分數組距的人數\n(4)查詢某一學號的成績\n(5)列出最高分與最低分\n(6)Exit\n>>" );
			mode = buf.readLine();
			System.out.println( "--------------------");
			switch ( mode )
			{
				case "1":
					for( i = 0; i < student; i++ )
					{
						System.out.println( "姓名:" + name[i] );
						for( j = 0; j < 3; j++ )
						{
							System.out.println( data[j].substring( 0, 4 ) + "：" + score[i][j] );
						} 
						System.out.printf( "學期成績:%.2f\n", semester[i] );
						System.out.println( "--------------------");
					}
					break;
					
				case "2":
					for( i = 0; i < student; i++ )
					{
						if( semester[i] < 60 ) System.out.printf( "%s 不及格，分數：%.2f\n", name[i], semester[i] );
						
					}
					System.out.println( "--------------------");
					break;
					
				case "3":
					for( i = 0; i < 10; i++ )
					{
						System.out.println( (i * 10) + "~" + (i * 10 + 10) + "分有 " + group[i] + " 人" );
					}
					System.out.println( "--------------------");
					break;
				
				case "4":
					String idsearch;
					j = 0;
					System.out.print( "請輸入學號：" );
					idsearch = buf.readLine();
					
					for( i = 0; i < student; i++ )
					{
						if( id[i].equals( idsearch ) )
						{
							System.out.println( "姓名:" + name[i] );
							for( j = 0; j < 3; j++ )
							{
								System.out.println( data[j].substring( 0, 4 ) + "：" + score[i][j] );
							} 
							System.out.printf( "學期成績:%.2f\n", semester[i] );
							break;
						}
						
					}
					
	
					if( j != 3 ) System.out.println( "查無此人" );
					
					System.out.println( "--------------------");
					break;
					
				case "5":
					String grade;
					int g;
					do
					{
						System.out.printf( "(a)平時成績\n(b)期中成績\n(c)期末考成績\n(d)學期成績\n>>");
						grade = buf.readLine();
						g = grade.charAt(0) - 97;
					}while( g < 0 || g > 3 );
					
					System.out.println( "---------------------------------------------" );
					if( g == 3 )
					{
						System.out.printf( "學期成績最高：%.2f\n學期成績最低：%.2f\n", max, min );
					}
					else
					{
						
						System.out.println( "成績\t最高分\t分數\t|\t最低分\t分數");
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







