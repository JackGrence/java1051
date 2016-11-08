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
		
		System.out.print( "請輸入您的姓名：" );
		name = buf.readLine();
		
		do
		{
			System.out.print( "請輸入您的身份證字號：" );
			id = buf.readLine();
		}while( id.length() != 10 );
		
		error = true;
		while( error )
		{
			System.out.print( "請輸入您的出生西元年：" );
			try
			{
				year = Integer.parseInt( buf.readLine() );
				error = false;
			}
			catch( NumberFormatException e )
			{
				System.out.println( "請輸入數字" );
			}
		}
		
		error = true;
		while( error )
		{
			System.out.print( "請輸入您的身高(公分)：" );
			try
			{
				height = Integer.parseInt( buf.readLine() );
				error = false;
			}
			catch( NumberFormatException e )
			{
				System.out.println( "請輸入數字" );
			}
		}
	
		error = true;
		while( error )
		{
			System.out.print( "請輸入您的體重(公斤)：" );
			try
			{
				weight = Integer.parseInt( buf.readLine() );
				error = false;
			}
			catch( NumberFormatException e )
			{
				System.out.println( "請輸入數字" );
			}
		}
		
		bmi = (float) (weight / ( height / 100.0 ) / ( height / 100.0 ));
		System.out.print( name );
		if( id.charAt(1) == '1' ) System.out.print( " 先生" );
		else if( id.charAt(1) == '2' ) System.out.print( " 小姐" );
		System.out.print( "，您年齡是" + ( 2016 - year ) + "歲您的BMI值是" );
		System.out.printf( "%.1f您的身體狀況為：", bmi );
		if( bmi >= 35 ) System.out.print( "重度肥胖" );
		else if( bmi >= 30 ) System.out.print( "中度肥胖" );
		else if( bmi >= 27 ) System.out.print( "輕度肥胖" );
		else if( bmi >= 24 ) System.out.print( "過重" );
		else if( bmi >= 18.5 ) System.out.print( "正常範圍" );
		else System.out.print( "過輕" );
		System.out.println( "。" );
		
	}

}







