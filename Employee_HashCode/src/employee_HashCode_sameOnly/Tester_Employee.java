package employee_HashCode_sameOnly;

import java.util.HashSet;

public class Tester_Employee {

	public static void main(String[] args) 
	{
		Employee e1=new Employee(101,"Kiara",200000.20);
		Employee e2=new Employee(101,"Priyanka",250000);
		Employee e3=new Employee(102,"Aisha",500000);
		Employee e4=new Employee(103,"Aishwarya",200000);
	
		HashSet<Employee>employeeSet=new HashSet<>();
		
		
		System.out.println("Added : "+employeeSet.add(e1));
		System.out.println("Added : "+employeeSet.add(e2));
		System.out.println("Added : "+employeeSet.add(e3));
		System.out.println("Added : "+employeeSet.add(e4));
		System.out.println("size : "+employeeSet.size());
		
		for(Employee e : employeeSet)
			System.out.println(e);
		System.out.println(e1.equals(e2));
		System.out.println(e1.hashCode()+" "+e2.hashCode());
		
		
	}

}
