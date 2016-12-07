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
	public String getName(){ return name; }
	public String getAttribute(){ return attribute; }
	public int getLevel(){ return level; }
}
public class hw40
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
		int level = 0, i, n;
		Pokemon mon[];
		n = intJudge( "請輸入Pokemon數量：" );
		mon = new Pokemon[n];
		i = 0;
		while( i < n )
		{
			System.out.print( "請輸入寵物名稱：" );
			name = buf.readLine();
			System.out.print( "請輸入寵物屬性：" );
			att = buf.readLine();
			if( att.equals( "0" ) ) 
			{
				mon[i] = new Pokemon( name );
			}
			else
			{
				System.out.print( "請輸入寵物等級：" );
				try
				{
					level = Integer.parseInt( buf.readLine() );
				}
				catch( NumberFormatException e )
				{
					mon[i] = new Pokemon( name, att );
				}
				mon[i] = new Pokemon( name, att, level );
			}
			i++;
		}
		String mode;
		boolean run = true;
		Pokemon edit = new Pokemon( null, null, 0 );
		while( run )
		{
			System.out.print( "請選擇以下功能。\n1：顯示所有 Pokemon 資訊\n2：顯示等級最高的 Pokemon 資訊\n3：修改 Pokemon 資料\n4：離開程式\n>>" );
			mode = buf.readLine();
			switch( mode )
			{
				case "1":
					for( Pokemon m: mon )
					{
						m.showInformation();
					}
					break;
				case "2":
					for( Pokemon m: mon )
					{
						edit = edit.getLevel() < m.getLevel() ? m : edit;
					}
					edit.showInformation();
					break;
				case "3":
					i = intJudge( "請輸入第幾筆資料：" );
					if( i <= 0 || i > n )
					{
						System.out.println( "超過惹" );
						break;
					}
					System.out.print( "1：修改寵物名稱 2：修改寵物屬性 3：修改寵物等級。\n>>" );
					mode = buf.readLine();
					edit = mon[i-1];
					switch( mode )
					{
						case "1":
							System.out.print( "原名稱為：" + edit.getName() + "，將名稱修改為：" );
							edit.setName( buf.readLine() );
							break;
						case "2":
							System.out.print( "原屬性為：" + edit.getAttribute() + "，將屬性修改為：" );
							edit.setAttribute( buf.readLine() );
							break;
						case "3":
							edit.setLevel( intJudge( "原等級為：" + edit.getLevel() + "，將等級修改為：" ) );
							break;
					}
					edit.showInformation();
					break;
				case "4":
					run = false;
					break;
			}
		}
	}

}
