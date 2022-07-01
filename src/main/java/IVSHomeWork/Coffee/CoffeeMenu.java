package IVSHomeWork.Coffee;
import java.util.List;

import IVSHomeWork.Math.*;
public class CoffeeMenu {
	static Menu menu = new Menu(0, null, 0);
	static Cart cart = new Cart(0, 0, null, 0);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		general general = new general(null);
		create();
		for(Menu item:menu.menus)
		{
			cart.createMenu(item.coffeeName, item.price);
		}
		menu.showMenu();
		while (true) {
			int stt = general.inputInt("stt : ");
			if(stt == 0)
			{break;}
			cart.createCart(stt-1);
		}
		cart.showCart();
		cart.bill();
	}
	public static void create() {
		menu.createMenu("americano", 1.25);
		menu.createMenu("espresso", 2.05);
		menu.createMenu("ristretto", 3.10);
		menu.createMenu("mocha", 4.50);
		menu.createMenu("vienna", 6.27);
		menu.createMenu("glace", 7.80);
		menu.createMenu("cappuccino", 8.25);
		menu.createMenu("macchiato", 9.50);
		menu.createMenu("con panna", 0.95);
	}
}
