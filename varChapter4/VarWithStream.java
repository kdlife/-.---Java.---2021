package varChapter4;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Stream;
import static java.util.stream.Collectors.toList;

public class VarWithStream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
Stream <Integer> test= Stream.of(1,2,3,4,5,6,7);
test.filter(t->t%2==0).forEach(System.out::println);

var testVar= Stream.of(1,2,3,4,5,6,7);
testVar.filter(t->t%2==0).forEach(System.out::println);

Stream <String> testStr=Files.lines(Path.of("Readme.txt"));
List<File> files=testStr.map(p-> new File(p)).collect(toList());
files.forEach(System.out::println);

var testStrVar=Files.lines(Path.of("Readme.txt"));
var filesVar=testStrVar.map(p-> new File(p)).collect(toList());
filesVar.forEach(System.out::println);
	}

}
