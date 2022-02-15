package varChapter4;

import java.util.Date;

import swich_JDK12.Player;

public class VarAndMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 System.out.println(checkPlayer());
 
	}

	private static Report checkPlayer() {
		// TODO Auto-generated method stub
		var player=new Player();
		var date=new Date();
		var report=fetchReporot(player, date);
		return report;
		
	}

	private static Report fetchReporot(Player player, Date date) {
		return new Report();
	}

}
