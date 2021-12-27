package Wednesday;
class Parent
{
void display()
{
	System.out.println("This is a parent class");
}
}
public class MethodOverriding extends Parent
{
	void display()
	{
		System.out.println("this is new display method");
	}
	public static void main(String[] args) 
	{
		MethodOverriding ob=new MethodOverriding();
		ob.display();
	}
}

