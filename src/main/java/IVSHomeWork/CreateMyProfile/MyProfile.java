package IVSHomeWork.CreateMyProfile;

public class MyProfile {
	final static String name ="Nguyễn Quang Thanh";
	final static String DayOfBir ="12/04/2000";
	static String address = "krongPak_Daklak";
	static int phoneNumber = 373045581;
	
	public static void main(String[] args)
	{
		MyProfilee();
	}
	public static void MyProfilee()
	{
		System.out.println("name : "+name);
		System.out.println("birthday : "+DayOfBir);
		System.out.println("address : "+address);
		System.out.println("phoneNumber : "+phoneNumber);
	}
}
