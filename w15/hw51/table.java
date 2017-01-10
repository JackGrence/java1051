public class table extends Phone implements internet
{
	private double inNet, outNet, online;
	private final double monthMoney = 200; 
	private final int inNetPrice = 3;
	private final int outNetPrice = 13;
	public table( double time, double outNet, double online )
	{
		super( time + outNet );
		inNet = time;
		this.outNet = outNet;
		this.online = online;
	}
	public double calcPrice()
	{
		double result;
		result = inNet * inNetPrice + outNet * outNetPrice;
		result = result < monthMoney ? 250 : result;
		return internetPrice() + result;
	}
	public void showMessage()
	{
		System.out.println( "收費總額：" + calcPrice() );
	}
	public int hourprice = 10;
	public double internetPrice()
	{
		double result;
		result = online * hourprice;
		result = result > 1000 ? 1000 : result;
		return result;
	}
}
