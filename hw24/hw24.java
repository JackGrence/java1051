import java.io.*;
public class hw24
{
	private static double doubleJudge( String msg ) throws IOException
	{
		BufferedReader buf = new BufferedReader( new InputStreamReader( System.in ) );
		int error;
		double result = 0;
		error = 1;
		while( error == 1 )
		{
			System.out.print( msg );
			try
			{
				result = Double.parseDouble( buf.readLine() );
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
		String mode;
		
		
		while( true )
		{
			System.out.print( "��J�B�⭱�n�������N�� (0:��� 1:�T���� 2:���諬 3:���)�G" );
			mode = buf.readLine();
			switch(mode)
			{
				case "0":
					System.out.println( "���n��" + circle() );
					break;
				case "1":
					System.out.println( "���n��" + triangle() );
					break;
				case "2":
					System.out.println( "���n��" + square() );
					break;
				case "3":
					System.out.println( "���n��" + trapezium() );
					break;
				default:
					System.out.println( "��J���~�I�Э��s��J" );
			}
		}
	}
	
	public static double trapezium() throws IOException
	{
		double up, down, high;
		do up = doubleJudge( "��J�W���G" ); while( up < 0 );
		do down = doubleJudge( "��J�U���G" ); while( down < 0 );
		do high = doubleJudge( "��J���G" ); while( high < 0 );
		return (up + down) * high / 2;
	}
	
	public static double square() throws IOException
	{
		double r;
		do r = doubleJudge( "�п�J����G" ); while( r < 0 );
		return r * r;
	}
	
	private static boolean triangleJudge( double r[] )
	{
		boolean result = false;
		result = r[2] >= r[0] + r[1] ? false : r[1] >= r[0] + r[2] ? false : r[0] >= r[1] + r[2] ? false : true;
		return result;
	}
	
	public static double triangle() throws IOException
	{
		int i;
		double r[] = new double[3];
		for( i = 0; i < 2; i++ )
		{
			do r[i] = doubleJudge( "�п�J��" + (i + 1) + "������G" ); while( r[i] <= 0 );
		}
		do 
		{
			r[2] = doubleJudge( "�п�J��" + (i + 1) + "������G" );
			if( triangleJudge(r) == false ) 
			{
				System.out.println( "�o���O�T����" );
				r[2] = -1;
			}
		} while( r[2] <= 0 );
		
		double s;
		s = ( r[0] + r[1] + r[2] ) / 2;
		return Math.sqrt( s*(s-r[0])*(s-r[1])*(s-r[2]) );
	}
	
	public static double circle() throws IOException
	{
		double r;
		do r = doubleJudge( "�п�J�b�|�G" ); while( r < 0 );
		return r * r * Math.PI;
	}
}







