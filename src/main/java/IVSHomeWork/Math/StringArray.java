package IVSHomeWork.Math;

import java.lang.reflect.Array;
import java.util.Scanner;

public class StringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrayNum = new int[5];
		//setArray(arrayNum);
		getArray(setArray(arrayNum), 3);
	}
	@SuppressWarnings("resource")
	public static int[] setArray(int[] array)
	{		
		Scanner input = new Scanner( System.in );
		for(int i = 0 ; i< array.length ; i++)
		{
			System.out.println("input "+i+": ");
			array[i] = input.nextInt();
		}
		return array;
	}
	public static void getArray(int[] Array , int i)
	{
		general printGeneral = new general("print");
		printGeneral.line("print");
		for(int array : Array)
		{
			System.out.println(array);
		}
		printGeneral.Line("element : ",String.valueOf(i));
		System.out.println("element "+i+" : "+Array[i]);
	}
}
