package IVSHomeWork.Interface;

public  class RoomHotel implements IRoom {

	public double eletricityPrice , water;
	private int pricetDayHire , priceEletricity , priceWater;
	public RoomHotel(double eletricityPrice ,double water)
	{
		this.eletricityPrice = eletricityPrice;
		this.water = water;
	
	}
	public double getEletriccityPrice() {
		return eletricityPrice;
	}

	public void setEletriccityPrice(double eletriccityPrice) {
		this.eletricityPrice = eletriccityPrice;
	}

	public double getWater() {
		return water;
	}

	public void setWater(double water) {
		this.water = water;
	}

	@Override
	public double electricityBill(double amountEletricity) {
		// TODO Auto-generated method stub
		double sumEletricity = 0;
		sumEletricity = priceEletricity * amountEletricity;
		return sumEletricity;
	}

	public double waterBill(double amountWarter) {
		double sumWarter = 0;
		sumWarter = priceWater * amountWarter;
		return sumWarter;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double priceRent() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public double waterBill() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
