public class Wicked_mage extends Person implements Magic
{
	private int mp;
	public Wicked_mage( String name, int hp, int mp )
	{
		super( name, hp );
		this.mp = mp;
	}
	public int getMp() { return mp; }
	public void setMp( int mp ) { this.mp = mp; }
	public void show()
	{
		System.out.println("我是" + getName() + "是壞法師,血量=" + getHp());
	}
	public void magicAttack()
	{
		String magicName[] = { "萬箭齊發", "斧頭", "袖劍" };
		mp = (int) (Math.random() * 101);
		System.out.println( "攻擊魔法：" + magicName[getMagicRange()] );
	}
	public void magicDefense()
	{
		String magicName[] = { "暗殺", "磚頭", "拉肚子" };
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
