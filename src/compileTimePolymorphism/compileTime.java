package compileTimePolymorphism;

public class compileTime {

	public static void main(String[] args) 
	
	
	// COMPILE TIME POLYMORPHISM.
	{
	
		compileTime ct=new compileTime();
		
		ct.memory(1000, 500);
		ct.memory(21);
		ct.memory();
		ct.memory("Rohan", 11, 22, 33);
		
	}

	
	public void memory()
	{
		System.out.println("Money is in the bank");
	}
	
	public void memory(int a)
	{
		System.out.println("cash is in the bank account");
	}
	
	public void memory(int a,int b)
	{
		System.out.println("SBI ");
	}
	
	public void memory(String name,int s, int f,int e)
	{
		System.out.println("Salary is credited in sbi account");
	}
}
