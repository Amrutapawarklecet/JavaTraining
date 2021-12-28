package com.marlabs.training;

//jdk1.8 feature.
import java.util.function.BiFunction;

public class BiFunctionTest {
	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer> fun = (x1, x2) -> x1 + x2;
		Integer result = fun.apply(12, 10);
		System.out.println(result);

		BiFunction<Integer, Integer, Double> fun1 = (x1, x2) -> Math.pow(x1, x2);
		Double result1 = fun1.apply(2, 10);
		System.out.println(result1);

	}
}