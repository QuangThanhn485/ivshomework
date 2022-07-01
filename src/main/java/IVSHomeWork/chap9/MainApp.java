package IVSHomeWork.chap9;

import java.util.List;

public class MainApp {

	static KhachHang khachHang =  new KhachHang(0, 0, null, null, null);
	public  static void main(String[] args) {
		create();
		for(KhachHang item:khachHang.khachHangs)
		{
			if(item.id == 0)
			{
			item.doanhSo += 100;
			continue;
			}
			else if(item.id == 1)
				item.doanhSo += 200;
		}
		khachHang.info();
	}
	public static void create()
	{
		khachHang.khachHangs.add(new KhachHang(0, 0, "K00", "Huynh Van Chau", "KhanhHoa"));
		khachHang.khachHangs.add(new KhachHang(1, 0, "K01", "Le Thi My ly", "Daklak"));
	}
}
