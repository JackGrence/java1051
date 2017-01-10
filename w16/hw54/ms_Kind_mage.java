public class Kind_mage extends Person implements Magic
{
	private int mp;
	public Kind_mage( String name, int hp, int mp )
	{
		super( name, hp );
		this.mp = mp;
	}
	public int getMp() { return mp; }
	public void setMp( int mp ) { this.mp = mp; }
	public void show()
	{
		System.out.println("我是" + getName() + "是好法師,血量=" + getHp());
	}
	public void magicAttack()
	{
		String magicName[] = { "c8763", "肉包子打狗", "火球" };
		mp = (int) (Math.random() * 101);
		System.out.println( "攻擊魔法：" + magicName[getMagicRange()] );
	}
	public void magicDefense()
	{
		String magicName[] = { "冰盾", "反盾", "尿遁" };
		mp = (int) (Math.random() * 101);
		System.out.println( "防禦魔法：" + magicName[getMagicRange()] );
	}
	private int getMagicRange()
	{
		if( mp >= 51 ) return 2;
		else if( mp >= 11 ) return 1;
		else return 0;
	}
}
