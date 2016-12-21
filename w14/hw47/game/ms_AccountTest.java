import game.*;
import java.io.*;
import java.util.*;
public class AccountTest
{
	private static BufferedReader buf = new BufferedReader( new InputStreamReader( System.in ) );
	public static GameAccount getGameAccount() throws IOException
	{
		String account = "", password = "";
		GameAccount cur;
		while( !GameAccount.checkAccount( account ) )
		{
			System.out.print( "設定帳號: " );
			account = buf.readLine();
		}
		while( !GameAccount.checkPasswd( password ) )
		{
			System.out.print( "設定密碼: " );
			password = buf.readLine();
		}
		cur = new GameAccount( account, password );
		cur.showProfile();
		System.out.println( "帳號總數:" + GameAccount.getTotal() );
		return cur;
	}
	public static void main( String[] args ) throws IOException
	{
		BufferedReader buf = new BufferedReader( new InputStreamReader( System.in ) );
		GameAccount act[] = new GameAccount[2];
		int i;
		String account, password;
		for( GameAccount cur: act )
		{
			cur = getGameAccount();
		}
	}
}
