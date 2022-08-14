package thisAndSuperKeywordStudy;

public class thisStudy1 {
	
	
	int p=450;   // global 
	int q=500;
	

	public static void main(String[] args) 
	
	{
		
		thisStudy1 d=new thisStudy1();
		
		d.only();
		

	}

	public void only()
	
	{
		int p=100;     // local
		int sum=p+1;
		
		System.out.println("THE LOCAL VALUE OF P IS "+p);
		
		int sum1=this.p+10000;
		
		System.out.println("THE GLOBAL VALUE OF P IS "+this.p);
		
		System.out.println("q");
		
	}
	
	
}
