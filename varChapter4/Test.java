package varChapter4;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 boolean paid = purchaseCart(1L);
	        System.out.println("Success: " + paid);
	}

	private static boolean purchaseCart(long l) {
		// TODO Auto-generated method stub
		var price=AddCost.fetchPrice(new String[0]);
		var paid=AddCost.checkDebitCard(price);
		return paid;
	}

}
