package SingleLevelinheritance;

public class son extends mother {

	public static void main(String[] args) 
	
	{
		son m=new son();
		
		m.bike();
        m.cycle();
        m.nature();
        m.face();
        
        
        System.out.println("================================");
        son.nest();
        mother.glory();

		
		
		
	}

	
	public void cycle()
	{
		System.out.println("black in colour");
	}
	
	public void bike()
	{
		System.out.println("bike is BMW");
	}
	
	public static void nest()
	{
		System.out.println("nest is small");
	}
}
