package game.admin;
import game.GameAccount;
import java.util.Scanner;
public class AdminAccount extends GameAccount
{
	private String adminName, adminEmail;
	private Scanner scan = new Scanner( System.in );
	private int adminID;
	public String getAdminName(){ return adminName; }
	public String getAdminEmail(){ return adminEmail; }
	public int getAdminID(){ return adminID; }

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

	public void setAdminEmail()
	{
		System.out.print( "請輸入 Email : " );
		adminEmail = scan.next();
		if( !emailFormat( adminEmail ) ) adminEmail = null;
	}

	public void setAdminName()
	{
		System.out.print( "請輸入姓名：" );
		adminName = scan.next();
	}

	public void setAdminID()
	{
		System.out.print( "請輸入管理員編號：" );
		adminID = scan.nextInt();
	}

	public void showProfile()
	{
		super.showProfile();
		System.out.println( "姓名：" + adminName );
		System.out.println( "Email：" + adminEmail );
		System.out.println( "管理員編號：" + adminID );
	}

	public AdminAccount(String account,String password,String admin_name,String admin_email,int admin_ID)
	{
		super(account, password );
		adminName = admin_name;
		adminEmail = emailFormat( admin_email ) ? admin_email : null;
		adminID = admin_ID;
	}
}
