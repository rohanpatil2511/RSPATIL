package interFace;

public class IC implements A,B {

	public static void main(String[] args) 
	
	{
		IC c=new IC();
		
		c.account();
		c.accountInfo();
		c.fd();
		c.fdInfo();
		c.salary();
		c.salaryInfo();
		
		System.out.println("==============");
		
		c.money();   // CALLINF DEFAULT METHOD FROM CLASS A & B.
		A.test();    // CALLING STATIC TEST METHOD FROM A CLASS.
		B.test();     // CALLING TEST METHOD FROM B CLASS.
		
	}

	@Override
	public void salaryInfo() 
	{
		System.out.println("SALARY  INFO");
		
	}

	@Override
	public void fdInfo() 
	{
		System.out.println("FD INFO");
		
	}

	@Override
	public void accountInfo() 
	{
		System.out.println("ACCPUNT INFO");
		
	}

	@Override
	public void salary() {
		System.out.println("SALARY ");
		
	}

	@Override
	public void fd() {
		System.out.println("FD");
		
	}

	@Override
	public void account() {
		System.out.println("ACCOUNT");
		
	}
		

	@Override
	public void money() 
	{
	
		A.super.money();
		B.super.money();
	}

}
