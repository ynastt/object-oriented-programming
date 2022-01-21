package com.company;
import java.util.Arrays;

public class Test {
	public static void main(String[] args){
		Matrix k = new Matrix(2, 3);
		k.fill();
		double[][]output = k.transpose();
		System.out.println("Transported matrix:" + Arrays.deepToString(output));
	}
}
