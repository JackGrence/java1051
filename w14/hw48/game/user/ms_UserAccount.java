package game.user;
import game.GameAccount;
import java.util.Scanner;
public class UserAccount extends GameAccount
{
	private String userName, userEmail;
	private Scanner scan = new Scanner( System.in );

	public UserAccount(String account,String password,String name,String email)
	{
		super( account, password );
		userName = name;
		userEmail = emailFormat( email ) ? email : null;
	}

	public String getUserName(){ return userName; }
	public String getUserEmail(){ return userEmail; }

	public void setUserName()
	{
		System.out.print( "請輸入姓名：" );
		userName = scan.next();
	}

	private boolean emailFormat( String email )
	{
		boolean result = false;
		String correct[] = { "@kuas.edu.tw", "@gmail.com" };
		String domain;
		domain = email.indexOf( "@" ) < 0 ? "" : email.substring( email.indexOf( "@" ) );
		for( String cur: correct )
		{
			if( domain.equals( cur ) ) result = true;
		}
		return result;
	}

	public void setUserEmail()
	{
		System.out.print( "請輸入 Email : " );
		userEmail = scan.next();
		if( !emailFormat( userEmail ) ) userEmail = null;
	}

	public void showProfile()
	{
		super.showProfile();
		System.out.println( "姓名：" + userName );
		System.out.println( "Email：" + userEmail );
	}
}
