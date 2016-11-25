import java.io.*;
import java.util.*;
import java.text.*;
class account
{
	private int intJudge( String msg ) throws IOException
	{
		BufferedReader buf = new BufferedReader( new InputStreamReader( System.in ) );
		int error, result = 0;
		error = 1;
		while( error == 1 )
		{
			System.out.print( msg );
			try
			{
				result = Integer.parseInt( buf.readLine() );
				error = 0;
			}
			catch( NumberFormatException e )
			{
				System.out.println( "輸入錯誤" );
			}
		}
		return result;
	}
	private BufferedReader buf = new BufferedReader( new InputStreamReader( System.in ) );
	private String password, account;
	private int money;
	public void setInfo() throws IOException
	{
		money = 0;
		setAccount();
		setPassword();
		System.out.println( "您註冊的帳號為 " + account + " 註冊成功" );
	}
	private void setAccount() throws IOException
	{
		System.out.print( "註冊帳號: " );
		account = buf.readLine();
	}
	private void setPassword() throws IOException
	{
		System.out.print( "註冊密碼: " );
		password = buf.readLine();

	}
	public void storeMoney() throws IOException
	{
		int cash;
		do
		{
			cash = intJudge( "存入金額: " );
			if( cash <= 0 ) System.out.println( "請輸入 0 以上" );
		} while( cash <= 0 );
		money += cash;
		System.out.println( "帳戶餘額:" + money );
	}
	public void takeMoney() throws IOException
	{
		int cash;
		do
		{
			cash = intJudge( "提款金額: " );
			if( cash <= 0 ) System.out.println( "請輸入 0 以上" );
		} while( cash <= 0 );

		if( money >= cash )
		{
			money -= cash;
			System.out.println( "帳戶餘額:" + money );
		}
		else System.out.println( "帳戶餘額不足" );
	}
	public int getMoney()
	{
		return money;
	}
	public String getAccount()
	{
		return account;
	}
	public String getPassword()
	{
		return password;
	}
}
public class hw36
{
	private static BufferedReader buf = new BufferedReader( new InputStreamReader( System.in ) );
	private static ArrayList<account> accountList = new ArrayList<account>();
	public static void main(String args[]) throws IOException
	{
		account newAct;
		boolean app = true, log = true;
		String mode;
		while( app )
		{
			System.out.print( "(1)登入 (2)申請帳號 (3)離開程式: " );
			mode = buf.readLine();
			switch( mode )
			{
				case "1":
					login();
					break;
				case "2":
					newAct = new account();
					newAct.setInfo();
					accountList.add( newAct );
					break;
				case "3":
					app = false;
					break;
			}
		}
	}
	public static void login() throws IOException
	{
		String input_act, input_pwd, mode;
		boolean judge;
		account usr = new account();
		System.out.print( "請輸入帳號: " );
		input_act = buf.readLine();
		System.out.print( "請輸入密碼: " );
		input_pwd = buf.readLine();

		judge = false;
		for( account cur: accountList )
		{
			if( input_act.equals( cur.getAccount() ) && input_pwd.equals( cur.getPassword() ) )
			{
				usr = cur;
				judge = true;
				break;
			}
		}

		if( !judge ) System.out.println( "登入失敗" );
		
		while( judge )
		{
			System.out.print( "(1)提款 (2)存款 (3)查詢餘額 (4)登出: " );
			mode = buf.readLine();
			switch( mode )
			{
				case "1":
					usr.takeMoney();
					break;
				case "2":
					usr.storeMoney();
					break;
				case "3":
					System.out.println( "帳戶餘額: " + usr.getMoney() );
					break;
				case "4":
					judge = false;
					break;
			}
		}
	}
}
