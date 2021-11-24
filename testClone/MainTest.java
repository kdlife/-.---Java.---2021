package testClone;
import SecondChapter.Radius;
import com.rits.cloning.Cloner;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.google.gson.*;
public class MainTest {

	public static void main(String[] args) throws CloneNotSupportedException {//CloneNotSupportedException нужно добавить иначе не работает clone
		// TODO Auto-generated method stub
		Radius radius1=new Radius();
		radius1.setStart(0);
		radius1.setEnd(120);
PointM point1=new PointM(10, 15,radius1);
PointM pointCopy1=point1.copyPointM();//копируем обьект
System.out.println("Значение оригинала point: " + point1.getX() +"," + point1.getY()+"Хначение копии" + pointCopy1.getX()+","+pointCopy1.getY()+"radius" + radius1.getEnd()+ " , " + radius1.getStart() );
PointM pointCopy2=pointCopy1.clone();
System.out.println("Значение оригинала point: " + pointCopy1.getX() +"," + pointCopy1.getY()+"значение копии через clone()" + pointCopy2.getX()+","+pointCopy2.getY()+"radius" + radius1.getEnd()+ " , " + radius1.getStart()  );
point1.setX(25);
point1.setY(30);
Cloner clone=new Cloner();
PointM pointCloneCloner=new PointM();
pointCloneCloner= clone.deepClone(point1);// используя стророннюю библиотеку для клорирования, можно сделать глубокую копию.
radius1.setStart(50);
radius1.setEnd(300);
System.out.println("Значение оригинала point после изменения X Y: " + point1.getX() +"," + point1.getY()+"Хначение копии" + pointCopy1.getX()+","+pointCopy1.getY()+"radius" + radius1.getEnd()+ " , " + radius1.getStart()  );
System.out.println("Значение оригинала point после изменения X Y: " + pointCopy1.getX() +"," + pointCopy1.getY()+"значение копии через clone()" + pointCopy2.getX()+","+pointCopy2.getY()+"radius" + radius1.getEnd()+ " , " + radius1.getStart()  );
PointM pointCopy3=new PointM(point1);
System.out.println("Значение оригинала point после изменения X Y: " + point1.getX() +"," + point1.getY()+"значение копии через конструктор" + pointCopy3.getX()+","+pointCopy3.getY()+"radius" + radius1.getEnd()+ " , " + radius1.getStart()  );

System.out.println("Значение оригинала point после изменения X Y: " + point1.getX() +"," + point1.getY()+"значение копии через cloner" + pointCloneCloner.getX()+","+pointCloneCloner.getY()+"radius" + pointCloneCloner.getRadius().getEnd()+ " , " + pointCloneCloner.getRadius().getStart()  );
PointM clonePointGson= cloneThroughJson(point1);
System.out.println("clonePointGson  заначения "+ clonePointGson.getX()+", "+clonePointGson.getY()+","+clonePointGson.getRadius().getEnd()+","+clonePointGson.getRadius().getStart());
point1.setX(2511);
point1.setY(3011);
radius1.setStart(510);
radius1.setEnd(3020);
System.out.println("clonePointGson  заначения "+ clonePointGson.getX()+", "+clonePointGson.getY()+","+clonePointGson.getRadius().getEnd()+","+clonePointGson.getRadius().getStart());
// вывод изменения оригинала не влечет за собой изменение копии.
// скопированный обьект полностью смаомстоятелен
PointM pointCopySerialisable= cloneThroughSerializable(point1);
System.out.println("cloneThroughSerializable  заначения "+ pointCopySerialisable.getX()+", "+pointCopySerialisable.getY()+","+pointCopySerialisable.getRadius().getEnd()+","+pointCopySerialisable.getRadius().getStart());
point1.setX(25121);
point1.setY(30121);
radius1.setStart(5210);
radius1.setEnd(32020);
System.out.println("cloneThroughSerializable  заначения "+ pointCopySerialisable.getX()+", "+pointCopySerialisable.getY()+","+pointCopySerialisable.getRadius().getEnd()+","+pointCopySerialisable.getRadius().getStart());
int[][] source = {{3, 1, 5}, {3, 6, 7}};

// shallow copy of matrix (1)
System.out.println("\nShallow copy of matrix via manual copy (1):");
int[][] target1 = Matrices.cloneArrayOfInt1(source);
target1[0][0] = 0;
System.out.println("Original array:");
printMatrix(source);
System.out.println("Cloned and modified array:");
printMatrix(target1);

// shallow copy of matrix (2)
System.out.println("\nShallow copy of matrix via manual copy (2):");
int[][] target2 = Matrices.cloneArrayOfInt2(source);
target2[0][0] = 0;
System.out.println("Original array:");
printMatrix(source);
System.out.println("Cloned and modified array:");
printMatrix(target2);

// shallow copy of matrix (3)
System.out.println("\nShallow copy of matrix via manual copy (3):");
int[][] target3 = Matrices.cloneArrayOfInt3(source);
target3[0][0] = 0;
System.out.println("Original array:");
printMatrix(source);
System.out.println("Cloned and modified array:");
printMatrix(target3);

// shallow copy of matrix (4)
System.out.println("\nShallow copy of matrix via manual copy (4):");
int[][] target4 = Matrices.cloneArrayOfInt4(source);
target4[0][0] = 0;
System.out.println("Original array:");
printMatrix(source);
System.out.println("Cloned and modified array:");
printMatrix(target4);
}


	private static void printMatrix(int[][] matrix) {
		// TODO Auto-generated method stub
		{
	        for (int i = 0; i < matrix.length; i++) {
	            for (int j = 0; j < matrix[0].length; j++) {
	                System.out.print(matrix[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }
	}


	

	private static PointM cloneThroughSerializable(PointM point1) { //  метод для глубокой копии  через сериализацию
		// TODO Auto-generated method stub
		try {
			ByteArrayOutputStream byteOut= new ByteArrayOutputStream();
			ObjectOutputStream oos= new ObjectOutputStream(byteOut);
			oos.writeObject(point1);
			
			ByteArrayInputStream bais=new ByteArrayInputStream(byteOut.toByteArray());
			ObjectInputStream ois= new ObjectInputStream(bais);
			
			return (PointM) ois.readObject();
		}
		catch(IOException|ClassNotFoundException ex) {
			System.err.println("Error io exeption");
		}
		return point1;
	}

    @SuppressWarnings("unchecked")
	private static PointM cloneThroughJson(PointM point1) {//метод для глубокого клонирования через библиотеку Gson
		// TODO Auto-generated method stub
		Gson gson = new Gson();
		String json= gson.toJson(point1);
		
		return (PointM) gson.fromJson(json, point1.getClass());
	}

}
