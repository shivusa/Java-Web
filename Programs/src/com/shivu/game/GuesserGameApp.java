package com.shivu.game;
import java.util.*;

class Guesser
{
	    int gNum;
	    int guessNum()
	    {
	    	System.out.println("Guesser Please guess the number between 1 to 100: ");
	    	Scanner scan=new Scanner(System.in);
	    	gNum = scan.nextInt();
	    	return gNum;
	    }
}
class Player
{
	int pNum;
	int predictNum()
	{
		System.out.println("Player please predict the number: ");
		Scanner scan =new Scanner(System.in);
		pNum = scan.nextInt();
		return pNum;
	}
}
class Umpire
{
	int numFromGuesser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;
	void collectNumFromGuesser()
	{
		Guesser g = new Guesser();
		numFromGuesser = g.guessNum();
	}
	void collectNumFromPlayer()
	{
		Player p1 = new Player();
		Player p2 = new Player();
		Player p3 = new Player();
		numFromPlayer1 = p1.predictNum();
		numFromPlayer2 = p2.predictNum();
		numFromPlayer3 = p3.predictNum();
	}
	void compare()
	{
		if (numFromGuesser == numFromPlayer1) {
			System.out.println("Player1 Wins!");
		}
		else if(numFromGuesser == numFromPlayer2) {
			System.out.println("Player2 Wins!");
		}
		else if(numFromGuesser == numFromPlayer3) {
			System.out.println("Player3 Wins!");
		}
		else {
			System.out.println("Game Lost, Play again!");
		}
	}
}

public class GuesserGameApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Umpire u = new Umpire();
		u.collectNumFromGuesser();
		u.collectNumFromPlayer();
		u.compare();

	}

}
