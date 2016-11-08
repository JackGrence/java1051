import java.io.*;
public class hw4
{
	public static void main( String args[] ) throws IOException
	{
		BufferedReader buf = new BufferedReader( new InputStreamReader( System.in ) );
		String sdt_num, name, born;
		System.out.print( "請輸入你的學號：" );
		sdt_num = buf.readLine();
		
		System.out.print( "請輸入你的姓名：" );
		name = buf.readLine();
		
		System.out.print( "請輸入你的出生年份：" );
		born = buf.readLine();
		
		System.out.println( "你的學號為：" + sdt_num );
		System.out.println( "你的學姓名為：" + name );
		System.out.println( "你是" + born + "年出生的" );
		
	}
}