package IVSHomeWork.If_Else;

import java.util.Scanner;

public class MaxNumber {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner( System.in );
		System.out.println("input a : ");
		float num1 = input.nextFloat();
		System.out.println("input b : ");
		float num2 = input.nextFloat();
	}
	public static void compare(float num1 , float num2)
	{
		String compare = num1 > num2 ?" : num 1 > num 2":num1 == num2 ?" : num 1  = num 2":" : num 1 < num 2";
		System.out.println(num1+" & "+num2+compare );
	}
}
