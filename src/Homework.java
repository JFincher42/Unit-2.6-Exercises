//package lucas;

import java.util.Random;

import java.util.Scanner;



public class Homework
{
	
	public static void main (String[] args) {
		plusMinus();
		increasing();
		decreasing();
		plusMinus();
		decreasing();
		increasing();
		plusMinus();
}
	public static void plusMinus() {
		System.out.println("+---------+");
	}
	public static void increasing() {
		
		
		for(int row = 1; row <= 3; row++) {
			System.out.print("|");
			for(int count = 3; count  > (row-1); count--) {
				
				System.out.print(" ");
			}
			
			for(int i = 1; i <= row; i++) {
				System.out.print("/");
			}
			System.out.print("*");
			
			for(int i = 1; i <= (row); i++) {
				System.out.print("\\");
		}
			for(int count = 3; count  > (row-1); count--) {
				
				System.out.print(" ");
			}
			System.out.print("|");
			System.out.println();	
		}
	}
	public static void decreasing() {
		for(int row = 1; row <= 3; row++) {
			
			System.out.print("|");
			for(int i = 0; i < row; i++) {
				System.out.print(" ");
			}
			for(int i = 3; i >= row; i--) {
				System.out.print("\\");
			}
			System.out.print("*");
			for(int slash = 3; slash >= row; slash--) {
				System.out.print("/");
			}
			for(int i = 0; i < row; i++) {
				System.out.print(" ");
			}
			System.out.print("|");
			System.out.println();
		}
			
	}
	}
