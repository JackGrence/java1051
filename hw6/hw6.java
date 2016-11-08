import java.io.*;
public class hw6
{
	public static void main( String args[] ) throws IOException
	{
		BufferedReader buf = new BufferedReader( new InputStreamReader( System.in ) );
		String sdt_num, name, born;
		int height, weight;
		double bmi, h, w;
	
		System.out.print( "請輸入你的身分證字號：" );
		sdt_num = buf.readLine();
		
		System.out.print( "請輸入你的姓名：" );
		name = buf.readLine();
		
		System.out.print( "請輸入你的年齡：" );
		born = buf.readLine();
		
		System.out.print( "請輸入你的身高(cm)：" );
		height = Integer.parseInt( buf.readLine() ); 
		
		System.out.print( "請輸入你的體重：" );
		weight = Integer.parseInt( buf.readLine() );
		
		h = ( double ) height;
		w = ( double ) weight;
		
		bmi = weight /  ( ( (double)height / 100 ) * ( (double)height / 100 ) );
		System.out.println( bmi );
		
		
		
		System.out.print( name + "你的體重屬於" );
		
		if( bmi > 18.5 && bmi < 22.9 )
		{
			System.out.println( "正常" );
		}
		else
		{
			System.out.println( "不正常" );
		}
		
	}
}