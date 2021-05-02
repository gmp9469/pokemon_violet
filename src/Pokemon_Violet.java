import java.util.Random;
import java.util.Scanner;

public class Pokemon_Violet {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random randomx = new Random();
		int r = randomx.nextInt(3);
		int r2 = randomx.nextInt(3);
		System.out.println(r);
		charizard mypokemon = new charizard();
		charizard cpupokemon = new charizard();
//		if (r==0) {
//			charizard mypokemon= new charizard();
//		}
//		else if (r==1) {
//			venusaur mypokemon= new venusaur();
//		}
//		else if (r==2) {
//			blastoise mypokemon= new blastoise();
//		}
//		if (r2==0) {
//			charizard cpupokemon= new charizard();
//		}
//		else if (r2==1) {
//			venusaur cpupokemon= new venusaur();
//		}
//		else if (r2==2) {
//			blastoise cpupokemon= new blastoise();
//		}
//		
		
		Scanner scan = new Scanner(System.in);
		while (mypokemon.health > 0) {
		System.out.println("Choose a Move!");
		// I know this is maybe not a scanner and a click but not sure how to do that
		// I think that is someone else's part idk, this is just place holder for structure
		String move = scan.nextLine();
		
		if (move.equals("1")) {
			cpupokemon.damage(mypokemon.move1);
			System.out.println("Your " + "Charizard used " + mypokemon.move1.movename);
		}
		if (move.equals("2")) {
			cpupokemon.damage(mypokemon.move2);
			System.out.println("Your " + "Charizard used " + mypokemon.move2.movename);

		}
		if (move.equals("3")) {
			cpupokemon.damage(mypokemon.move3);
			System.out.println("Your " + "Charizard used " + mypokemon.move3.movename);

		}
		if (move.equals("4")) {
			cpupokemon.damage(mypokemon.move4);
			System.out.println("Your " + "Charizard used " + mypokemon.move4.movename);

		}
		int cpumove = randomx.nextInt(4)+1;
		if (cpumove==1) {
			mypokemon.damage(cpupokemon.move1);
			System.out.println("Enemy " + "Charizard used " + cpupokemon.move1.movename);

		}
		if (cpumove==2) {
			mypokemon.damage(cpupokemon.move2);
			System.out.println("Enemy " + "Charizard used " + cpupokemon.move2.movename);

		}
		if (cpumove==3) {
			mypokemon.damage(cpupokemon.move3);
			System.out.println("Enemy " + "Charizard used " + cpupokemon.move3.movename);

		}
		if (cpumove ==4) {
			mypokemon.damage(cpupokemon.move4);
			System.out.println("Enemy " + "Charizard used " + cpupokemon.move4.movename);


		}
		
	
		if (mypokemon.health <=0) {
			System.out.println("You have lost!");
			break;
		}
		if (cpupokemon.health <=0) {
			System.out.println("You have won!");
			break;
		}

		System.out.print(mypokemon.health);
	
	}

}}
