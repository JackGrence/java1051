public abstract class Phone
{
	private double time;
	public Phone( double time )
	{
		this.time = time;
	}
	public void setTime( double time )
	{
		this.time = time;
	}
	public double getTime() { return time; }
	public abstract double calcPrice();
	public abstract void showMessage();
}
