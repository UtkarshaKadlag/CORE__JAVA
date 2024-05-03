
//REVERSE ORDER OF SET ELEMENT IN A TREE SET//
package testing_HashSets;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TestCase4 {

	public static void main(String[] args) 
	{
		String[] strings= {"One","Two","Three","Four","Five","Six","One","Six"};//Array of String//
		Set<String>stringSet=new TreeSet<>(new Comparator<String>() //Creating an empty Set of type TreeSet and writing an anonymous class//
		{	//As TreeSet is a sub i/f of comparator we can use compare method to sort the elements in descending order// 
				@Override
				public int compare(String s1, String s2)
				{
					return s2.compareTo(s1);
				}
				}
				);
		for(String s: strings)
			System.out.println("Added : "+stringSet.add(s));//Adding the sorted string in TreeSet//
		
		System.out.println("Set via for-each");
		for(String s: stringSet)
		System.out.println(s);	//printing the TreeSet//
		
				

	}

}
