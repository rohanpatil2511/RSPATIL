package thisAndSuperKeywordStudy;

public class thisStudy {
	
	int a=10;  // GLOBAL VALUE OF A
	int b=12;

	public static void main(String[] args) 
	{
	thisStudy ts=new thisStudy();
	ts.sub();

		

	}
public void sub()

{
int a=20;   // LOCAL VALUE OF A.
int sub=a+1;

System.out.println("Local value of a is "+a);


int sub1=this.a+100;
  System.out.println("GLOBAL VALUE OF a is "+this.a);


}

	
	
}
