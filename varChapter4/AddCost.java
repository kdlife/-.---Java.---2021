package varChapter4;

public class AddCost {
	
	// Old API
	public static int fetchPrice(String[] product) {
		float realPrice=399.99F;
		int finPrice=(int)realPrice;
		return finPrice;
	}
	public static boolean checkDebitCard(int amount) {
		return true;
	}
	//New API
	public static float fetchPriceFloat(String[] product) {
		float price=399.99F;
		return price;
	}
	public static boolean checkDebitCardFloat(float amount) {
		return true;
	}
}
