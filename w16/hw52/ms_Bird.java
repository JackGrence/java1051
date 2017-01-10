public class Bird extends Animal implements Flyer
{
	public Bird( String name, String color )
	{
		//super( name, color );
		super.setName(name);
		super.setColor(color);
	}
	public void fly()
	{
		System.out.println( name + "在天上飛" );
	}
}
