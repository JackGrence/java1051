import java.io.*;
public class hw8
{
	public static void main( String args[] ) throws IOException
	{
		BufferedReader buf = new BufferedReader( new InputStreamReader( System.in ) );
		int carnation, price, cash, total;
		System.out.print( "�d�D�ɪ�������G" );
		price = Integer.parseInt( buf.readLine() );
		System.out.print( "�п�J�ȤH�R���d�D�ɼƶq�G" );
		carnation = Integer.parseInt( buf.readLine() );
		System.out.print( "�п�J�ȤH�I�ڪ��B�G" );
		cash = Integer.parseInt( buf.readLine() );
		
		total = price * carnation;
		if( total > cash )
		{
			System.out.println( "�A�I�ڪ����B����" );
		}
		else
		{
			System.out.println( "��I�G" + cash + "���I�G" + total + "�A��s�G" + (cash - total) );
			
		}
		
	}

}