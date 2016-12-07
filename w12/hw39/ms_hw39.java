import java.io.*;
class Pokemon
{
	private String name, attribute;
	private int level;
	private String attributeName[] = { "一般系", "火系", "格鬥系", "水系", "飛行系", "草系", "毒系", "電系", "地面系", "超能力系",  "岩系", "冰系", "蟲系", "龍系", "幽靈系", "邪惡系", "鋼系", "妖精系" };
	public void setName( String name )
	{
		this.name = name != null ? name : null;
	}
	public void setAttribute( String attribute )
	{
		this.attribute = "一般系";
		for( String i: attributeName )
		{
			if( i.equals(attribute) ) this.attribute = i;
		}
	}
	public void setLevel( int level )
	{
		this.level = level > 0 ? level : 1;
	}
	Pokemon()
	{
		this( null, "一般系", 1 );
	}
	Pokemon( String name )
	{
		this( name, "一般系", 1 );
	}
	Pokemon( String name, String attribute )
	{
		this( name, attribute, 1 );
	}
	Pokemon( String name, String attribute, int level )
	{
		setName( name );
		setAttribute( attribute);
		setLevel( level );
	}
	public void showInformation()
	{
		System.out.println( "寵物名稱：" + name + "\n寵物屬性：" + attribute + "\n寵物等級：" + level );
	}
}
public class hw39
{
	private static int intJudge( String msg ) throws IOException
	{
		int error, result = 0;
		error = 1;
		while( error == 1 )
		{
			System.out.print( msg );
			try
			{
				result = Integer.parseInt( buf.readLine() );
				error = 0;
			}
			catch( NumberFormatException e )
			{
				System.out.println( "輸入錯誤" );
			}
		}
		return result;
	}
	private static BufferedReader buf = new BufferedReader( new InputStreamReader( System.in ) );

	public static void main( String args[] ) throws IOException
	{
		String name, att;
		int level;
		Pokemon mon;
		while(true)
		{
			System.out.print( "請輸入寵物名稱：" );
			name = buf.readLine();
			System.out.print( "請輸入寵物屬性：" );
			att = buf.readLine();
			if( att.equals( "0" ) ) 
			{
				mon = new Pokemon( name );
				mon.showInformation();
				continue;
			}
			System.out.print( "請輸入寵物等級：" );
			try
			{
				level = Integer.parseInt( buf.readLine() );
			}
			catch( NumberFormatException e )
			{
				mon = new Pokemon( name, att );
				mon.showInformation();
				continue;
			}
			mon = new Pokemon( name, att, level );
			mon.showInformation();
		}
	}

}
