import java.io.*;
public class hw10
{
	public static void main( String args[] ) throws IOException
	{
		BufferedReader buf = new BufferedReader( new InputStreamReader( System.in ) );
		int attack, damage;
		double buff, real_attack;
		System.out.print( "��J�����ƭȡG" );
		attack = Integer.parseInt( buf.readLine() );
		if( attack <= 0 )
		{
			System.out.println("���i�p�󵥩�0");
			System.exit(1);
		}
		System.out.print( "��J�W�q�ȡG" );
		buff = Double.parseDouble( buf.readLine() );
		if( buff <= 0 )
		{
			System.out.println("���i�p�󵥩�0");
			System.exit(1);
		}
		real_attack = attack * buff;
		damage = (int) real_attack;
		//System.out.println( damage );
		System.out.print( "�W�q�y���ˮ`�ȡG" );
		if( damage == 2147483647 && attack != 1 && buff != 1  )
		{
			System.out.println( "2147483647" );
			System.out.print( "�W�q�B�⵲�G�G�uoverflow�v" );
		}
		else if( damage == 0 )
		{
			System.out.println( damage );
			System.out.print( "�W�q�B�⵲�G�G�uunderflow�v" );
		}
		else
		{
			System.out.println( damage );
			System.out.println( "�W�q�B�⵲�G�G�u���`�v" );
		}
		
	}

}