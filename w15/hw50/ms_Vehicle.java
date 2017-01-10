public abstract class Vehicle
{
	private String name;
	private double speed;
	public Vehicle( String name, double speed )
	{
		this.name = name;
		this.speed = speed;
	}
	public void show()
	{
		System.out.println( "名稱：" + name );
		System.out.println( "速度：" + speed );
	}
	public void setName( String name )
	{
		this.name = name;
	}
	public void setSpeed( double speed )
	{
		this.speed = speed;
	}
	public String getName() { return name; }
	public double getSpeed() { return speed; }
	public abstract void move();
}
