import java.io.*;
public class hw14
{
     public static void main(String[] args) throws IOException
    {
	int min;
	int max;
	int base;
	int number= 1;
	int i = 1;
	int j=1;
	String A = "";


	BufferedReader buf;
	
	buf=new BufferedReader(new InputStreamReader(System.in));

	System.out.println("輸入最小值");
	A=buf.readLine(); 
	min=Integer.parseInt(A);
	
	System.out.println("輸入最大值");
	A=buf.readLine();
	max=Integer.parseInt(A);

	System.out.println("輸入倍數基值");
	A=buf.readLine();
	base=Integer.parseInt(A);
	System.out.println(base+"的倍數:");
	
	while(i==1)
		{
		number++;
		System.out.println( "number" + number + "max" + max );
		if(number%base==0)
		{j=number;}
		else if(number%base!=0)
		{continue;}
		else if(number>=max)
		{break;}
		
		System.out.println(j);
		}

    }
}