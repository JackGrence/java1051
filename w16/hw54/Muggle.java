public class Muggle extends Person
{
	private String work;
	public Muggle( String name, int hp, String work )
	{
		super(name, hp);
		this.work = work;
	}
	public String getWork() { return work; }
	public void setWork( String work )
	{
		this.work = work;
	}
	public void show()
	{
		System.out.println( "我是" + getName() + "是平民,血量= " + getHp() + ",從事的工作為" + work );
	}
}
