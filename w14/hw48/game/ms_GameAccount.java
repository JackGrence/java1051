package game;
import java.io.*;
import java.util.*;
public class GameAccount
{
	private static int KeyID = 0;
	private int UID;
	private final String account;
	private String password;
	private final String date;
	public GameAccount(String account,String password)
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
