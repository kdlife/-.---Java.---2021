package forEPAM;



public class Task26Matrix {
// тут сам не совсем справился, часть решения из инета
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Введите размер матрицы n*n");
		int n=HelpS.getNum();
		int [][] test=new int[n][n];
		final int MAGIC_CONST=(n*(n*n+1))/2;// магическая константа
		// для начала определим тип квадрата, исходля из этого будет применяться метод
		 if (n%2!=0){  // Нечетный порядок
	            oddMagic(n,test);
	        }else if (n%4!=0){  // Одиночный и четный порядок
	            return;
	        }else{  // Двойной четный порядок
	            doubleEvenMagic(n,test);
	        }
		 boolean check=checkMagic(test,MAGIC_CONST );
		 System.out.println("Квадрат явдяется маическим"+check);
		HelpS.printMass(test);
	}

	private static boolean checkMagic(int[][] test, int mag) {
	// TODO Auto-generated method stub
		int  sumDiag=0;
		int sumStr=0;
		int sumCol=0;
		for (int i =0;i<test.length;i++) {
			for(int j =0; j<test[0].length;j++) {
				if(i==j) {sumDiag+=test[i][j];}
				if(i==0)sumStr+=test[0][j];
				if(i==0)sumCol+=test[j][i];
				}
			}
		if((mag==sumDiag)&&(mag==sumStr)&&(mag==sumCol))return true;
	return false;
}

	private static void doubleEvenMagic(int n, int[][] test) {
		// TODO Auto-generated method stub
		 int c1=1,c2=n*n;// значения записываемые в массив  первое и последее
	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < n; j++) {
	                if (i%4==j%4||(i+j)%4==3){  // Диагональ перевернута(главная и вторстепеанная)
	                    test[i][j] = c2;
	                }else{  // Недиагональный передний ряд
	                    test[i][j] = c1;
	                }
	                c2--;
	                c1++;
	               // HelpS.printMass(test);
	            }
	            
	        }
		
		
	}

	private static void oddMagic(int n, int[][] test) {
		// TODO Auto-generated method stub//https://studfile.net/preview/1702019/page:4/ метод постро
		 int i = 0;
	        int j = n/2;
	        for (int k = 1; k <= n*n; k++) {// k- значение записываем в матрцу
	            test[i][j] = k;
	            if (k%n==0) {  // Если текущее число кратно n, спускаемся вниз
	                i++;
	            }else{  // Если текущее число не кратно n, идем вверх влево
	                i--;
	                j++;
	                if (i<0) i=n-1;
	                if (j>n-1) j=0;
	            }
	           // HelpS.printMass(test);
	        }
		
	}

	
	}


