package designpattern.adapter;

public class ChocolateIcecream extends ChocolateDrinks implements IceCream {
	private ChocolateDrinks choDrinks = null;

	@Override
	public String lick() {
		// TODO Auto-generated method stub

		choDrinks = new ChocolateDrinks();
		String chocolateIcecream = choDrinks.drinks();
		
		return " chocolateIcecream";
		
	}

}