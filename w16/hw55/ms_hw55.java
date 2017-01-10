import java.util.*;
public class hw55
{
	private static Scanner scn = new Scanner( System.in );
	public static void main( String args[] )
	{
		String tmp, name;
		int hp;
		System.out.print( "請輸入姓名：" );
		tmp = scn.nextLine();
		name = tmp.equals("") ? "不知名法師" : tmp;
		System.out.print( "請輸入血量：" );
		tmp = scn.nextLine();
		hp = tmp.equals("") ? 100 : Integer.parseInt(tmp);

		int playerBuf, cpBuf, cpAtk;
		Kind_mage player = new Kind_mage( name, hp, 0 );
		Wicked_mage cp = new Wicked_mage();
		player.show();
		while( player.getHp() > 0 && cp.getHp() > 0 )
		{
			playerBuf = 0;
			cpBuf = 0;
			System.out.println( "請選擇要執行的動作 A.使用攻擊魔法 B.使用防禦魔法" );
			tmp = scn.nextLine();
			if( tmp.equals("A") )
			{
				player.magicAttack();
				cpBuf -= player.getMp();
			}
			else
			{
				player.magicDefense();
				playerBuf += player.getMp();
			}
			cpAtk = (int) ( Math.random() * 2 );
			if( cpAtk == 1 )
			{
				cp.magicAttack();
				playerBuf -= cp.getMp();
			}
			else
			{
				cp.magicDefense();
				cpBuf += cp.getMp();
			}
			if( playerBuf < 0 ) player.setHp( player.getHp() + playerBuf );
			if( cpBuf < 0 ) cp.setHp( cp.getHp() + cpBuf );
			System.out.println( player.getName() + ", 血量 = " + player.getHp() );
			System.out.println( cp.getName() + ", 血量 = " + cp.getHp() );
		}
		name = player.getHp() > cp.getHp() ? player.getName() : cp.getName();
		System.out.println( name + "獲得勝利！" );
	}
}
