package IVSHomeWork.Math;

import java.util.Scanner;

import IVSHomeWork.QlNhaTro_Chap13.eStatusRoom;

public class general {
	String name;
	public general(String name) {
		//TODO Auto-generated constructor stub
		this.name = name;
	}
	public general(String name, String name1)
	{
		this.name=  name;
	}
	public void line(String name )
	{
		System.out.println("--------------------"+name+"-----------------------");
	}
	public void Line(String name,String name1 ) {
		System.out.println("----------------------"+name+name1+"---------------------");
	}
	@SuppressWarnings("resource")
	public int inputInt(String nameInput)
	{
		Scanner input = new Scanner( System.in );
		System.out.println(nameInput);
		int a = input.nextInt();
		return a;
	}
	@SuppressWarnings("resource")
	public String inputString(String nameInput)
	{
		Scanner input = new Scanner( System.in );
		System.out.println(nameInput);
		String a = input.nextLine();
		return a;
	}
}
