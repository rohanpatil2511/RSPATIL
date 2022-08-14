package runTimePolymorphism;

public class overriding extends A{

	public static void main(String[] args) 
	
	{
		
		// RUN TIME POLYMORPHISM.
		
		overriding or=new overriding();
		or.velocity();
		or.velocity1();
		
		A a=new A();
		a.velocity();
		a.velocity1();
	
	}
	
	public void velocity()
	{
		
		System.out.println("VELOCITY TRAINING CENTRE ");
	}
	
	public void velocity1()
	{
		
		System.out.println("MUMBAI");
	}

}
