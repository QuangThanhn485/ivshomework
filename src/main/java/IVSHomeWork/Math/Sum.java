package IVSHomeWork.Math;
import java.util.Scanner;


public class Sum {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		int a ,b;
		@SuppressWarnings("resource")
		Scanner input = new Scanner( System.in );
		System.out.println("input a : ");
		a = input.nextInt();
		System.out.println("input b : ");
		b= input.nextInt();
		System.out.println("sum a and b is : "+(a+b));
		System.out.println("except a and b is : "+(a-b));
		System.out.println("multiply a and b is : "+(a*b));
		System.out.println("divide a and b is : "+(a/b));
	}

}
