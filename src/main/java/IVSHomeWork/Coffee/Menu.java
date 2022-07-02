package IVSHomeWork.Coffee;

import java.util.ArrayList;
import java.util.List;

public class Menu {
	public int stt = 0;
	public String coffeeName;
	public double price;

	public int getStt() {
		return this.stt;
	}

	public void setStt(int stt) {
		this.stt = stt;
	}

	public String getCoffeeName() {
		return this.coffeeName;
	}

	public void setCoffeeName(String coffeeName) {
		this.coffeeName = coffeeName;
	}

	public double getPrice() {
		return this.price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public List<Menu> getMenus() {
		return this.menus;
	}

	public void setMenus(List<Menu> menus) {
		this.menus = menus;
	}

	public Menu(int stt,String coffeeName , double price)
	{
		this.stt = stt;
		this.coffeeName = coffeeName;
		this.price = price;
	}
	List<Menu> menus = new ArrayList<Menu>();
	public List<Menu> createMenu(String coffeeName , double price)
	{
		stt++;
		menus.add(new Menu(stt,coffeeName, price));
		return menus;
	}
	
	public void showMenu()
	{
		for(Menu menu: menus)
		{
			System.out.println(menu.stt+" -- "+menu.coffeeName+" -- "+menu.price);
		}
	}
}
