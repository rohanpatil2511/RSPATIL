package compileTimePolymorphism;

public class cp {

	public static void main(String[] args) 
	{
		
		cp c=new cp();
		c.fish();
		c.fish("Rahul", 500);
		

	}
	
	public void fish()
	
	{
		System.out.println("dolphin ");
	}
	
	public void fish(String name,int s)
	{
		
    String name1="Rohan";
    String name2="Sachin";
    int s1=100;
    int sum=s1+10;
    
    System.out.println("sum is "+sum);
    
    System.out.println("name is "+name1);
    
    
  
    
    
	}

}
