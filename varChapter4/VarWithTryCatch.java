package varChapter4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class VarWithTryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  try (var writer = new PrintWriter(new File("welcome.txt"))) {
	            writer.println("Welcome message");
	        } catch (FileNotFoundException ex) {
	            Logger.getLogger(VarWithTryCatch.class.getName()).log(Level.SEVERE, null, ex);
	        }
	}

}
