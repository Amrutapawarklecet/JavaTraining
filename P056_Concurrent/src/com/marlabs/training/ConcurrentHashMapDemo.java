/*concurrent :- why this package is created.
all the threads run concurrently at the same time.This will speed up the exceution and performance is better.
Multiple threads are running means there will be deadlock.so we generally use syncronized so that one thread will exceute and after the completion of that thread the other thread will execute.

syncronized(ATM) is one of the solution of deadlock.

Concurrent package takes care of Deadlock.It will allow one after the other thread to excute.
It helps multi-tasking,efficent excution and faster excution .
we have ConcurrentHashMap,ConcurrentHashTable also.
------------------------------------------------------------------------------------------------------
ConcurrentHashMap:-
It is similar to HashMap but it is threadsafe and concurrent and we have some more methods.we have to import java.util.concurrent
------------------------------------------------------------------------------------------------------

HashTable :-It is synchronized we don't have ConcurrentHashTable.No deadLock
HashMap :-It is not  synchronized we have ConcurrentHashMap.Threat of deadLock.
ConcurrentLinkedQueue 

*/
package com.marlabs.training;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo {
	public static void main(String[] args) {
		ConcurrentHashMap<String, Integer> chm = new ConcurrentHashMap<String, Integer>();
		chm.put("sandip", 100);
		chm.put("sunil", 40);
		chm.put("sandy", 60);
		chm.put("sumeet", 50);
		chm.put("shubham", 70);
		System.out.println(chm);

		System.out.println(chm.containsValue(100));
		System.out.println(chm.computeIfAbsent("Madhu", k -> 30 + 40));// adds the record to the map
		System.out.println(chm.computeIfAbsent("Mohan", k -> 60 + 40));
		System.out.println(chm.mappingCount());
		System.out.println(chm);
	}
}
