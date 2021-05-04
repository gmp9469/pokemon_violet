import java.util.Random;
import processing.core.PApplet;
import processing.core.PImage;
import processing.sound.*;


public class Pokemon_Violet extends PApplet{
	PImage venusaur;  PImage charizard;  PImage blastoise; PImage backgroundimage; PImage backgroundimage2;
	SoundFile file;
	Pokemon mypokemon = new Pokemon();
	Pokemon cpupokemon = new Pokemon();
	Random randomx = new Random();
	Boolean refresh = false;
	int r1 = randomx.nextInt(3);
	int r2 = randomx.nextInt(3);
	int x1=20 ,y=270,x2=500, size =200;
	int speed = 0; int x_direction=1 ;
	
	public static void main(String[] args) {
		PApplet.main("Pokemon_Violet");			
}
	public void settings() {	
		size(700,700);
	}
	

	public void setup() {
		file = new SoundFile(this, "sample.wav");
		file.play((float)1.0,(float)0.5);
		background(255,255,255); 
		backgroundimage = loadImage("bg.png");
		backgroundimage2 = loadImage("bg2.png");
		charizard = loadImage("charizard.png");
		venusaur = loadImage("venusaur.png");
		blastoise = loadImage("blastoise.png");
		image(backgroundimage,0,0,700,700);
		image(backgroundimage2,0,0,700,700);	
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
		text("1. "+ mypokemon.move1.movename,250,90);
		text("2. "+ mypokemon.move2.movename,250,110);
		text("3. "+ mypokemon.move3.movename,250,130);
		text("4. "+ mypokemon.move4.movename,250,150);
		//health bar 
			fill(255,0,0);
			rect(60,250,100,10); 
			rect(530,250,100,10);
	}	
	public void draw() {
		
		if(refresh == true) {
			image(backgroundimage,0,0,700,700);	
				
		}
		if(r1==0) {
			image(charizard,x1,y,size,size);
		}
		else if(r1==1) {
			image(venusaur,x1,y,size,size);

		}
		else if(r1==2) {
			image(blastoise,x1,y,size,size);

		}
		if(r2==0) {
			image(charizard,x2,y,size,size);

		}
		else if(r2==1) {
			image(venusaur,x2,y,size,size);

		}
		else if(r2==2) {
			image(blastoise,x2,y,size,size);

		}	
		
		x1 += speed * x_direction;
		x2 -= speed * x_direction;
		if(keyPressed) {
			speed = 20;
		}
		
		if(x1 > 200 || x2 < 250) {
			x_direction = -x_direction;
		}
		
		if(x1 <20 || x2 > 500) {
			x1=20; x2=500; speed = 0;
			x_direction = -x_direction;
			
			refresh = false;
			
						
		}
		
		if(mypokemon.health<=0 || cpupokemon.health <=0 ) {
			noLoop();
		}
	}
	public void keyPressed() {
		refresh = true;
		Random randomx = new Random();
		textSize(15); 
		fill(0,0,0);
		textAlign(LEFT);
		int cpumove = randomx.nextInt(4)+1;
		image(backgroundimage2,0,0,700,700);
		if(keyCode == '1') {
			text("Your " + mypokemon.name + " used " + mypokemon.move1.movename+"!",40,190);
			text(mypokemon.name+" ("+mypokemon.type+")",60,488);
			cpupokemon.healthpoint(mypokemon.move1);
			text(cpupokemon.damage(mypokemon.move1),30,510);
			fill(255,0,0);
			rect(530,250,cpupokemon.healthpoint(mypokemon.move1)/10,10); 
			fill(0,0,0);
			
			if (cpumove==1) {	
				
				text("Enemy " + cpupokemon.name + " used " + cpupokemon.move1.movename,400,190);
				text(cpupokemon.name+" ("+cpupokemon.type+")",500,488);
				mypokemon.healthpoint(cpupokemon.move1);
				text(mypokemon.damage(cpupokemon.move1),460,510);
				fill(255,0,0);
				rect(60,250,mypokemon.healthpoint(cpupokemon.move1)/10,10); 
				fill(0,0,0);
				}
			else if (cpumove==2) {
				text("Enemy " + cpupokemon.name + " used " + cpupokemon.move2.movename,400,190);
				mypokemon.healthpoint(cpupokemon.move2);
				text(cpupokemon.name+" ("+cpupokemon.type+")",500,488);		
				text(mypokemon.damage(cpupokemon.move2),460,510);
				fill(255,0,0);
				rect(60,250,mypokemon.healthpoint(cpupokemon.move2)/10,10); 
				fill(0,0,0);

				}
			else if (cpumove==3) {
				text("Enemy " + cpupokemon.name + " used " + cpupokemon.move3.movename,400,190);
				mypokemon.healthpoint(cpupokemon.move3);
				text(cpupokemon.name+" ("+cpupokemon.type+")",500,488);	
				text(mypokemon.damage(cpupokemon.move3),460,510);
				fill(255,0,0);
				rect(60,250,mypokemon.healthpoint(cpupokemon.move3)/10,10); 
				fill(0,0,0);
				}
			else if (cpumove==4) {
				text("Enemy " + cpupokemon.name + " used " + cpupokemon.move4.movename,400,190);
				mypokemon.healthpoint(cpupokemon.move4);
				text(cpupokemon.name+" ("+cpupokemon.type+")",500,488);	
				text(mypokemon.damage(cpupokemon.move4),460,510);
				fill(255,0,0);
				rect(60,250,mypokemon.healthpoint(cpupokemon.move4)/10,10); 
				fill(0,0,0);
				}
			}
		else if (keyCode == '2') {
			
			text("Your " + mypokemon.name + " used " + mypokemon.move2.movename +"!",40,190);
			text(mypokemon.name+" ("+mypokemon.type+")",60,488);
			cpupokemon.healthpoint(mypokemon.move2);
			text(cpupokemon.damage(mypokemon.move2),30,510);
			fill(255,0,0);
			rect(530,250,cpupokemon.healthpoint(mypokemon.move2)/10,10); 
			fill(0,0,0);	
			if (cpumove==1) {		
				text("Enemy " + cpupokemon.name + " used " + cpupokemon.move1.movename,400,190);
				mypokemon.healthpoint(cpupokemon.move1);
				text(cpupokemon.name+" ("+cpupokemon.type+")",500,488);	
				text(mypokemon.damage(cpupokemon.move1),460,510);
				fill(255,0,0);
				rect(60,250,mypokemon.healthpoint(cpupokemon.move1)/10,10); 
				fill(0,0,0);
				}
			else if (cpumove==2) {
				text("Enemy " + cpupokemon.name + " used " + cpupokemon.move2.movename,400,190);
				mypokemon.healthpoint(cpupokemon.move2);
				text(cpupokemon.name+" ("+cpupokemon.type+")",500,488);	
				text(mypokemon.damage(cpupokemon.move2),460,510);
				fill(255,0,0);
				rect(60,250,mypokemon.healthpoint(cpupokemon.move2)/10,10); 
				fill(0,0,0);
				}
			else if (cpumove==3) {
				text("Enemy " + cpupokemon.name + " used " + cpupokemon.move3.movename,400,190);
				mypokemon.healthpoint(cpupokemon.move3);
				text(cpupokemon.name+" ("+cpupokemon.type+")",500,488);	
				text(mypokemon.damage(cpupokemon.move3),460,510);
				fill(255,0,0);
				rect(60,250,mypokemon.healthpoint(cpupokemon.move3)/10,10); 
				fill(0,0,0);
				}
			else if (cpumove==4) {
				text("Enemy " + cpupokemon.name + " used " + cpupokemon.move4.movename,400,190);
				mypokemon.healthpoint(cpupokemon.move4);
				text(cpupokemon.name+" ("+cpupokemon.type+")",500,488);	
				text(mypokemon.damage(cpupokemon.move4),460,510);
				fill(255,0,0);
				rect(60,250,mypokemon.healthpoint(cpupokemon.move4)/10,10); 
				fill(0,0,0);
				}
			}
		else if (keyCode == '3') {
			
			text("Your " + mypokemon.name + " used " + mypokemon.move3.movename+"!",40,190);
			text(mypokemon.name+" ("+mypokemon.type+")",60,488);
			cpupokemon.healthpoint(mypokemon.move2);
			text(cpupokemon.damage(mypokemon.move3),30,510);
			fill(255,0,0);
			rect(530,250,cpupokemon.healthpoint(mypokemon.move3)/10,10); 
			fill(0,0,0);
			if (cpumove==1) {		
				text("Enemy " + cpupokemon.name + " used " + cpupokemon.move1.movename,400,190);
				mypokemon.healthpoint(cpupokemon.move1);
				text(cpupokemon.name+" ("+cpupokemon.type+")",500,488);	
				text(mypokemon.damage(cpupokemon.move1),460,510);
				fill(255,0,0);
				rect(60,250,mypokemon.healthpoint(cpupokemon.move1)/10,10); 
				fill(0,0,0);
				}
			else if (cpumove==2) {
				text("Enemy " + cpupokemon.name + " used " + cpupokemon.move2.movename,400,190);
				mypokemon.healthpoint(cpupokemon.move2);
				text(cpupokemon.name+" ("+cpupokemon.type+")",500,488);	
				text(mypokemon.damage(cpupokemon.move2),460,510);
				fill(255,0,0);
				rect(60,250,mypokemon.healthpoint(cpupokemon.move2)/10,10); 
				fill(0,0,0);
				}
			else if (cpumove==3) {
				text("Enemy " + cpupokemon.name + " used " + cpupokemon.move3.movename,400,190);
				mypokemon.healthpoint(cpupokemon.move3);
				text(cpupokemon.name+" ("+cpupokemon.type+")",500,488);	
				text(mypokemon.damage(cpupokemon.move3),460,510);
				fill(255,0,0);
				rect(60,250,mypokemon.healthpoint(cpupokemon.move3)/10,10); 
				fill(0,0,0);
				}
			else if (cpumove==4) {
				text("Enemy " + cpupokemon.name + " used " + cpupokemon.move4.movename,400,190);
				mypokemon.healthpoint(cpupokemon.move4);
				text(cpupokemon.name+" ("+cpupokemon.type+")",500,488);	
				text(mypokemon.damage(cpupokemon.move4),460,510);
				fill(255,0,0);
				rect(60,250,mypokemon.healthpoint(cpupokemon.move4)/10,10); 
				fill(0,0,0);
				}
			}
		else if (keyCode == '4') {
			
			text("Your " + mypokemon.name + " used " + mypokemon.move4.movename+"!",40,190);
			text(mypokemon.name+" ("+mypokemon.type+")",60,488);
			cpupokemon.healthpoint(mypokemon.move2);
			text(cpupokemon.damage(mypokemon.move4),30,510);
			fill(255,0,0);
			rect(530,250,cpupokemon.healthpoint(mypokemon.move4)/10,10); 
			fill(0,0,0);
			if (cpumove==1) {		
				text("Enemy " + cpupokemon.name + " used " + cpupokemon.move1.movename,400,190);
				mypokemon.healthpoint(cpupokemon.move1);
				text(cpupokemon.name+" ("+cpupokemon.type+")",500,488);	
				text(mypokemon.damage(cpupokemon.move1),460,510);
				fill(255,0,0);
				rect(60,250,mypokemon.healthpoint(cpupokemon.move1)/10,10); 
				fill(0,0,0);
				}
			else if (cpumove==2) {
				text("Enemy " + cpupokemon.name + " used " + cpupokemon.move2.movename,400,190);
				mypokemon.healthpoint(cpupokemon.move2);
				text(cpupokemon.name+" ("+cpupokemon.type+")",500,488);	
				text(mypokemon.damage(cpupokemon.move2),460,510);
				fill(255,0,0);
				rect(60,250,mypokemon.healthpoint(cpupokemon.move2)/10,10); 
				fill(0,0,0);
				}
			else if (cpumove==3) {
				text("Enemy " + cpupokemon.name + " used " + cpupokemon.move3.movename,400,190);
				mypokemon.healthpoint(cpupokemon.move3);
				text(cpupokemon.name+" ("+cpupokemon.type+")",500,488);	
				text(mypokemon.damage(cpupokemon.move3),460,510);
				fill(255,0,0);
				rect(60,250,mypokemon.healthpoint(cpupokemon.move3)/10,10); 
				fill(0,0,0);
				}
			else if (cpumove==4) {
				text("Enemy " + cpupokemon.name + " used " + cpupokemon.move4.movename,400,190);
				mypokemon.healthpoint(cpupokemon.move4);
				text(cpupokemon.name+" ("+cpupokemon.type+")",500,488);	
				text(mypokemon.damage(cpupokemon.move4),460,510);
				fill(255,0,0);
				rect(60,250,mypokemon.healthpoint(cpupokemon.move4)/10,10); 
				fill(0,0,0);
				}
			}
			
			text("Choose a Move! (1 ~ 4)",250,70);
			text("1."+ mypokemon.move1.movename,250,90);
			text("2."+ mypokemon.move2.movename,250,110);
			text("3."+ mypokemon.move3.movename,250,130);
			text("4."+ mypokemon.move4.movename,250,150);
			
			text("Your "+mypokemon.name+ "'s health: "+ mypokemon.health,30,530);
			text("Enemy's"+cpupokemon.name+"'s health:"+ cpupokemon.health,460,530);
		
			if (cpupokemon.health <=0 && mypokemon.health > 0) {
				x1= 300;
				x2= -500;
				background(255,255,255);
				textSize(25); 
				fill(0,0,0);
				textAlign(CENTER);
				text("You have WON!!",350,550);
			}

			else if (mypokemon.health <=0 && cpupokemon.health > 0) {
				background(255,255,255);
				x1= -500;
				x2= 300;
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
	
	
	
