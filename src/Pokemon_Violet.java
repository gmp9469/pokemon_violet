import java.util.Random;
import java.util.Scanner;

public class Pokemon_Violet {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random randomx = new Random();
		int r = randomx.nextInt(3);
		int r2 = randomx.nextInt(3);
		System.out.println(r);
		Pokemon mypokemon = new Pokemon();
		Pokemon cpupokemon = new Pokemon();
		if (r==0) {
			mypokemon= new charizard();
		}
		else if (r==1) {
			mypokemon= new charizard();
		}
		else if (r==2) {
			mypokemon= new charizard();
		}
		if (r2==0) {
			cpupokemon= new charizard();
		}
		else if (r2==1) {
			cpupokemon= new venusaur();
		}
		else if (r2==2) {
			cpupokemon= new blastoise();
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

		}
		if (move.equals("2")) {
			System.out.println("Your " + mypokemon.name + " used " + mypokemon.move2.movename);
			cpupokemon.damage(mypokemon.move2);


		}
		if (move.equals("3")) {
			System.out.println("Your " + mypokemon.name + "used " + mypokemon.move3.movename);
			cpupokemon.damage(mypokemon.move3);


		}
		if (move.equals("4")) {
			System.out.println("Your " + mypokemon.name + " used " + mypokemon.move4.movename);
			cpupokemon.damage(mypokemon.move4);


		}
		if (cpupokemon.health <=0) {
			System.out.println("You have won!");
			break;
		}

		int cpumove = randomx.nextInt(4)+1;
		if (cpumove==1) {
			System.out.println("Enemy " + cpupokemon.name + " used " + cpupokemon.move1.movename);
			mypokemon.damage(cpupokemon.move1);


		}
		if (cpumove==2) {
			System.out.println("Enemy " + cpupokemon.name + " used " + cpupokemon.move2.movename);
			mypokemon.damage(cpupokemon.move2);


		}
		if (cpumove==3) {
			System.out.println("Enemy " + cpupokemon.name + " used " + cpupokemon.move3.movename);
			mypokemon.damage(cpupokemon.move3);


		}
		if (cpumove ==4) {
			System.out.println("Enemy " + cpupokemon.name + " used " + cpupokemon.move4.movename);
			mypokemon.damage(cpupokemon.move4);


		}
		
	
		if (mypokemon.health <=0) {
			System.out.println("You have lost!");
			break;
		}

		System.out.print(mypokemon.health);
	
	}

}}
