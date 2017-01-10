public class Cellphone extends Phone implements internet
{
	private double inNet, outNet, online;
	private final double monthMoney = 250; 
	private final int inNetPrice = 2;
	private final int outNetPrice = 10;
	public Cellphone( double time, double outNet, double online )
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
	public double internetPrice()
	{
		double result;
		result = online * hourprice;
		result = result > 1300 ? 1300 : result;
		return result;
	}
}
