/*Thread pool:- It means where the Threads are strore in reserved and used when they are needed.
The threads can be reused again and again.
Example :- Indian Army .
The thread pool represent a group of worker threads that are waiting for the job and can be reused.
In the thread pool a fixed size threads are created.
newFixedThreadPool(10); //creates a pool of 10 Threads.
The thread from the thread pool is pulled out and assigned a job by the service provider.
After the job is completed it is contained in the thread pool again.It is not destroyed.
------------------------------------------------------------------------------------------------------------------
methods of Thread pool
-------------------------------------------
1)newFixedThreadPool(10); //creates a pool of 10 Threads.

2)newCachedThreadPool();//This method creates a new thread pool but use the previously created thread when ever they are available.

3)newSingleThreadExecutor();//This method creates a new thread.
4)ExecutorService :- It is used to create FixedThreadPool(5).
5)Executor :-It is used to execute the threads in the Thread Pool.
6)import java.util.concurrent :- This package is used for creating ThreadPool .
7)!exe.isTerminated()) //it is checking each and every thread that it is terminated after the task is done
*/
package com.marlabs.training;

public class ThreadPoolDemo implements Runnable {

	String msg;

	public ThreadPoolDemo(String msg) {
		super();
		this.msg = msg;
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + "Start Thread=" + msg);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + "End Thread");

	}

}
