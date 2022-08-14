package thisAndSuperKeywordStudy;

public class superUse extends super1 {
	
	int p=10;

	public static void main(String[] args) 
	
	{
	
		superUse s=new superUse();  // object creation of SuperUse
		s.main();

	

	}
    public void main()
    
    {
    	int p=100;
    	int sum=p+50;
    	
    	int sum1=this.p+500;
    	int sum2=super.a+2000;
    	
    	System.out.println("The local value of p is "+sum);
    	
    	System.out.println("The global value of p in the same class is "+sum1);
    	
    	System.out.println("The global value of a in the different class is "+sum2);
    	
    }
	
	
	
	
}
