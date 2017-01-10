public class hw53
{
	public static void main( String args[] )
	{
		String name[] = {"jack", "tom", "bob", "null"};
		String sex[] = { "Man", "female", "中性", "鹼性" };
		String phone[] = { "0", "1234", "4949", "8888" };
		Employee emp[] = new Employee[4];
		int i;
		Manager mgr;
		Basic_Employee baseEmp;
		for( i = 0; i < 2; i++ )
		{
			emp[i] = new Basic_Employee( name[i], sex[i], phone[i] );
			emp[i+2] = new Manager( name[i+2], sex[i+2], phone[i+2] );
			baseEmp = (Basic_Employee) emp[i];
			mgr = (Manager) emp[i+2];
			System.out.println( "年所得：" + (baseEmp.salary() * 12 + baseEmp.End_bonuses() + baseEmp.Start_bonus) );
			baseEmp.show();
			System.out.println( "年所得：" + (mgr.salary() * 12 + mgr.End_bonuses() + mgr.Start_bonus) );
			mgr.show();
		}
	}
}
