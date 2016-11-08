import java.io.*;
public class hw15
{
	
	public static void main( String args[] ) throws IOException
	{
		BufferedReader buf = new BufferedReader( new InputStreamReader( System.in ) );
		String name, id;
		boolean error = true;
		int year = 0, height = 0, weight = 0;
		float bmi;
		
		System.out.print( "�п�J�z���m�W�G" );
		name = buf.readLine();
		
		do
		{
			System.out.print( "�п�J�z�������Ҧr���G" );
			id = buf.readLine();
		}while( id.length() != 10 );
		
		error = true;
		while( error )
		{
			System.out.print( "�п�J�z���X�ͦ褸�~�G" );
			try
			{
				year = Integer.parseInt( buf.readLine() );
				error = false;
			}
			catch( NumberFormatException e )
			{
				System.out.println( "�п�J�Ʀr" );
			}
		}
		
		error = true;
		while( error )
		{
			System.out.print( "�п�J�z������(����)�G" );
			try
			{
				height = Integer.parseInt( buf.readLine() );
				error = false;
			}
			catch( NumberFormatException e )
			{
				System.out.println( "�п�J�Ʀr" );
			}
		}
	
		error = true;
		while( error )
		{
			System.out.print( "�п�J�z���魫(����)�G" );
			try
			{
				weight = Integer.parseInt( buf.readLine() );
				error = false;
			}
			catch( NumberFormatException e )
			{
				System.out.println( "�п�J�Ʀr" );
			}
		}
		
		bmi = (float) (weight / ( height / 100.0 ) / ( height / 100.0 ));
		System.out.print( name );
		if( id.charAt(1) == '1' ) System.out.print( " ����" );
		else if( id.charAt(1) == '2' ) System.out.print( " �p�j" );
		System.out.print( "�A�z�~�֬O" + ( 2016 - year ) + "���z��BMI�ȬO" );
		System.out.printf( "%.1f�z�����骬�p���G", bmi );
		if( bmi >= 35 ) System.out.print( "���תέD" );
		else if( bmi >= 30 ) System.out.print( "���תέD" );
		else if( bmi >= 27 ) System.out.print( "���תέD" );
		else if( bmi >= 24 ) System.out.print( "�L��" );
		else if( bmi >= 18.5 ) System.out.print( "���`�d��" );
		else System.out.print( "�L��" );
		System.out.println( "�C" );
		
	}

}







