package interfacestudy;

public class D implements B,A,C {

	public static void main(String[] args) 
	
	{
	   D d=new D();
	   d.call();
	   d.easy();
	   d.nature();
	   d.name();
	  
	   System.out.println("===========================");
	   
	   d.cash();   // Calling default method from 3 interfaces.
	   
	   A.hand();    //calling static method from class A
	   B.hand();    //calling static method from class A
	   C.hand();    //calling static method from class A
	   
	

	}

	@Override
	public void nature() 
	
	{
		System.out.println("welcome to first yera");
		
	}

	@Override
	public void name() 
	
	{
		System.out.println("WELCOME TO ENGINEERING");
	}

	@Override
	public void call() 
	{
		System.out.println("WELCOME TO ELECTRICLA BRANCH");
		
	}

	public void easy()
	{
		System.out.println("===============");
	}

	@Override
	public void cash() {
		
		A.super.cash();   // default method from A class.
		B.super.cash();   // default method from B class.
		C.super.cash();   // default method from C class.
		
	}
}
