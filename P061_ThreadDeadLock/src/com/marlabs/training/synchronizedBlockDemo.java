package com.marlabs.training;
class Table
{
	void printTable(int n)
	{
		synchronized(this)
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println(i*n);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
				e.printStackTrace();
				}
			}
		}
	}
}
class Thread1 extends Thread
{
	Table t;
	Thread1(Table t)
	{
		this.t=t;
			}
	public void run()
	{
		t.printTable(5);
	}
}

class Thread2 extends Thread
{
	Table t;
	Thread2(Table t)
	{
		this.t=t;
			}
	public void run()
	{
		t.printTable(50);
	}
}

public class synchronizedBlockDemo 
{
public static void main(String[] args)
{
Table obj=new Table();
Thread1 t1=new Thread1(obj);
Thread2 t2=new Thread2(obj);
t1.start();t2.start();
}
}
