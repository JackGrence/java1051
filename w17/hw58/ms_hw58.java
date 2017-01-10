public class hw58
{
	public static void main( String args[] )
	{
		int a, b;
		try
		{
			a = Integer.parseInt( args[0] );
			b = Integer.parseInt( args[1] );
			a = a / b;
			System.out.println( "答案：" + a );
		}
		catch( ArrayIndexOutOfBoundsException e )
		{
			System.out.println( "您輸入的參數不足二個" );
		}
		catch( ArithmeticException e )
		{
			System.out.println( "分母不可為零" );
		}
		catch( NumberFormatException e )
		{
			System.out.println( "你輸入的不是 int 格式" );
		}
		catch( Exception e )
		{
			System.out.println( "掛掉了" );
		}
	}
}
