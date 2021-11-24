package firstChapter;

import java.util.stream.Stream;

public class TransformString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String result=Stream.of("Privet")
//.map(r->r.concat("Dima")) или по другому
.map(p->p+"Dima")
.findFirst()
.get();
System.out.println(result);
// 
String result2= Stream.of("Second version")
.map(p->p.toUpperCase())
.map(p->p.repeat(2))
.findFirst()
.get();

System.out.println(result2);
//Начиная c JDK 12, мы можем опираться на новый метод с именем transform (Function<? super string, ? extends r> f). Давайте перепишем предыдущие фрагменты кода с использованием метода transform о: 

String result3 = "text".transform(t->t.toUpperCase());
System.out.println(result3);
String result4 = "text".transform(t->t.toUpperCase())
.concat(result)
.repeat(3);
System.out.println(result4);
String result5 = "text".transform(t->t.toUpperCase())
.transform(t->t+result)
.transform(t->t.repeat(3));
System.out.println(result5);
	}

}
