package heraki;

public class father {

	public static void main(String[] args) 
	
	
	{
	father f=new father();
	f.shirt();
	f.impression();
	
	father.age();

		System.out.println("===================");
		
    son s=new son();
    s.laptop();
    s.shirt();
    s.impression();
    
    son.calling();
    
    
    System.out.println("===========================");
		
    
    daughter d=new daughter();
    d.dress();
    d.impression();
    d.shirt();
    
    daughter.smile();
    
		
	}
	public static void age() 
	 {
		 System.out.println("fathers age ");
	 }
	 
	 public void impression()
	 {
		 System.out.println("fathers impression");
	 }
	 
	 public void shirt()
	 {
		 System.out.println("fathers shirt");
	 }

}
