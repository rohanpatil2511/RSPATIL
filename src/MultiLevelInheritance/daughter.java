package MultiLevelInheritance;

public class daughter extends mother{

	public static void main(String[] args) 
	
	{
		daughter dt=new daughter();   //calling NON STATIC METHODS FROM SAME CLASS & DIFF CLASS.
		dt.hair();
		dt.donation();
		dt.smile();
		
		System.out.println("========================");
		mother m=new mother();
		m.donation();
		m.hair();
		//m.smile();
		System.out.println("==============================");
		grandmother g=new grandmother();
		g.hair();
		
		// CALLING STATIC METHOD FROM SAME & DIFF CLASS.
		
	  System.out.println("=======================");
		grandmother.colour();
		mother.colour();
		mother.deposite();
		daughter.dance();
		daughter.colour();
		daughter.colour();

		
	}

	
	public void smile()
	{
		System.out.println("daughters smile");
	}
	
	public static void dance()
	{
		System.out.println("daughters dance is very good");
	}
}
