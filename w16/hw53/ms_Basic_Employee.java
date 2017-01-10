public class Basic_Employee extends Employee implements Reward
{
	private int basic_salary = 22000;
	public Basic_Employee( String name, String sex, String phone )
	{
		super( name, sex, phone );
	}
	public int salary()
	{
		return basic_salary + 1000;
	}
	public int End_bonuses()
	{
		return salary() * 5;
	}
	public void show()
	{
		super.show();
		System.out.println( "開工獎金：" + Start_bonus );
		System.out.println( "月薪：" + salary() );
		System.out.println( "年終獎金：" + End_bonuses() );
		System.out.println( "-----------" );
	}
}

