package javalab;

import java.util.Scanner;

public class matrix {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of rows of matrix A");
		int r1=sc.nextInt();
		System.out.println("enter no of columns of matrix A");
		int c1=sc.nextInt();
		System.out.println("enter no of rows of matrix B");
		int r2=sc.nextInt();
		System.out.println("enter no of columns of matrix B");
		int c2=sc.nextInt();
		if(c1!=r2)
		{
		System.out.println("multiplication not possible");
		}
		int A[][]=new int[r1][c1];
		int B[][]=new int[r2][c2];
		int C[][]=new int[r1][c2];
		System.out.println("enter elements of matrix A:");
		for(int i=0;i<r1;i++) {
			for(int j=0;j<c1;j++) {
				A[i][j]=sc.nextInt();
			}
		}
		System.out.println("enter elements of matrix B:");
		for(int i=0;i<r2;i++) {
			for(int j=0;j<c2;j++) {
				B[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<r1;i++) {
			for(int j=0;j<c2;j++) {
				C[i][j]=0;
		for(int k=0;k<c1;k++) {
			C[i][j]+=A[i][j]*B[i][j];
			}
		}
	}
	System.out.println("entered matrix of A is:");
	for(int i=0;i<r1;i++) {
		for(int j=0;j<c1;j++) {
			System.out.print(A[i][j]+"\t");
		}
		System.out.println();
	}
	
	System.out.println("entered elements of matrix B is:");
	for(int i=0;i<r2;i++) {
		for(int j=0;j<c2;j++) {
			System.out.print(B[i][j]+"\t");
		}
		System.out.println();
	}
	System.out.println("matrix C is");
	for(int i=0;i<r1;i++) {
		for(int j=0;j<c2;j++) {
			System.out.print(C[i][j]+"\t");
	}
			System.out.println();
	}

}
}
