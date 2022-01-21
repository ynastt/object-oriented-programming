package com.company;
import java.util.Arrays;

public class Matrix {
	int n;
	int m;
	double[][] mat;
	double[][] matT;
	
	//constructor
	public Matrix(int n, int m){
		this.n = n;
		this.m = m;
		mat = new double[n][m];
	}

	//fill in matrix with random numbers
	public void fill() {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				mat[i][j] = (int)(Math.random()*5);
			}
		}
		System.out.println("First matrix:" + Arrays.deepToString(mat));
		System.out.println();
	}
	
	//transpose matrix
	public double[][] transpose() {
		matT = new double[m][n];
		for (int j = 0; j < m; j++) {
			for (int i = 0; i < n; i++) {
				if (i != j) {
					matT[j][i] = mat[i][j];
				} else {
					matT[j][i] = mat[j][i];
				}
			}
		}
		return matT;
	}
}