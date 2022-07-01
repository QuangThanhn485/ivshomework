package IVSHomeWork.SumElementChap7;


import java.util.ArrayList;
import java.util.List;

import IVSHomeWork.Math.*;
public class SumElement {

	static general general = new general(null);
	public static void main(String[] args) {
		while (true) {
			int num = general.inputInt("input limit number : ");
			if(num==0) break;
			System.out.println(" = "+Sum(num));
		}
	}
 public static int Sum(int num)
 {
	 int sum = 0;
	 List<Integer> size = new ArrayList<Integer>();
	 general.line("max sum");
	 for(int i = 0 ; sum < num ; i++)
	 {
		 if(num<=(sum+i)) break;
		 size.add(i);
		 if(i == 0)System.out.print(size.get(i));
		 else {
			 System.out.print(" + "+size.get(i));
		}
		 sum += i;
	 }
	 return sum;
 }
}
