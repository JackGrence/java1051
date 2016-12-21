class Teacher extends Person
{
	private String IDcard;
	private String phone;
	public void set_IDcard( String IDcard )
	{
		this.IDcard = IDcard;
	}
	public String get_IDcard()
	{
		return this.IDcard;
	}
	public void set_phone( String phone )
	{
		this.phone = phone;
	}
	public String get_phone()
	{
		return this.phone;
	}
	public Teacher( String IDcard, String phone )
	{
		this.IDcard = IDcard;
		this.phone = phone;
	}
	public Teacher()
	{
		this( "IDcard", "000" );
	}
	@Override
	public void calcBMI()
	{
		double h = super.getHeight(), w = super.getWeight();
		double bmi = w / (h*h) * 10000;
		System.out.print( super.getName() + "老師，您的 BMI 值為：" + bmi );
		System.out.print( "屬於：" );
		if( bmi >= 32 ) System.out.println( "過度肥胖" );
		else if( bmi >= 28 ) System.out.println( "中度肥胖" );
		else if( bmi >= 24 ) System.out.println( "輕度肥胖" );
		else if( bmi >= 18.5) System.out.println( "正常體重" );
		else System.out.println( "體重過輕" );
	}
	@Override
	public void showProfile()
	{
		super.showProfile();
		System.out.println( "人事編號：" + IDcard );
		System.out.println( "分機號碼：" + phone );
	}
}
public class hw42
{
	public static void main( String[] args )
	{
		Teacher jack = new Teacher();
		jack.showProfile();
		jack.calcBMI();
	}
}
