package compileTimePolymorphism;

public class methdoOverloading {

	public static void main(String[] args) 
	
	{
	
		methdoOverloading m=new methdoOverloading();
		m.add(1, 2);
		m.add(50);

	}

	
	public void add(int c,int f)
	{
		
		int p=100;
		int q=100;
		int sum=p+1000;
		
		System.out.println("The sum is "+sum);
	}
	
	public void add(int a)
	
	{
		
		int s=150;
		int sub=s-100;
		
		System.out.println("the sub is "+sub);
	}
}
