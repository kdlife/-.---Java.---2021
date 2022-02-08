package varChapter4;

import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

public class var1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// is not important what this code does,
        // the focus is on naming variables in case of type inference

	}
	// это вариант 1  стнадартное обозначении типа переменной
	 public Object fetchTransferableDataWithoutVar(String data)
	            throws UnsupportedFlavorException, IOException {

	        StringSelection ss = new StringSelection(data);
	        DataFlavor[] df = ss.getTransferDataFlavors();
	        Object obj = ss.getTransferData(df[0]);

	        return obj;
	    }
// это вариант 2 тип переменной заменен на var
	    public Object fetchTransferableDataWithVar(String data)
	            throws UnsupportedFlavorException, IOException {

	        var stringSelection = new StringSelection(data);
	        var dataFlavorsArray = stringSelection.getTransferDataFlavors();
	        var obj = stringSelection.getTransferData(dataFlavorsArray[0]);

	        return obj;
	    }
}
