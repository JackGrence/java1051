import java.io.*;
import java.util.*;
public class hw59
{
	public static BufferedReader buf = new BufferedReader( new InputStreamReader( System.in ) );
	private static ArrayList<Person> personList = new ArrayList<Person>();
	public static boolean rmList()
	{
		boolean result = false;
		int n;
		try
		{
			System.out.print("請輸入要刪除的 index :" );
			n = Integer.parseInt( buf.readLine() );
			personList.remove( n );
			result = true;
		}
		catch( IOException e )
		{
			System.out.println( "輸入錯誤" );
		}
		catch( NumberFormatException e )
		{
			System.out.println( "請輸入數字" );
		}
		catch( ArrayIndexOutOfBoundsException e )
		{
			System.out.println( "陣列索引值超過上限" );
		}
		catch( IndexOutOfBoundsException e )
		{
			System.out.println( "陣列索引值超過上限" );
		}
		return result;
	}
	public static boolean editList()
	{		
		boolean result = false;
		int n;
		try
		{
			System.out.print("請輸入要修改的 index :" );
			n = Integer.parseInt( buf.readLine() );
			while( !addList( personList.get(n) ) );
			result = true;
		}
		catch( IOException e )
		{
			System.out.println( "輸入錯誤" );
		}
		catch( NumberFormatException e )
		{
			System.out.println( "請輸入數字" );
		}
		catch( ArrayIndexOutOfBoundsException e )
		{
			System.out.println( "陣列索引值超過上限" );
		}
		catch( IndexOutOfBoundsException e )
		{
			System.out.println( "陣列索引值超過上限" );
		}
		return result;
	}
	public static boolean addList( Person p )
	{
		Person newPerson;
		String name;
		int age;
		boolean result = false;
		try
		{
			System.out.print( "請輸入姓名：" );
			name = buf.readLine();
			System.out.print( "請輸入年齡：" );
			age = Integer.parseInt( buf.readLine() );
			p.setName( name );
			p.setAge( age );
			result = true;
		}
		catch( IOException e )
		{
			System.out.println( "輸入錯誤" );
		}
		catch( NumberFormatException e )
		{
			System.out.println( "請輸入數字" );
		}
		catch( ArrayIndexOutOfBoundsException e )
		{
			System.out.println( "陣列索引值超過上限" );
		}
		finally
		{
			return result;
		}
	}
	public static void main( String args[] )
	{
		int n;
		int i;
		Person tmp;
		String mode;
		boolean run = true;
		try
		{
			System.out.print( "請問要輸入幾筆資料？\n>>" );
			n = Integer.parseInt( buf.readLine() );
			for( i = 0; i < n; i++ )
			{
				tmp = new Person( null, 0 );
				while( !addList( tmp ) );
				personList.add( tmp );
			}
		}
		catch( IOException e )
		{
			System.out.println( "輸入錯誤" );
		}
		catch( NumberFormatException e )
		{
			System.out.println( "請輸入數字" );
		}
		while( run )
		{
			System.out.println( "A.新增資料 B.修改資料 C.清空資料:" );
			try
			{
				mode = buf.readLine();
				switch( mode )
				{
					case "A":
						tmp = new Person( null, 0 );
						while( !addList( tmp ) );
						personList.add( tmp );
						break;
					case "B":
						if( personList.isEmpty() ) System.out.println( "目前無資料可修改" );
						else
						{
							i = 0;
							for( Person cur: personList )
							{
								System.out.println( i + "\t" + cur.getName() );
								i++;
							}
							while( !editList() );
						}
						break;
					case "C":
						if( personList.isEmpty() ) System.out.println( "目前無資料可清空" );
						else
						{
							i = 0;
							for( Person cur: personList )
							{
								System.out.println( i + "\t" + cur.getName() );
								i++;
							}
							rmList();
						}
						break;
				}
			}
			catch( IOException e )
			{
				System.out.println( "輸入錯誤" );
			}
			catch( NumberFormatException e )
			{
				System.out.println( "請輸入數字" );
			}
			catch( ArrayIndexOutOfBoundsException e )
			{
				System.out.println( "陣列索引值超過上限" );
			}
		}
	}
}
