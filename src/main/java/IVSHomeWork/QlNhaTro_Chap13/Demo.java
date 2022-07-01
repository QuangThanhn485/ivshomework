package IVSHomeWork.QlNhaTro_Chap13;


import IVSHomeWork.Math.*;

public class Demo {
	static general general =new general(null);
	static Accommodation accommodation = new Accommodation(null, null, 0, 0);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		create();
		guide();
		general.line(null);
		int option = general.inputInt("nhập sự lựa chọn chức năng : ");
		switch (option) {
			case 1: {
				general.line("tạo phòng mới");
				String roomName = general.inputString("nhập tên phòng cần thêm : ");
				String indexStatus = general.inputString("nhập trang thái 'con_trong' hoặc 'dang_thue' : ");
				eStatusRoom statusRoom = eStatusRoom.valueOf(indexStatus);
				Double area = (double) general.inputInt("nhập diện tích phòng m2 : ");
				Double priceRoom = (double) general.inputInt("nhập chi phí cho phòng : ");
				accommodation.createRoom(roomName, statusRoom, area, priceRoom);
				accommodation.print();
				break;
			}
			case 2: {
				general.line("chỉnh sửa thông tin phòng");
				accommodation.print();
				String find = general.inputString("nhập tên phòng cần sửa : ");
				//String editName = general.inputString("nhập tên mới : ");
				String indexStatus = general.inputString("nhập trang thái 'con_trong' hoặc 'dang_thue' : ");
				eStatusRoom editStatus = eStatusRoom.valueOf(indexStatus);
				Double area = (double) general.inputInt("nhập diện tích phòng m2 : ");
				Double priceRoom = (double) general.inputInt("nhập chi phí cho phòng : ");
				
				//int index = accommodation.accommodations.indexOf(new Accommodation(find,null, 0, 0));
				accommodation.update(find,editStatus, area, priceRoom);
				accommodation.print();
				break ;
			}
			case 3: {
				general.line("xóa phòng");
				String find = general.inputString("nhập tên phòng cần xóa : ");
				accommodation.delete(find);
				accommodation.print();
				break;
			}
			case 0: {
				general.line("bạn đã thoát");
				break;
			}
			case 4: {
				general.line("phòng còn trống");
				accommodation.emptyRoom();
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + option);
		}
	}
	public static void create()
	{
		accommodation.createRoom("A1.1", eStatusRoom.con_trong, 5, 34);
		accommodation.createRoom("A1.2", eStatusRoom.dang_thue, 7, 40);
		accommodation.createRoom("A1.3", eStatusRoom.dang_thue, 7, 40);
		accommodation.createRoom("A1.4", eStatusRoom.con_trong, 12, 60);
	}
	public static void guide()
	{
		System.out.println("để truy cập chứ năng thêm nhấn 1 ");
		System.out.println("để truy cập chứ năng sửa nhấn 2 ");
		System.out.println("để truy cập chứ năng xóa nhấn 3 ");
		System.out.println("để thoát khỏi chương trình nhấn 0 ");
		System.out.println("để tìm phòng trống nhấn 4 ");
		
	}
}
