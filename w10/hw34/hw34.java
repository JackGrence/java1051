import java.io.*;
class Student
{
	private int intJudge( String msg ) throws IOException
	{
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
				System.out.println( "輸入錯誤" );
			}
		}
		return result;
	}
	private BufferedReader buf = new BufferedReader( new InputStreamReader( System.in ) );
	private String name;
	private int usual_score, mid_score, final_score;
	private double total_score;
	public void print()
	{
		total_score = usual_score * 0.3 + mid_score * 0.3 + final_score * 0.4;
		System.out.println( "學生:" + name );
		System.out.println( "平時成績:" + get_usual_score() );
		System.out.println( "期中考成績:" + get_mid_score() );
		System.out.println( "期末考成績:" + get_final_score() );
		System.out.println( "期末總成績:" + total_score );
	}
	public void set_name() throws IOException
	{
		System.out.print( "請輸入姓名:" );
		name = buf.readLine();

	}
	public void set_usual_score() throws IOException
	{
		do
		{
			usual_score = intJudge( "輸入平時成績:" );
			if( usual_score < 0 || usual_score > 100 ) System.out.println( "請輸入 0~100" );
		} while( usual_score < 0 || usual_score > 100);

	}
	public void set_mid_score() throws IOException
	{
		do
		{
			mid_score = intJudge( "輸入期中考成績:" );
			if( mid_score < 0 || mid_score > 100 ) System.out.println( "請輸入 0~100" );
		} while( mid_score < 0 || mid_score > 100);

	}
	public void set_final_score() throws IOException
	{
		do
		{
			final_score = intJudge( "請輸入期末考成績:" );
			if( final_score < 0 || final_score > 100 ) System.out.println( "請輸入 0~100" );
		} while( final_score < 0 || final_score > 100);

	}
	public void setScore() throws IOException
	{
		set_name();
		set_usual_score();
		set_mid_score();
		set_final_score();
		total_score = final_score * 0.3 + final_score * 0.3 + final_score * 0.4;
	}
	public String get_name()
	{
		return name;
	}
	public int get_usual_score()
	{
		return usual_score;
	}
	public int get_mid_score()
	{
		return mid_score;
	}
	public int get_final_score()
	{
		return final_score;
	}
}
public class hw34
{
	public static void main( String args[] ) throws IOException
	{
		BufferedReader buf = new BufferedReader( new InputStreamReader( System.in ) );
		Student tom = new Student();
		tom.setScore();
		tom.print();
	}

}
