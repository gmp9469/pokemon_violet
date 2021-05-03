import java.util.Random;
import java.util.Scanner;
public class Pokemon_Violet {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random randomx = new Random();
		int r1 = randomx.nextInt(3);
		int r2 = randomx.nextInt(3);
		Pokemon mypokemon = new Pokemon();
		Pokemon cpupokemon = new Pokemon();
		if (r1==0) {
			mypokemon= new charizard();
			System.out.println("Charizard has been chosen for you!");
		}
		else if (r1==1) {
			mypokemon= new venusaur();
			System.out.println("Venusaur has been chosen for you!");

		}
		else if (r1==2) {
			mypokemon= new blastoise();
			System.out.println("Blastoise has been chosen for you!");

		}
		if (r2==0) {
			cpupokemon= new charizard();
			System.out.println("Computer has choesn Charizard!");

		}
		else if (r2==1) {
			cpupokemon= new venusaur();
			System.out.println("Computer has choesn Venusaur!");

		}
		else if (r2==2) {
			cpupokemon= new blastoise();
			System.out.println("Computer has choesn Blastoise!");
		}
		
		
		Scanner scan = new Scanner(System.in);
		while (mypokemon.health > 0) {
		System.out.println("Choose a Move!");
		// I know this is maybe not a scanner and a click but not sure how to do that
		// I think that is someone else's part idk, this is just place holder for structure
		String move = scan.nextLine();
		
		if (move.equals("1")) {
			System.out.println("Your " + mypokemon.name + " used " + mypokemon.move1.movename);
			cpupokemon.damage(mypokemon.move1); 		
			System.out.println();


		}
		if (move.equals("2")) {
			System.out.println("Your " + mypokemon.name + " used " + mypokemon.move2.movename);
			cpupokemon.damage(mypokemon.move2);
			System.out.println();

		}
		if (move.equals("3")) {
			System.out.println("Your " + mypokemon.name + "used " + mypokemon.move3.movename);
			cpupokemon.damage(mypokemon.move3);
			System.out.println();

		}
		if (move.equals("4")) {
			System.out.println("Your " + mypokemon.name + " used " + mypokemon.move4.movename);
			cpupokemon.damage(mypokemon.move4);
			System.out.println();

		}
		if (cpupokemon.health <=0) {
			System.out.println("You have won!");
			break;
		}

		int cpumove = randomx.nextInt(4)+1;
		if (cpumove==1) {
			System.out.println("Enemy " + cpupokemon.name + " used " + cpupokemon.move1.movename);
			mypokemon.damage(cpupokemon.move1);
			System.out.println();

		}
		if (cpumove==2) {
			System.out.println("Enemy " + cpupokemon.name + " used " + cpupokemon.move2.movename);
			mypokemon.damage(cpupokemon.move2);
			System.out.println();

		}
		if (cpumove==3) {
			System.out.println("Enemy " + cpupokemon.name + " used " + cpupokemon.move3.movename);
			mypokemon.damage(cpupokemon.move3);
			System.out.println();

		}
		if (cpumove ==4) {
			System.out.println("Enemy " + cpupokemon.name + " used " + cpupokemon.move4.movename);
			mypokemon.damage(cpupokemon.move4);
			System.out.println();

		}
		
	
		if (mypokemon.health <=0) {
			System.out.println("You have lost!");
			break;
		}
		
		System.out.println(mypokemon.name+ "'s health:"+ mypokemon.health);
		System.out.println(cpupokemon.name+"'s health:"+ cpupokemon.health);
	
	}

}}

