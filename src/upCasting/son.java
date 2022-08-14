package upCasting;

public class son extends mother {

	public static void main(String[] args) 
	
	{
    son s=new son();
    s.account();
    s.account1();
    s.account2();
    s.FD();
    
    System.out.println("=====================");
    
  mother m=new mother();
  
  m.account();
  m.account1();
  m.account2();
 
    System.out.println("==============");
    
  
  // FOR DOING UPCASTING.
  
  mother m1=new son();
  m1.account();
  m1.account1();
  m1.account2();
  // m1.FD();  
		
		
	}
	
     public void account()
	
	{
		System.out.println(" ACCOUNT INFO MIRAJ");
	}
	
	public void account1()
	
	{
		System.out.println("ACCPOUNT INFO1 SANGLI");
	}
	
	public void account2()
	
	{
		System.out.println("ACCOUNT INFO2 KOLHAPUR");
	}
	
	public void FD()
	{
		System.out.println(" FD ");
	}
	
	

}
