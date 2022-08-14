package compileTimePolymorphism;

public class compile {

	public static void main(String[] args) 
	
	{
	compile cp=new compile();
	
	cp.salary();
	
	cp.salary(1000);
	
	cp.salary(10, 20);
		
	
	}

	
	public void salary()
	{
		System.out.println("Salary is credited in banks account");
	}
	
	public void salary(int x)
	
	{
		int a=10;
		int sum=a+1000;
		System.out.println("The sum is "+sum);
	}
	
	public void salary(int y,int z)
	{
		
		System.out.println("Accountinfo is displayed in sheet");
	}
}
