package varChapter4;

import java.util.Random;

public class VarWithFinal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub.
 var ratio=fetchRatio();// так как метод возвращает флоат то вар...
 var weighter= new Weighter() {// тут вейгтер

	@Override
	public int getWeight(Player player) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float gerMorginOfError() {
		
		return ratio*0.1f;
	}
	 
 };
 
 System.out.println("хрень 2"+weighter.gerMorginOfError());
	}

	
	
	private static float fetchRatio() {
		// TODO Auto-generated method stub
		
		final var limit= new Random().nextFloat();
		final var	test=0.00569f;
		return limit*test/100f;
	}

}
