import java.io.*;
class Employee
{
	private BufferedReader buf = new BufferedReader( new InputStreamReader( System.in ) );
	private String name, telephone;
	private int year;
	public Employee()
	{
		this( "劉宇祥", "0979127222", 2147483647 );
	}
	public Employee( String name, String telephone, int year )
	{
		this.name = name;
		this.telephone = telephone;
		this.year = year;
	}
	public void showProfile()
	{
		System.out.println( "姓名：" + name );
		System.out.println( "手機：" + telephone );
		System.out.println( "年資：" + year );
	}
	public void setName() throws IOException
	{
		System.out.print( "請輸入員工姓名：" );
		this.name = buf.readLine();
	}
	public String getName()
	{
		return name;
	}
	public void setTelephone() throws IOException
	{
		System.out.print( "請輸入員工電話：" );
		telephone = buf.readLine();
		if( !telephone.substring(0,2).equals("09") || telephone.length() != 10 ) telephone = "0912345678";
	}
	public String getTelephone() { return telephone; }
	public void setYear() throws IOException
	{
		System.out.print( "請輸入員工年資：" );
		this.year = Integer.parseInt( buf.readLine() );
		if( year < 1 || year > 30 ) year = 1;
	}
	public int getYear() { return year; }
}
public class hw43
{
	public static void main( String[] args ) throws IOException
	{
		Employee jack, tom;
		jack = new Employee( "JG", "0911111111", 1234 );
		tom = new Employee();
		tom.setName();
		tom.setTelephone();
		tom.setYear();
		jack.showProfile();
		tom.showProfile();
	}
}
