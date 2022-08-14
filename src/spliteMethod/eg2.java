package spliteMethod;

public class eg2 {

	public static void main(String[] args) 
	{
		String rohan="Rohan//shashikant//patil//miraj";
		
		String[] patil = rohan.split("//");
		
		
		// Decremental order.
		
		for(int p=3;p>=0;p--)
		{
			System.out.println(patil[p]);
		}
	
		System.out.println("=================");
		
		// Incremental order.
		for (int p=0;p<=3;p++)
			
		{
			System.out.println(patil[p]);
		}

	}

}
