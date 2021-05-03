import java.util.Random;
import processing.core.PApplet;
import processing.core.PImage;
public class Pokemon_Violet extends PApplet{
	PImage venusaur;  PImage charizard;  PImage blastoise;
	Pokemon mypokemon = new Pokemon();
	Pokemon cpupokemon = new Pokemon();
	Random randomx = new Random();
	int r1 = randomx.nextInt(3);
	int r2 = randomx.nextInt(3);
	public static void main(String[] args) {
		PApplet.main("Pokemon_Violet");			
}
	public void settings() {	
		size(700,700);
	}
	public void setup() {
		background(255,255,255); 
		charizard = loadImage("charizard.png");
		venusaur = loadImage("venusaur.png");
		blastoise = loadImage("blastoise.jpg");
		
		textSize(15); 
		fill(0,0,0);
		if (r1==0) {
			mypokemon= new charizard();			
			textAlign(LEFT);
			text("You have chosen Charizard!",20,50);
		}
		else if (r1==1) {
			mypokemon= new venusaur();			 
			textAlign(LEFT);
			text("You have chosen Venusaur!",20,50);
		}
		else if (r1==2) {
			mypokemon= new blastoise();
			textAlign(LEFT);
			text("You have chosen Blastoise!",20,50);
		}
		if (r2==0) {
			cpupokemon= new charizard();			
			textAlign(RIGHT);
			text("Computer has chosen Charizard!",680,50);
		}
		else if (r2==1) {
			cpupokemon= new venusaur();			
			textAlign(RIGHT);
			text("Computer has chosen Venusaur!",680,50);
		}
		else if (r2==2) {
			cpupokemon= new blastoise();
			textAlign(RIGHT);
			text("Computer has chosen Blastoise!",680,50);
		}		
		textAlign(LEFT);
		text(mypokemon.name+" ("+mypokemon.type+")",60,488);
		textAlign(RIGHT);
		text(cpupokemon.name+" ("+cpupokemon.type+")",640,488);		
		textAlign(LEFT);
		text("Choose a Move! (1 ~ 4)",250,70);
		text("1."+ mypokemon.move1.movename,250,90);
		text("2."+ mypokemon.move2.movename,250,110);
		text("3."+ mypokemon.move3.movename,250,130);
		text("4."+ mypokemon.move4.movename,250,150);
	}	
	public void draw() {
		//health bar 
		fill(255,0,0);
		rect(60,250,100,10); 
		rect(530,250,100,10);
		if(r1==0) {
			image(charizard,20,270,200,200);
		}
		else if(r1==1) {
			image(venusaur,20,270,200,200);
		}
		else if(r1==2) {
			image(blastoise,20,270,200,200);
		}
		if(r2==0) {
			image(charizard,500,270,200,200);
		}
		else if(r2==1) {
			image(venusaur,500,270,200,200);
		}
		else if(r2==2) {
			image(blastoise,500,270,200,200);
		}		
	}
	public void keyPressed() {
		Random randomx = new Random();
		textSize(15); 
		fill(0,0,0);
		textAlign(LEFT);
		
		int cpumove = randomx.nextInt(4)+1;
			if(keyCode == '1') {
				background(255,255,255);
				text("Your " + mypokemon.name + " used " + mypokemon.move1.movename+"!",40,190);
				text(mypokemon.name+" ("+mypokemon.type+")",60,488);
				cpupokemon.damage(mypokemon.move1); 
				if (cpumove==1) {		
					text("Enemy " + cpupokemon.name + " used " + cpupokemon.move1.movename,400,190);
					mypokemon.damage(cpupokemon.move1);
					text(cpupokemon.name+" ("+cpupokemon.type+")",500,488);		
				}
				else if (cpumove==2) {
					text("Enemy " + cpupokemon.name + " used " + cpupokemon.move2.movename,400,190);
					mypokemon.damage(cpupokemon.move2);
					text(cpupokemon.name+" ("+cpupokemon.type+")",500,488);		
				}
				else if (cpumove==3) {
					text("Enemy " + cpupokemon.name + " used " + cpupokemon.move3.movename,400,190);
					mypokemon.damage(cpupokemon.move3);
					text(cpupokemon.name+" ("+cpupokemon.type+")",500,488);		
				}
				else if (cpumove==4) {
					text("Enemy " + cpupokemon.name + " used " + cpupokemon.move4.movename,400,190);
					mypokemon.damage(cpupokemon.move4);
					text(cpupokemon.name+" ("+cpupokemon.type+")",500,488);		
				}
			}
			else if (keyCode == '2') {
				background(255,255,255);
				text("Your " + mypokemon.name + " used " + mypokemon.move2.movename +"!",40,190);
				text(mypokemon.name+" ("+mypokemon.type+")",60,488);
				cpupokemon.damage(mypokemon.move2); 

				if (cpumove==1) {		
					text("Enemy " + cpupokemon.name + " used " + cpupokemon.move1.movename,400,190);
					mypokemon.damage(cpupokemon.move1);
					text(cpupokemon.name+" ("+cpupokemon.type+")",500,488);		
				}
				else if (cpumove==2) {
					text("Enemy " + cpupokemon.name + " used " + cpupokemon.move2.movename,400,190);
					mypokemon.damage(cpupokemon.move2);
					text(cpupokemon.name+" ("+cpupokemon.type+")",500,488);		
				}
				else if (cpumove==3) {
					text("Enemy " + cpupokemon.name + " used " + cpupokemon.move3.movename,400,190);
					mypokemon.damage(cpupokemon.move3);
					text(cpupokemon.name+" ("+cpupokemon.type+")",500,488);		
				}
				else if (cpumove==4) {
					text("Enemy " + cpupokemon.name + " used " + cpupokemon.move4.movename,400,190);
					mypokemon.damage(cpupokemon.move4);
					text(cpupokemon.name+" ("+cpupokemon.type+")",500,488);		
				}
			}
			else if (keyCode == '3') {
				background(255,255,255);
				text("Your " + mypokemon.name + " used " + mypokemon.move3.movename+"!",40,190);
				text(mypokemon.name+" ("+mypokemon.type+")",60,488);
				cpupokemon.damage(mypokemon.move3); 

				if (cpumove==1) {		
					text("Enemy " + cpupokemon.name + " used " + cpupokemon.move1.movename,400,190);
					mypokemon.damage(cpupokemon.move1);
					text(cpupokemon.name+" ("+cpupokemon.type+")",500,488);		
				}
				else if (cpumove==2) {
					text("Enemy " + cpupokemon.name + " used " + cpupokemon.move2.movename,400,190);
					mypokemon.damage(cpupokemon.move2);
					text(cpupokemon.name+" ("+cpupokemon.type+")",500,488);		
				}
				else if (cpumove==3) {
					text("Enemy " + cpupokemon.name + " used " + cpupokemon.move3.movename,400,190);
					mypokemon.damage(cpupokemon.move3);
					text(cpupokemon.name+" ("+cpupokemon.type+")",500,488);		
				}
				else if (cpumove==4) {
					text("Enemy " + cpupokemon.name + " used " + cpupokemon.move4.movename,400,190);
					mypokemon.damage(cpupokemon.move4);
					text(cpupokemon.name+" ("+cpupokemon.type+")",500,488);		
				}
			}
			else if (keyCode == '4') {
				background(255,255,255);
				text("Your " + mypokemon.name + " used " + mypokemon.move4.movename+"!",40,190);
				text(mypokemon.name+" ("+mypokemon.type+")",60,488);
				cpupokemon.damage(mypokemon.move4); 

				if (cpumove==1) {		
					text("Enemy " + cpupokemon.name + " used " + cpupokemon.move1.movename,400,190);
					mypokemon.damage(cpupokemon.move1);
					text(cpupokemon.name+" ("+cpupokemon.type+")",500,488);		
				}
				else if (cpumove==2) {
					text("Enemy " + cpupokemon.name + " used " + cpupokemon.move2.movename,400,190);
					mypokemon.damage(cpupokemon.move2);
					text(cpupokemon.name+" ("+cpupokemon.type+")",500,488);		
				}
				else if (cpumove==3) {
					text("Enemy " + cpupokemon.name + " used " + cpupokemon.move3.movename,400,190);
					mypokemon.damage(cpupokemon.move3);
					text(cpupokemon.name+" ("+cpupokemon.type+")",500,488);		
				}
				else if (cpumove==4) {
					text("Enemy " + cpupokemon.name + " used " + cpupokemon.move4.movename,400,190);
					mypokemon.damage(cpupokemon.move4);
					text(cpupokemon.name+" ("+cpupokemon.type+")",500,488);		
				}
			}
			
			text("Choose a Move! (1 ~ 4)",250,70);
			text("1."+ mypokemon.move1.movename,250,90);
			text("2."+ mypokemon.move2.movename,250,110);
			text("3."+ mypokemon.move3.movename,250,130);
			text("4."+ mypokemon.move4.movename,250,150);
			
			text("Your "+mypokemon.name+ "'s health: "+ mypokemon.health,30,510);
			text("Enemy's"+cpupokemon.name+"'s health:"+ cpupokemon.health,460,510);

		
			if (cpupokemon.health <=0 && mypokemon.health > 0) {
				background(255,255,255);
				textSize(25); 
				fill(0,0,0);
				textAlign(CENTER);
				text("You have WON!!",350,550);
			}

			else if (mypokemon.health <=0 && cpupokemon.health > 0) {
				background(255,255,255);
				textSize(50); 
				fill(0,0,0);
				textAlign(CENTER);
				text("You have LOST!!",350,550);			
			}
			else if (mypokemon.health<=0 && cpupokemon.health <=0 ) {
				background(255,255,255);
				textSize(50); 
				fill(0,0,0);
				textAlign(CENTER);
				text("TIE",350,550);
			}
	}
	

	
}
	
	
