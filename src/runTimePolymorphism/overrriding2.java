package runTimePolymorphism;

public class overrriding2 extends B {

	public static void main(String[] args) 
	
	{
		
		overrriding2 rr=new overrriding2();
		rr.calculator();
		
		B b=new B();
		b.calculator();
				
		

	}
public void calculator()
{
	System.out.println("hello");
	}
}
