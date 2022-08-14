package interfacestudy;

public interface A 

{
void name();

default void cash()
{
	System.out.println("cash in HAND");

}

static void hand()
{
	System.out.println("hand in cash");
}
}
