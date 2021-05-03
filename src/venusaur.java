
public class venusaur extends Pokemon{
	venusaur()
	{
		name = "venusaur";
		type="grass";
		health=1000; 
		move1 = new moveset("frenzy plant", "grass", 110);
		move2 = new moveset("vine whip", "grass", 60);
		move3 = new moveset("body slam", "normal", 80);
		move4 = new moveset("sludge bomb", "poison", 130);
	}
}
