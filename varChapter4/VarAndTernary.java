package varChapter4;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public class VarAndTernary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
boolean check= true;

Collection listOrset=check?List.of(1,20,15):Set.of(30, 20, 1);
Object listOrSets=check?List.of(1,20,15):Set.of(30, 20, 1);
Serializable intOrString=check?1988:"2566";
Object intOrStr=check?1988:"2566";
var listOrSetVar=check?List.of(1,20,15):Set.of(30, 20, 1);
var intOrStrVar=check?1988:"2566";
System.out.println(listOrset);
System.out.println(listOrSets);
System.out.println(intOrString);
System.out.println(intOrStr);
System.out.println(listOrSetVar);
System.out.println(intOrStrVar);
	}

}
