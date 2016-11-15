import java.io.*;
import java.util.*;
import java.text.*;
class account
{
	private BufferedReader buf = new BufferedReader( new InputStreamReader( System.in ) );
	private ArrayList<account> accountList;
	public String email, pwd, usr, registTime;
	public void setAccount( ArrayList<account> oldData ) throws IOException
	{
		accountList = oldData;
		setUsr();
		setPwd();
		setEmail();
	}
	private void setUsr() throws IOException
	{
		String usrTmp = "";
		boolean judge = true;
		while( judge )
		{
			judge = false;
			System.out.print( "請輸入帳號: " );
			usrTmp = buf.readLine();
			for( account cur: accountList )
			{
				if( cur.usr.equals( usrTmp ) )
				{
					System.out.println( "重複的帳號" );
					judge = true;
					break;
				}
			}
		}
		usr = usrTmp;
	}
	private void setEmail() throws IOException
	{
		DateFormat df;
		boolean judge = true;
		while( judge )
		{
			System.out.print( "請輸入 Email:" );
			email = buf.readLine();
			if( email.indexOf("@") <= 0 || email.charAt( email.length() - 1 ) == '@' )
			{
				System.out.println( "Email 不合法" );
				continue;
			}
			judge = false;
		}
		Date now = new Date();
		if( email.substring(email.length() - 2).equals( "tw" ) )
		{
			df = new SimpleDateFormat( " 年 MM 月 dd 日 ZZ 時  分 ss 秒" );
			registTime = "中華民國 " + (now.getYear() - 11) + df;
		}
		else
		{
			df = new SimpleDateFormat( "MM/dd/yyyy HH:mm:ss" );
			registTime = df.format( now );
		}
	}
	private void setPwd() throws IOException
	{
		boolean judge = true;
		while( judge )
		{
			pwdSecurity();
			System.out.print( "請再次輸入密碼:" );
			if( !pwd.equals( buf.readLine() ) )
			{
				System.out.println( "密碼不一致" );
			}
			else
			{
				judge = false;
			}
		}

	}
	private void pwdSecurity() throws IOException
	{
		boolean judge = true, errorChk = true;
		String specialChar = "!@#$";
		int i;
		while( judge )
		{
			System.out.print( "請輸入密碼:" );
			pwd = buf.readLine();
			if( pwd.length() <= 8 )
			{
				System.out.println( "密碼請超過 8 個字元" );
				continue;
			}

			errorChk = true;
			for( i = (int) '0'; i <= (int) '9'; i++ )
			{
				if( pwd.indexOf(i) >= 0 ) errorChk = false;
			}
			if( errorChk )
			{
				System.out.println( "請至少輸入一個數字" );
				continue;
			}

			errorChk = true;
			for( i = 0; i < 4; i++ )
			{
				if( pwd.indexOf( specialChar.charAt(i) ) >= 0 ) errorChk = false;
			}
			if( errorChk )
			{
				System.out.println( "請至少輸入一個特殊字元" );
				continue;
			}
			judge = false;
		}
	}
}
public class hw32
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader buf = new BufferedReader( new InputStreamReader( System.in ) );
		ArrayList<account> accountList = new ArrayList<account>();
		account newItem = new account();

		newItem.setAccount( accountList );
		accountList.add( newItem );
		System.out.println( newItem.usr + " 你好，歡迎你來自 " + newItem.email.substring( newItem.email.indexOf("@") + 1 ) + "，您的註冊時間是 " + newItem.registTime );
		System.out.println( newItem.pwd );
		System.out.println( newItem.registTime );
	}
}
