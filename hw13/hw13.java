import java.io.*;
public class hw13
{
	public static void main( String args[] ) throws IOException
	{
		BufferedReader buf = new BufferedReader( new InputStreamReader( System.in ) );
		int ph;
		do
		{
			System.out.print( "�п�JPH�ȡG" );
			try
			{
				ph = Integer.parseInt( buf.readLine() );
			}
			catch( NumberFormatException e )
			{
				System.out.println( "�п�J�Ʀr" );
				ph = -1;
			}
		}while( ph < 0 || ph > 14 );
		
		System.out.print( "PH �ȵ��� " + ph + " ���G" );
	
		if( ph == 7 ) System.out.println("����");
		else if( ph < 7 ) System.out.println( "�ĩ�" );
		else System.out.println( "�P��" );
		
	}

}