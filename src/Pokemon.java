class Pokemon  {
	public String type;//each pokemon has its unique type, health, and set of moves
	public int health;
	public String name;
	moveset move1;
	moveset move2;
	moveset move3;
	moveset move4;
	
	public void damage(moveset x)//determines how much damage is done depending on 
	//type of pokemon and attack. Also updates pokemon's health depending on damage
	{
		int points; 
		String attack=x.mtype;
		int dmg=x.hitpts; 
		String defend=this.type;
		
		if (attack.equals("fire")) {
			if (defend.equals("grass"))
			{points=2*dmg;}
			else if (defend.equals("water"))
			{points=dmg/2;}
			else 
			{points=dmg;}		
		}
		else if (attack.equals("water")){
			if (defend.equals("fire"))
			{points=2*dmg; }
			else if (defend.equals("grass"))
			{points=dmg/2;}
			else 
			{points=dmg;}
		}
		else if (attack.equals("grass")){
			if (defend.equals("water"))
			{points=2*dmg;}
			else if (defend.equals("fire"))
			{points=dmg/2;}
			else 
			{points=dmg;}
		}
		else
		{points=dmg;}
		this.health-=points; 
		if (points ==dmg) {
			System.out.println("It was normally effective."); 
		}
		else if (points ==2*dmg) {
			System.out.println("It was super effective.");

		}
		else if (points ==.5*dmg) {
			System.out.println("It was not very effective.");

		}
	}
}

