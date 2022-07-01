package IVSHomeWork.Coffee;

import java.util.ArrayList;
import java.util.List;

public class Menu {
	public int stt = 0;
	public String coffeeName;
	public double price;
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
