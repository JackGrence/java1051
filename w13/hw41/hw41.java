class Student extends Person
{
	private String student_number;
	private String major;
	public void set_student_number( String student_number )
	{
		this.student_number = student_number;
	}
	public String get_student_number()
	{
		return this.student_number;
	}
	public void set_major( String major )
	{
		this.major = major;
	}
	public String get_major()
	{
		return this.major;
	}
}
public class hw41
{
	public static void main( String[] args )
	{
		Student jack = new Student();
		jack.set_student_number( "1104108333" );
		jack.set_major( "major" );
		jack.showProfile();
		jack.calcBMI();
	}
}
