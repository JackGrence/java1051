import java.io.*;
public class hw5
{
	public static void main( String args[] ) throws IOException
	{
		BufferedReader buf = new BufferedReader( new InputStreamReader( System.in ) );
		String born;
		
		System.out.print( "�п�J�A���X�ͦ~���G" );
		born = buf.readLine();
		int old = Integer.parseInt( born );
		old = 2016 - old;
		System.out.println( "�A���~" + old + "��" );
		
	}

}