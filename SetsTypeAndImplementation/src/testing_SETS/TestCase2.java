package testing_HashSets;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class TestCase2 {

	public static void main(String[] args) 
	{
		String[] strings= {"One","Two","Three","Four","Five","Six","One","Four"};
		Set<String>stringSet=new LinkedHashSet<>();//Creates an Empty set//
	
		for(String s: strings)
		System.out.println("Added :"+stringSet.add(s));
		System.out.println("size : "+stringSet.size());
		System.out.println("Set : "+stringSet);
		
		for(String s:stringSet)
			System.out.println(s);
		Iterator<String>stringItr=stringSet.iterator();
		while(stringItr.hasNext())
		{
			String s=stringItr.next();
			if(s.startsWith("f"))
				stringItr.remove();
		}
		System.out.println("Set after removal : "+stringSet);

	}

}
