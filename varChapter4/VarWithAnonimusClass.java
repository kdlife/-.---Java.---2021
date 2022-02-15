package varChapter4;



public class VarWithAnonimusClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Weighter weigter= new Weighter() {
		@Override	
			public int getWeight (Player player) {// работает только с  классами в одном пакете
			return 100;
		}

		@Override
		public float gerMorginOfError() {// вложеный класс должен переопредилять все переменные  интерфейса
			// TODO Auto-generated method stub
			return 0;
		}
		};
		
		Player player=new Player();
		int weight=weigter.getWeight(player);
		System.out.println("Хрень не понятная"+ weight);
		
		
	}

}
