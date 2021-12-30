package com.marlabs.training;
class Table1
{
	synchronized static void printTable(int n)
	{
		for(int i=1;i<=10;i++)
			System.out.println(i*n);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
					e.printStackTrace();
		}
			}
}
class Thread1 extends Thread
{
	public void run()
	{
		Table1.printTable(10);
	}
}

class Thread2 extends Thread
{
	public void run()
	{
		Table1.printTable(100);
	}
}
class Thread3 extends Thread
{
	public void run()
	{
		Table1.printTable(200);
	}
}
public class StaticSysDemo 
{
public static void main(String[] args) {
	Thread1 t1=new Thread1();
	Thread2 t2=new Thread2();
	Thread3 t3=new Thread3();
	t1.start();t2.start();t3.start();
	}
}
