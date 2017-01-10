public class hw54
{
	public static void main( String args[] )
	{
		Person people[] = new Person[3];
		people[0] = new Muggle( "muggle", 1, "流浪漢" );
		people[1] = new Kind_mage( "好", 10000, 10 );
		people[2] = new Wicked_mage( "壞", 10, 10000 );
		for( Person cur: people )
		{
			cur.show();
		}
		Kind_mage kMage = (Kind_mage) people[1];
		Wicked_mage wMage = (Wicked_mage) people[2];
		
		kMage.magicAttack();
		kMage.magicDefense();
		wMage.magicAttack();
		wMage.magicDefense();
	}
}
