public class Person
{
	private String name;
	private int hp;
	public Person( String name, int hp )
	{
		this.name = name;
		this.hp = hp;
	}
	public String getName() { return name; };
	public int getHp() { return hp; };
	public void setName( String name )
	{
		this.name = name;
	}
	public void setHp( int hp )
	{
		this.hp = hp;
	}
	public void show()
	{
		System.out.println( "名稱：" + name );
		System.out.println( "血量：" + hp );
	}
}
