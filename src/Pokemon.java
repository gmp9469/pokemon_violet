class Pokemon  {
	public String type;//each pokemon has its unique type, health, and set of moves
	public int health;
	public String name;
	public  String eff;
	moveset move1;
	moveset move2;
	moveset move3;
	moveset move4;
	public int healthpoint(moveset x){
		int points = 0; 
		int healthbar;
		String attack = x.mtype;
		String defend = this.type;
		int dmg = x.hitpts;
		if (attack.equals("fire")) {
			if (defend.equals("grass")){
				points=2*dmg;
				}
			else if (defend.equals("water") ){
				points=dmg/2;
				}
			else {
				points=dmg;
				}		
		}
		
		else if (attack.equals("water")){
			if (defend.equals("fire")){
				points=2*dmg; 
				}
			else if (defend.equals("grass")){
				points=dmg/2;
				}
			else {
				points=dmg;
			}}
		
		else if (attack.equals("grass")){
			if (defend.equals("water")){
				points=2*dmg;
				}
			else if (defend.equals("fire")){
				points=dmg/2;
				}
			else{
				points=dmg;
				}
		}
		else if (attack.equals("normal")) {
			points= dmg;
		}
		else if (attack.equals("ice")) {
			if (defend.equals("fire")){
				points=dmg/2; 
			}
			else if (defend.equals("grass")){
				points=dmg*2;
				}
			else if (defend.equals("water")){
				points=dmg/2;
				}
		}
		else if (attack.equals("dragon")) {
			if (defend.equals("fire")){
				points=dmg; 
				}
			else if (defend.equals("grass")){
				points=dmg;
				}
			else if (defend.equals("water")){
				points=dmg;
				}
		}
		else if (attack.equals("poison")) {
			if (defend.equals("fire")){
				points=dmg; 
				}
			else if (defend.equals("grass")){
				points=dmg*2;
				}
			else if (defend.equals("water")){
				points=dmg;
				}
		}
		else
		{
			points=dmg;
		}
		
		this.health-=points; 
		healthbar=this.health; 
		return healthbar;
	}
	public String damage(moveset x)//determines how much damage is done depending on 
	//type of pokemon and attack. Also updates pokemon's health depending on damage
	{
		String attack=x.mtype;
		String defend = this.type;
		
		if (attack.equals("fire")) {
			if (defend.equals("grass")){
				eff = "It was super effective";}
			else if (defend.equals("water") ){
				eff = "It was not effective";}
			else {
				eff = "It was normally effective";}		
		}
		
		else if (attack.equals("water")){
			if (defend.equals("fire")){
				eff = "It was super effective";}
			else if (defend.equals("grass")){
				eff = "It was not effective";}
			else {
				eff = "It was normally effective";}
		}
		
		else if (attack.equals("grass")){
			if (defend.equals("water")){
				eff = "It was super effective";}
			else if (defend.equals("fire")){
				eff = "It was not effective";}
			else{
				eff = "It was normally effective";}
		}
		else if (attack.equals("normal")) {
			eff = "It was normally effective";
		}
		else if (attack.equals("ice")) {
			if (defend.equals("fire")){
				eff = "It was normally effective";}
			else if (defend.equals("grass")){
				eff = "It was super effective";}
			else if (defend.equals("water")){
				eff = "It was not effective";}
		}
		else if (attack.equals("dragon")) {
			if (defend.equals("fire")){
				eff = "It was normally effective";}
			else if (defend.equals("grass")){
				eff = "It was super effective";}
			else if (defend.equals("water")){
				eff = "It was normally effective";}
		}
		else if (attack.equals("poison")) {
			if (defend.equals("fire")){
				eff = "It was normally effective";}
			else if (defend.equals("grass")){
				eff = "It was super effective";}
			else if (defend.equals("water")){
				eff = "It was super effective";}
		}
		
		return eff;
		
	}
}

