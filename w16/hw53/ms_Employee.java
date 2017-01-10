public abstract class Employee
{
	private String name, sex, phone;
	public abstract int salary();
	public Employee( String name, String sex, String phone )
	{
		this.name = name;
		this.sex = sex;
		this.phone = phone;
	}
	public void show()
	{
		System.out.println( name );
		System.out.println( sex );
		System.out.println( phone );
	}
}
