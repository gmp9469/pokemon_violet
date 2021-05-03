
public class blastoise extends Pokemon{
	blastoise()
	{
		name = "blastoise";
		type="water";
		health=1000; 
		move1 = new moveset("surf", "water", 90);
		move2 = new moveset("water gun", "water", 30);
		move3 = new moveset("giga impact", "normal", 170);
		move4 = new moveset("ice beam", "ice", 100);
	}
}
