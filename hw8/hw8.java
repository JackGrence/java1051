import java.io.*;
public class hw8
{
	public static void main( String args[] ) throws IOException
	{
		BufferedReader buf = new BufferedReader( new InputStreamReader( System.in ) );
		int carnation, price, cash, total;
		System.out.print( "康乃馨的單價為：" );
		price = Integer.parseInt( buf.readLine() );
		System.out.print( "請輸入客人買的康乃馨數量：" );
		carnation = Integer.parseInt( buf.readLine() );
		System.out.print( "請輸入客人付款金額：" );
		cash = Integer.parseInt( buf.readLine() );
		
		total = price * carnation;
		if( total > cash )
		{
			System.out.println( "你付款的金額不足" );
		}
		else
		{
			System.out.println( "實付：" + cash + "應付：" + total + "，找零：" + (cash - total) );
			
		}
		
	}

}