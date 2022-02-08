package varChapter4;

import java.io.File;

public class VarInformation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// вот так делать нельзя // так как не поянтно вызываемый тип обьекта
		var bin=fetchContent();
		
		// лучше так 
		File bin2=fetchContent();
	}

	private static File fetchContent() {
		// TODO Auto-generated method stub
		return new File(".....");
	}

}
