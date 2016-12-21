import java.io.*;
class Employee
{
	private BufferedReader buf = new BufferedReader( new InputStreamReader( System.in ) );
	private String name, telephone;
	private int year;
	public Employee() throws IOException
	{
		setName();
		setTelephone();
		setYear();
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
class Engineer extends Employee
{
	private String name;
	private String telephone;
	private int year;
	private int salary;
	private String skill;
	private BufferedReader buf = new BufferedReader( new InputStreamReader( System.in ) );
	Engineer() throws IOException
	{
		setSalary();
		setSkill();
	}
	Engineer(String name, String telephone, int year, int salary, String skill) throws IOException
	{
		this.name = name;
		this.telephone = telephone;
		this.year = year;
		this.salary = salary;
		this.skill = skill;
	}
	public void setSalary() throws IOException
	{
		System.out.print( "請輸入工程師薪水：" );
		this.salary = Integer.parseInt( buf.readLine() );
	}
	public int getSalary()
	{
		return this.salary;
	}
	public void setSkill() throws IOException
	{
		System.out.print( "請輸入工程師專長:" );
		this.skill = buf.readLine();
	}
	public String getSkill()
	{
		return skill;
	}
	public int getYearSalary()
	{
		int y = super.getYear();
		if( y <= 30 && y > 25 ) return (int) (salary * 12 * 1.4);
		else if( y > 15 ) return (int) (salary * 12 * 1.3);
		else if( y > 5 ) return (int) (salary * 12 * 1.2);
		else return (int) (salary * 12 * 1.1);
	}
	@Override
	public void showProfile()
	{
		super.showProfile();
		System.out.println( "薪水：" + salary );
		System.out.println( "專長：" + skill );
		System.out.println( "年薪：" + getYearSalary() );
	}
}
public class hw44
{
	public static void main( String[] args ) throws IOException
	{
		Engineer jack = new Engineer();
		jack.showProfile();
	}
}
