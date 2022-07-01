package IVSHomeWork.If_Else;

import java.util.Scanner;

public class NumberCheck {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		input();
	}
	@SuppressWarnings("resource")
	public static void input()
	{
		Scanner input = new Scanner( System.in );
		System.out.println("input number : ");
		int num = input.nextInt();
		isPositve(num);
		isOdd(num);
	}
	public static void isPositve(int num)
	{
		if(num>0) System.out.println(num+" : is positive");
		else if(num<0) {
			System.out.println(num+" : is negative ");
		}
		else {
			System.out.println(num+" ; is zero number");
		}
	}
	public static void isOdd(int num)
	{
		String typeNum = num % 2 == 0?" : even number ":" : oll number ";
		System.out.println(num+typeNum);
	}
}
