
class charizard extends Pokemon
{
	charizard()
	{
		name = "charizard";
		type="fire";
		health=1000; 
		move1 = new moveset("flamethrower", "fire", 100);
		move2 = new moveset("ember", "fire", 40);
		move3 = new moveset("hyper beam", "normal", 150);
		move4 = new moveset("dragon claw", "dragon", 100);
	}
}