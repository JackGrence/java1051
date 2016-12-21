import game.*;
import game.admin.*;
import game.user.UserAccount;
import java.io.*;
import java.util.*;
class GameAccountArgs
{
	public String account, password;
}
public class AccountTest
{
	private static BufferedReader buf = new BufferedReader( new InputStreamReader( System.in ) );
	private static void getGameAccountArgs( GameAccountArgs arg ) throws IOException
	{
		arg.account = "";
		arg.password = "";
		GameAccount cur;
		while( !GameAccount.checkAccount( arg.account ) )
		{
			System.out.print( "設定帳號: " );
			arg.account = buf.readLine();
		}
		while( !GameAccount.checkPasswd( arg.password ) )
		{
			System.out.print( "設定密碼: " );
			arg.password = buf.readLine();
		}	
	}
	public static GameAccount getGameAccount() throws IOException
	{
		GameAccount cur;
		GameAccountArgs arg = new GameAccountArgs();
		getGameAccountArgs( arg );
		cur = new GameAccount( arg.account, arg.password );
		cur.showProfile();
		System.out.println( "帳號總數:" + GameAccount.getTotal() );
		return cur;
	}
	
	private static Scanner scan = new Scanner( System.in );

	public static AdminAccount getAdminAccount() throws IOException
	{
		String name, email;
		int id;
		GameAccountArgs arg = new GameAccountArgs();
		getGameAccountArgs( arg );
		System.out.print( "姓名：" );
		name = scan.next();
		System.out.print( "email：" );
		email = scan.next();
		System.out.print( "ID：" );
		id = scan.nextInt();
		AdminAccount cur = new AdminAccount( arg.account, arg.password, name, email, id );
		return cur;
	}

	public static UserAccount getUserAccount() throws IOException
	{
		String name, email;
		GameAccountArgs arg = new GameAccountArgs();
		getGameAccountArgs( arg );
		System.out.print( "姓名：" );
		name = scan.next();
		System.out.print( "email：" );
		email = scan.next();
		UserAccount cur = new UserAccount( arg.account, arg.password, name, email );
		return cur;
	}

	public static void main( String[] args ) throws IOException
	{
		UserAccount tom, bob;
		AdminAccount jack;
		tom = getUserAccount();
		bob = getUserAccount();
		jack = getAdminAccount();
		tom.showProfile();
		bob.showProfile();
		jack.showProfile();
	}
}
