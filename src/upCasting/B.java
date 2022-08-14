package upCasting;

public class B extends A {

	public static void main(String[] args) 
	
	{
	
		B b=new B();
		b.bank();
		b.bank1();
		b.bank2();
		
		System.out.println("============");
		
		A a=new A();
	   
		a.bank();
		a.bank1();
		a.bank2();
		
		// UPCASTING 
		
		A a5=new B();
		a5.bank();
		a5.bank1();
		a5.bank2();
		// a5.ATM();  // THIS PROPERTY IS FROM SUBCLASS ( i.e CLASS B) SO IT IS NOT ELIGIBLE FOR UPCASTING PROCESS
		
	}
	
	public void ATM()
	
	{
		System.out.println(" ATM IS EMPTY");
	}
	public void bank()
	{
		System.out.println("SBI BANK MIRAJ");
	}
	
	public void bank1()
	{
		System.out.println("YES BANK MIRAJ");
	}
	
	public void bank2()
	
	{
		
		System.out.println("BANK OF INDIA MIRAJ ");
	}
	
 
	

}
