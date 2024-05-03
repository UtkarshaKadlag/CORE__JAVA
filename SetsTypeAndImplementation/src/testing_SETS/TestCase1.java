//HASHSETS ARE UNORDERED AND UNSORTED//


package testing_HashSets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestCase1
{

	public static void main(String[] args) 
	{
		
		String[] strings={"One","Two","Three","Four","Five","Six","One","Five"};
		Set<String>stringSet=new HashSet<>();//Creates an Empty set
		
		for(String s: strings)
			System.out.println("Added : "+stringSet.add(s));//adds elements to stringSet(HashSet)//
			System.out.println("size : "+stringSet.size());//prints size of HashSet : 6
			System.out.println("set : "+stringSet);//HashSet are printed as they are unordered and unsorted//
			System.out.println("set via for each");
			for(String s: stringSet) //for each loop on String array//
				System.out.println(s);//prints the HashSet
			/*TO REMOVE ELEMENTS FROM HashSet,
			 as Sets come under iterable we can use iterator and loops in HashSets for it's operations*/
			Iterator<String>stringItr=stringSet.iterator();
			while(stringItr.hasNext())
			{
				String s=stringItr.next();
			}
			System.out.println("Set After Removal : "+stringSet);
	}
}
