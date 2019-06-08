package designpattern.adapter;

public class Client {

	public static void main(String[] args) {
		Drink chocoDrink=new ChocolateDrinks();
		System.out.println(chocoDrink.drinks());
		Drink vanilaDrinks=new VanilaDrinks();
		System.out.println(vanilaDrinks.drinks());
		ChocolateIcecream  chocoIcecream=new ChocolateIcecream();
		System.out.println(chocoIcecream.lick());
	}
}