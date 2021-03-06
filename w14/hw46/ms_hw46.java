import java.io.*;
import java.util.*;
class GameAccount
{
	private static int KeyID = 0;
	private int UID;
	private final String account;
	private String password;
	private final String date;
	GameAccount(String account,String password)
	{
		Date d = new Date();
		date = ( d.getYear() + 1900 ) + "-" + (d.getMonth() + 1) + "-" + d.getDate() + " " + d.getHours() + ":" + d.getMinutes() + ":" + d.getSeconds();
		System.out.println( date );
		this.account = account;
		this.password = password;
		KeyID++;
		this.UID = KeyID;
	}
	public void showProfile()
	{
		System.out.println( "UID: " + UID );
		System.out.println( "帳號: " + account );
		System.out.println( "密碼: " + password );
		System.out.println( "帳號建立時間: " + date );
	}
	public String getAccount(){ return account; }
	public String getPassword(){ return password; }
	public String getDate(){ return date; }
	public int getUID(){ return UID; }
	public void setPassword() throws IOException
	{
		String password = "";
		while( !checkPasswd( password ) )
		{
			System.out.print( "請輸入密碼: " );
			password = buf.readLine();
		}
		this.password = password;
	}
	public static int getTotal(){ return KeyID; }
	public static boolean checkAccount( String account )
	{
		if( account.length() > 5 && account.length() < 10 ) return true;
		else return false;
	}
	public static boolean checkPasswd( String password )
	{
		if( password.length() < 8 ) return false;
		else return true;
	}
	private static BufferedReader buf = new BufferedReader( new InputStreamReader( System.in ) );
}
class AccountTest
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
}
public class hw46
{
	public static void main( String[] args ) throws IOException
	{
		BufferedReader buf = new BufferedReader( new InputStreamReader( System.in ) );
		GameAccount act[] = new GameAccount[2];
		int i;
		String account, password;
		for( GameAccount cur: act )
		{
			cur = AccountTest.getGameAccount();
		}
	}
}
