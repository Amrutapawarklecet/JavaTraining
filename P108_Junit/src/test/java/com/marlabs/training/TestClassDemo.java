package com.marlabs.training;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

class TestClassDemo {

	public static void main(String[] args) {
		Result res=JUnitCore.runClasses(MaxNumberTest.class,Test1.class);
		for(Failure fail:res.getFailures()) {
			System.out.println("The class is failure:"+fail.toString());
		}
		System.out.println("The class is Successful:"+res.wasSuccessful());
	}
}
