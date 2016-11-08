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
				System.out.println( "請輸入數字" );
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
		
		
		while( people < 0 ) people = intjudge( "請輸入學生人數：" );
		int score[] = new int[ people ];
		System.out.println( "--------------------------------------" );
		System.out.println( "開始輸入學生成績" );
		int i;
		for( i = 0; i < people; i++ )
		{
			
			score[i] = -1;
			while( score[i] < 0 || score[i] > 100 ) score[i] = intjudge( "請輸入第" + (i + 1) + "位學生成績：" );
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
		System.out.println( "成績統計結果如下：" );
		System.out.printf( "總共有%d筆資料，%d人不及格，%d人及格，最高分為%d，最低分為%d\n", people, fail, sucess, max, min );
		
		
	}

}







