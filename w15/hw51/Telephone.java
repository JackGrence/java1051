public class Telephone extends Phone
{
	private double callCellphone, callTelephone;
	private final int callTelephonePrice = 1;
	private final int callCellphonePrice = 5;
	public Telephone( double time, double callCellphone )
	{
		super( time + callCellphone );
		callTelephone = time;
		this.callCellphone = callCellphone;
	}
	public double calcPrice()
	{
		return callTelephonePrice * callTelephone + callCellphonePrice * callCellphone;
	}
	public void showMessage()
	{
		System.out.println( "收費總額：" + calcPrice() );
	}
}
