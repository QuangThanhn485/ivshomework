package IVSHomeWork.If_Else;

import IVSHomeWork.Math.general;

public class GPTB2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(double result:ptb2())
		{
			System.out.println(result);
		}
	}
	public static double[] ptb2() {
		general general = new general(null);
		general.line("ax^2+bx+c = 0");
		int a = general.inputInt("input a : ");
		int b = general.inputInt("input b : ");
		int c = general.inputInt("input c : ");
		double y = 0, z = 0;
		try {
			if(delta(a, b, c)<0) {System.out.println("vô nghiệm"); return null;}
			else if(delta(a, b, c) == 0 )
			{
				System.out.println("phương trình có 1 nghiệm kép");
				y = z = (-b)/2*a;
			}
			else {
				System.out.println("phương trình có 2 nghiệm phân biệt");
				y = ((-b)+Math.sqrt(delta(a, b, c)))/2*a;
				z = ((-b)-Math.sqrt(delta(a, b, c)))/2*a;
			}
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.print("error"+e);
		}
		double[] result = {y,z};
		return result;
	}
	public static double delta(int a , int b, int c)
	{
		double delta = b*b - 4*a*c;
		return delta;
	}
}
