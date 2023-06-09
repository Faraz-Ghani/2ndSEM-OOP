package pckg;
import java.util.Arrays;
import java.util.Scanner;

public class SummerAssignment {
	static int[] Cards;
	static int[][] players = new int[3][7];
	static int count=0;
	static int num=-1;
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		//Deck of cards from 0 to 20 (total 21)
		Fill();
		
		
		//First Phase
		Split();
		CardsDisplay();
		System.out.println("Please Choose the deck your number is in");
		num=sc.nextInt();
		Shuffle(num);
		System.out.println();
		
		
		//Second Phase
		Split();
		CardsDisplay();
		System.out.println("Please Choose the deck your number is in");
		num=sc.nextInt();
		Shuffle(num);
		System.out.println();
		
		//Third Phase
		Split();
		CardsDisplay();
		System.out.println("Please Choose the deck your number is in");
		num=sc.nextInt();
		System.out.println();
		System.out.println("Your Card is "+players[num-1][3]);		
		
		sc.close();
	}
	public static void CardsDisplay() {
		System.out.println("Deck One has the Following Cards: ");
		System.out.println(Arrays.toString(players[0]));
		System.out.println();
		
		System.out.println("Deck Two has the Following Cards: ");
		System.out.println(Arrays.toString(players[1]));
		System.out.println();
		
		System.out.println("Deck Three has the Following Cards: ");
		System.out.println(Arrays.toString(players[2]));
		System.out.println();
		
	}
	
	public static void Fill() {
		Cards= new int[21];
		for(int i=0;i<21;i++) {
			Cards[i]=i;
		}
	}
	
	public static void Shuffle(int deckNum){
		switch(deckNum) {
		case 1:
			ShuffleHelp(players[1]);
			ShuffleHelp(players[0]);
			ShuffleHelp(players[2]);
			break;
		case 2:
			ShuffleHelp(players[0]);
			ShuffleHelp(players[1]);
			ShuffleHelp(players[2]);
			break;
		case 3:
			ShuffleHelp(players[0]);
			ShuffleHelp(players[2]);
			ShuffleHelp(players[1]);
			break;
		}
		count=0;
	}
	
	public static void ShuffleHelp(int[] arr) {
		for(int i=0;i<7;i++,count++) {
			Cards[count]=arr[i];
		}
		
	}
	
	public static void Split() {
		for(int i=0,counter=0;i<7;i++,counter+=3) {
			players[0][i]=Cards[counter];
			players[1][i]=Cards[counter+1];
			players[2][i]=Cards[counter+2];
			
		}
	}
}