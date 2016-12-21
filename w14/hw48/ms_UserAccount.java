package game.user;
import game.*;
public class UserAccount extends GameAccount
{
	private String userName, userEmail;
	public UserAccount(String account,String password,String name,String email)
	{
		super( account, password );
	}
}
