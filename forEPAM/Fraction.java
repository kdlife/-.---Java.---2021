package forEPAM;

public class Fraction {
	private int num;
	private int den;
	public Fraction(int num, int den) {
		this.num=num;
		this.den=den;
	}
	
	public  void setNum(int num) {
		this.num=num;
	}
	public void setDen(int den) {
		this.den=den;
	}
	public int getNum() {
		return num;
	}
	public int getDen() {
		return den;
	}
	private static int nod(int a,int b){// наибольший общий делидеь
	    return b == 0 ? a : nod(b,a % b);
	}
	private static int nok(int a,int b){// наименьшее кратное
	    return a / nod(a,b) * b;
	}
	public static void solveDen(Fraction[] frac2) {
		for (int i=0;i<frac2.length-1;i++) {
			if(frac2[i].den!=frac2[i+1].den) {
				int nok=nok(frac2[i].den,frac2[i+1].den);
				frac2[i].setNum(frac2[i].getNum()*(nok/frac2[i].getDen()));
				frac2[i+1].setNum(frac2[i+1].getNum()*(nok/frac2[i+1].getDen()));
				frac2[i].setDen(nok);
				frac2[i+1].setDen(nok);
				
			}
		}
		for(int i=0;i<frac2.length-1;i++) {
			if(frac2[i].den!=frac2[i+1].den) {
				solveDen(frac2);
			}
		}
	}
	@Override
	public String toString() {
		return num+"/"+den;
		
	}

}
