import java.io.*;
public class hw6
{
	public static void main( String args[] ) throws IOException
	{
		BufferedReader buf = new BufferedReader( new InputStreamReader( System.in ) );
		String sdt_num, name, born;
		int height, weight;
		double bmi, h, w;
	
		System.out.print( "�п�J�A�������Ҧr���G" );
		sdt_num = buf.readLine();
		
		System.out.print( "�п�J�A���m�W�G" );
		name = buf.readLine();
		
		System.out.print( "�п�J�A���~�֡G" );
		born = buf.readLine();
		
		System.out.print( "�п�J�A������(cm)�G" );
		height = Integer.parseInt( buf.readLine() ); 
		
		System.out.print( "�п�J�A���魫�G" );
		weight = Integer.parseInt( buf.readLine() );
		
		h = ( double ) height;
		w = ( double ) weight;
		
		bmi = weight /  ( ( (double)height / 100 ) * ( (double)height / 100 ) );
		System.out.println( bmi );
		
		
		
		System.out.print( name + "�A���魫�ݩ�" );
		
		if( bmi > 18.5 && bmi < 22.9 )
		{
			System.out.println( "���`" );
		}
		else
		{
			System.out.println( "�����`" );
		}
		
	}
}