package IVSHomeWork.QlNhaTro_Chap13;

import IVSHomeWork.Math.*;
import java.util.ArrayList;
import java.util.List;

public class Accommodation {
	public String roomName;
	public eStatusRoom statusRoom;
	public double area;
	public double priceRoom;
	
	general general = new general(null);
	
	public String getRoomName() {
		return roomName;
	}
	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}
	public eStatusRoom getStatusRoom() {
		return statusRoom;
	}
	public void setStatusRoom(eStatusRoom statusRoom) {
		this.statusRoom = statusRoom;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public double getPriceRoom() {
		return priceRoom;
	}
	public void setPriceRoom(double priceRoom) {
		this.priceRoom = priceRoom;
	}
	public general getGeneral() {
		return general;
	}
	public void setGeneral(general general) {
		this.general = general;
	}
	public List<Accommodation> getAccommodations() {
		return accommodations;
	}
	public void setAccommodations(List<Accommodation> accommodations) {
		this.accommodations = accommodations;
	}
	public Accommodation(String roomName , eStatusRoom statusRoom , double area , double priceRoom) {
		//TODO Auto-generated constructor stub
		this.roomName = roomName;
		this.statusRoom = statusRoom;
		this.area =area;
		this.priceRoom = priceRoom;
	}
	List<Accommodation> accommodations = new ArrayList<Accommodation>();
	public void createRoom(String roomName , eStatusRoom statusRoom , double area , double priceRoom)
	{
		accommodations.add(new Accommodation(roomName, statusRoom, area, priceRoom));
	}
	public void print()
	{
		general.line("Accommodation List");
		for(Accommodation item:accommodations)
		{
			general.line(item.roomName);
			System.out.println("tên phòng : "+item.roomName);
			System.out.println("trạng thái : "+item.statusRoom);
			System.out.println("diện tích : "+item.area+" m2");
			System.out.println("chi phí : "+item.priceRoom+" $");
		}
	}
	public void update( String roomName , eStatusRoom statusRoom , double area , double priceRoom)
	{
		for(Accommodation item:accommodations)
		{
			if(item.roomName.equals(roomName))
			{
				item.setRoomName(roomName);
				item.setStatusRoom(statusRoom);
				item.setPriceRoom(priceRoom);
				item.setArea(area);
			}
		}
	}
	@SuppressWarnings("unlikely-arg-type")
	public void delete(String roomName)
	{
		for (Accommodation item:accommodations)
		{
			if(item.getRoomName().equals(roomName))
			{
				accommodations.remove(item);
				break;
			}
		}
	}
	@SuppressWarnings("unlikely-arg-type")
	public void emptyRoom()
	{
		for(Accommodation item:accommodations)
		{
			if(item.getStatusRoom().equals(eStatusRoom.con_trong))
			{
					general.line(item.roomName);
					System.out.println("tên phòng : "+item.roomName);
					System.out.println("trạng thái : "+item.statusRoom);
					System.out.println("diện tích : "+item.area+" m2");
					System.out.println("chi phí : "+item.priceRoom+" $");
			}
		}
	}
}
