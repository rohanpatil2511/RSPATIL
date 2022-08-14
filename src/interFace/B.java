package interFace;

public interface B 

{

	void salaryInfo();
	void fdInfo();
	void accountInfo();
	

   default void money()
   {
	   
	   System.out.println(" B S method");
   }
   
   static void test()
   {
	System.out.println(" welcome to class B");   
   
   }
   }
	
	