package IVSHomeWork.switch_caseChap_6;


import IVSHomeWork.Math.*;
public class CountingNumber {

	static general general = new general(null);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(translateNumber());
	}
	public static String translateNumber() {
		int num = general.inputInt("nhập sô  bất kỳ từ 1 đến 9");
		switch (num) {
			case 0: {
				
				return "zero";
			}
			case 1: {
				
				return "one";
			}
			case 2: {
				
				return "tow";
			}
			case 3: {
				
				return "three";
			}
			case 4: {
				
				return "four";
			}
			case 5: {
				
				return "five";
			}
			case 6: {
				
				return "six";
			}
			case 7: {
				
				return "seven";
			}
			case 8: {
				
				return "eight";
			}
			case 9: {
				
				return "nine";
			}
			
			default:
				return "not a number";
		}
	}

}
