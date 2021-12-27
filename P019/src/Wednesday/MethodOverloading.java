package Wednesday;

public class MethodOverloading 
{
int sum(int a,int b)
{
	return a+b;
}
int sum(int a,int b,int c)
{
	return a+b+c;
}
float sum(float a,float b)
{
	return a+b;
}
double sum(double a,double b)
{
	return a+b;
}
public static void main(String[] args) {
	MethodOverloading ob=new MethodOverloading();
	System.out.println("the sum is "+ob.sum(6, 7));
	System.out.println("the sum is "+ob.sum(6,7,8));
	System.out.println("the sum is "+ob.sum(6.5f, 7.3f));
	System.out.println("the sum is "+ob.sum(6.53, 7.32));
		}
}
