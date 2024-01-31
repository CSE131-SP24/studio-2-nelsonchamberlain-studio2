package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Start Amount?");
		int startAmnt = in.nextInt();
		System.out.println("Win Chance?");
		double winChance = in.nextDouble();
		System.out.println("Win Limit?");
		int winLimit = in.nextInt(); 
		for (int x = 1; x < 50; x++)
		{
			int startAmount = startAmnt; 
			while (startAmount < winLimit && startAmount > 0)
			{boolean wL = Math.random()<=winChance;
			if (wL == true)
			{
				startAmount = startAmount + 1;
			}
			else 
			{
				startAmount = startAmount -1;
			}
			}
			if (startAmount == winLimit)
			{
				System.out.println("Day " + x + ": Success!");
			}
			else
			{
				System.out.println("Day " + x + ": Failure");

			}
		}
	}

}
