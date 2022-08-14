package thisAndSuperKeywordStudy;

public class superUse2 extends super2{
	
	int a=1;

	public static void main(String[] args) 
	
	{
		superUse2 t= new superUse2();
		t.memory();

	}

	public void memory()
	
	{
		
		int a=10;
		int sub=a+100;
		
		int sub1=this.a+200;
		int sub2=super.s+300;
		
		System.out.println("The local value of a is "+sub);
		
		System.out.println("The global value of a is "+sub1);
		
		System.out.println("The global value of s in different super class is "+sub2);
	}
}
