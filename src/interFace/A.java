package interFace;

public interface A 

{

	
	void salary();
	void fd();
	void account();

	
	 default void money()
	{
		
		System.out.println(" A's Method ");	
	}
	
	  static void test()
	  {
		System.out.println(" A s best method");  
	  }


}