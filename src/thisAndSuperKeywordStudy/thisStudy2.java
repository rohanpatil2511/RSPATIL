package thisAndSuperKeywordStudy;

public class thisStudy2 {
	
 
	int s=1111;
	int r=2;
	

	public static void main(String[] args) 
	
	{
	thisStudy2 t=new thisStudy2();
	
	t.mul();  

	}

	public void mul()
	
	{
		int s=100;
		int sum=s+500;
		
		System.out.println("The local value of s is "+s);
		
		
		int sum1=this.s+1;
		
		System.out.println("The global value of s is "+this.s);
		

	}
	
	
	
}
