package employee_HashCode_sameOnly;

public class Employee 
{
	private int id;
	private String name;
	private double salary;
	
	public Employee(int id, String name, double salary)
	{
		super();
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	
	
	
	public int getId() 
	{
		return id;
	}



	public void setId(int id) 
	{
		this.id = id;
	}



	public String getName() 
	{
		return name;
	}



	public void setName(String name) 
	{
		this.name = name;
	}



	public double getSalary() 
	{
		return salary;
	}



	public void setSalary(double salary) 
	{
		this.salary = salary;
	}

	@Override
	public String toString()
	{
		return "Employee_id : "+this.id+
				" Name : "+this.name+
				" Salary : "+this.salary;
	}

	@Override
	public boolean equals(Object o)
	{
		if(o instanceof Employee)
		{
			return this.id==((Employee)o).id;
		}
		return false;
	}
	
	@Override
	public int hashCode()
	{
		System.out.println("In HashCode method");
		//return 100;
		
		return id;
	}

}
