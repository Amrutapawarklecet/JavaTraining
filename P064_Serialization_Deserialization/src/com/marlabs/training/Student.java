/*The process of reading and writing object into a file is known as serialization and de-serialization.
	-----------------------------------------------------------------------
	ObjectInputStream/ObjectOutputStream ----serialization and de-serialization.
	-------------------------------------------------------------------------------
	Serializable -it is a marker interface.There will be no abstract method in it.
*/
package com.marlabs.training;

import java.io.Serializable;

public class Student implements Serializable {
	int rollno;
	String name, address;
}
