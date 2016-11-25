import java.io.*;
import java.util.*;
import java.text.*;
class Account
{
	private BufferedReader buf = new BufferedReader( new InputStreamReader( System.in ) );
	private String email, password, id, registTime;
	private void varifyCode() throws IOException
	{
		String vfCode, usrInput;
		int i;
		do
		{
			vfCode = "";
			for( i = 0; i < 5; i++ )
			{
				vfCode += (int) (Math.random() * 10);
			}
			System.out.println( "驗證碼：" + vfCode );
			System.out.print( "輸入以上產生的驗證碼：" );
			usrInput = buf.readLine();
			if( !vfCode.equals( usrInput ) ) System.out.println( "證碼輸入錯誤！" );
		} while( !vfCode.equals( usrInput ) );
		System.out.println( "註冊成功。" );
	}
	public void setAccount() throws IOException
	{
		setId();
		setPassword();
		setEmail();
		varifyCode();
		System.out.println( "您註冊的帳號為 " + id + "，密碼資訊已寄到 " + email + " 信箱" );
	}
	private void setId() throws IOException
	{
		System.out.print( "註冊帳號: " );
		id = buf.readLine();
	}
	private void setEmail() throws IOException
	{
		boolean judge = true;
		while( judge )
		{
			System.out.print( "註冊信箱: " );
			email = buf.readLine();
			if( email.indexOf("@") <= 0 || email.charAt( email.length() - 1 ) == '@' )
			{
				System.out.println( "信箱格式不符，重新輸入！" );
				continue;
			}
			judge = false;
		}
	}
	private void setPassword() throws IOException
	{
		boolean judge = true;
		System.out.print( "註冊密碼: " );
		password = buf.readLine();

	}
	public String getEmail()
	{
		return email;
	}
	public String getId()
	{
		return id;
	}
	public String getPassword()
	{
		return password;
	}
}
public class hw35
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader buf = new BufferedReader( new InputStreamReader( System.in ) );
		Account tom = new Account();
		tom.setAccount();
	}
}
