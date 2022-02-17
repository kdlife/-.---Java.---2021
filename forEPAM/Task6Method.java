package forEPAM;

public class Task6Method {
		public static boolean checkNODPrime(int ...is) {
			
			for(int i =0; i<is.length-2;i++) {
				if(Task1Method.nod(is[i], is[i+1])!=1)return  false;
				
			}
			return true;
		}
}
