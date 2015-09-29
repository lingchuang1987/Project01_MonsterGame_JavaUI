package mainActivities;

import myMonsters.Monster;
import myLib.selecMonster;

public class TryRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int random;
		Monster player1;
		random=(int)(Math.random()*8+1);
		player1=selecMonster.selMonster(random);
		System.out.println(random);
		System.out.println(player1.getName());
		System.out.println(player1.getAblt());
	}

}
