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
		userEmail = email;
	}
	public String getUserName(){ return userName; }
	public String getUserEmail(){ return userEmail; }
	public void setUserName()
	{
		System.out.print( "請輸入姓名：" );
		userName = scan.nextLine();
	}
}
