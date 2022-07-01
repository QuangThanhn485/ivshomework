package IVSHomeWork.If_Else;

import IVSHomeWork.Math.general;

public class PTB1 {
	
	public static void main(String[] args)
	{
		System.out.println("x = "+ptb1());
	}
	public static double ptb1()
	{
		general general = new general(null);
		general.line("ax + b = 0");
		int a= general.inputInt("input a : ");
		int b= general.inputInt("input b : ");
		
		double x= (-b)/a;
		return x;
	}
}
