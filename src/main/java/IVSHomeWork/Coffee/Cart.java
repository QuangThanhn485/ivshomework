package IVSHomeWork.Coffee;

import IVSHomeWork.Math.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.stream.Collectors;

import javax.swing.MenuSelectionManager;

public class Cart extends Menu {
	int count = 0;
	int stt = 0;

	public Cart(int count, int stt, String coffeeName, double price) {
		// TODO Auto-generated constructor stub
		super(stt, coffeeName, price);
		this.count = count;
	}

	List<Cart> Carts = new ArrayList<Cart>();


	public List<Cart> createCart( int searchStt) {
		Carts.add(new Cart(1, stt, (menus.get(searchStt).coffeeName), (menus.get(searchStt).price)));
		return Carts;
	}

	public void showCart() {
		general general = new general(null);
		general.line("Cart");
		for (Cart Cart : Carts) {
			if (Cart == null)
				System.out.print("Cart empty");
			System.out.println(Cart.coffeeName +"  "+Cart.price);
		}
	}
	public void bill()
	{
		general general = new general(null);
		general.line("Buill");
		System.out.println("tổng hóa đơn của bạn hết : "+total());
		
	}
	public double total()
	{
		double total = 0;
		for (Cart Cart : Carts) {
			if (Cart == null)
				System.out.print("Cart empty");
			total += Cart.price;
		}
		return total;
	}
}
