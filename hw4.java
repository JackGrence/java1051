import java.io.*;
public class hw4
{
	public static void main( String args[] ) throws IOException
	{
		BufferedReader buf = new BufferedReader( new InputStreamReader( System.in ) );
		String sdt_num, name, born;
		System.out.print( "�п�J�A���Ǹ��G" );
		sdt_num = buf.readLine();
		
		System.out.print( "�п�J�A���m�W�G" );
		name = buf.readLine();
		
		System.out.print( "�п�J�A���X�ͦ~���G" );
		born = buf.readLine();
		
		System.out.println( "�A���Ǹ����G" + sdt_num );
		System.out.println( "�A���ǩm�W���G" + name );
		System.out.println( "�A�O" + born + "�~�X�ͪ�" );
		
	}
}