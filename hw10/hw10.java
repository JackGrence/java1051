import java.io.*;
public class hw10
{
	public static void main( String args[] ) throws IOException
	{
		BufferedReader buf = new BufferedReader( new InputStreamReader( System.in ) );
		int attack, damage;
		double buff, real_attack;
		System.out.print( "輸入攻擊數值：" );
		attack = Integer.parseInt( buf.readLine() );
		if( attack <= 0 )
		{
			System.out.println("不可小於等於0");
			System.exit(1);
		}
		System.out.print( "輸入增益值：" );
		buff = Double.parseDouble( buf.readLine() );
		if( buff <= 0 )
		{
			System.out.println("不可小於等於0");
			System.exit(1);
		}
		real_attack = attack * buff;
		damage = (int) real_attack;
		//System.out.println( damage );
		System.out.print( "增益造成傷害值：" );
		if( damage == 2147483647 && attack != 1 && buff != 1  )
		{
			System.out.println( "2147483647" );
			System.out.print( "增益運算結果：「overflow」" );
		}
		else if( damage == 0 )
		{
			System.out.println( damage );
			System.out.print( "增益運算結果：「underflow」" );
		}
		else
		{
			System.out.println( damage );
			System.out.println( "增益運算結果：「正常」" );
		}
		
	}

}