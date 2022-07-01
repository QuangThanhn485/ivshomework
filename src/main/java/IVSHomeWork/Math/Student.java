package IVSHomeWork.Math;
import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fullname , address;
		int yob;
		general printGeneral = new general("");
		Scanner input = new Scanner( System.in );
		printGeneral.line("input");
		System.out.println("fullname is  : ");
		fullname = input.next();
		System.out.println("address is  : ");
		address = input.next();
		System.out.println("yob is  : ");
		yob = input.nextInt();
		printGeneral.line("print");
		System.out.println("fullname : "+fullname);
		System.out.println("adrress : "+address);
		System.out.println("yob : "+yob);
	}
}
