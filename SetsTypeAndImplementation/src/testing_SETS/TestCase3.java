package testing_HashSets;

import java.util.Set;
import java.util.TreeSet;

public class TestCase3 {

	public static void main(String[] args) 
	{
		String[] strings= {"One","Two","Three","Four","Five","Six","Five","One"};
		Set<String>stringSet=new TreeSet<>();
		
		for(String s: strings)
			System.out.println("Added :"+stringSet.add(s));
		System.out.println("Size : "+stringSet.size());
		System.out.println("Set : "+stringSet);
		System.out.println("Set via for-each : ");
		for(String s: strings)
			System.out.println(s);
		
	}

}
