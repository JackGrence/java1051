import java.io.*;
class GameAccount
{
	private static int KeyID = 0;
	private int UID;
	private String account, password;
	GameAccount(String account,String password)
	{
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
	}
	public String getAccount(){ return account; }
	public String getPassword(){ return password; }
	public int getUID(){ return UID; }
	public void setPassword( String password )
	{
		this.password = password;
	}
	public static int getTotal(){ return KeyID; }
}
public class hw45
{
	public static void main( String[] args ) throws IOException
	{
		BufferedReader buf = new BufferedReader( new InputStreamReader( System.in ) );
		GameAccount act[] = new GameAccount[2];
		int i;
		String account, password;
		for( GameAccount cur: act )
		{
			System.out.print( "設定帳號: " );
			account = buf.readLine();
			System.out.print( "設定密碼: " );
			password = buf.readLine();
			cur = new GameAccount( account, password );
			cur.showProfile();
			System.out.println( "帳號總數:" + GameAccount.getTotal() );
		}
	}
}
