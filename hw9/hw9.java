import java.io.*;
public class hw9
{
	public static void main( String args[] ) throws IOException
	{
		BufferedReader buf = new BufferedReader( new InputStreamReader( System.in ) );
		String str;
		int score = -1;
		System.out.print( "�п�J�Ǵ����Z�G" );
		str = buf.readLine();
		try
		{
			score = Integer.parseInt( str );
		}
		catch( Exception e )
		{
			System.out.println( "�z��J�����O�Ʀr" );
			System.exit(1);
		}
		
		if( score > 100 || score < 0 )
		{
			System.out.println( "��J�榡���~�C" );
		}
		else if( score >= 60 )
		{
			System.out.print( "���Ǵ����Z���G" );
			if( score <= 80) System.out.println("B");
			else System.out.println( "A" );
		}
		else System.out.println( "���Ǵ����Z���GF" );
		
	}

}