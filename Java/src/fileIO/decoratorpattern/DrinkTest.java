package fileIO.decoratorpattern;

public class DrinkTest {

	public static void main(String[] args) {
		Drink drink = new Whiskey();
		printreceipt(drink);

		Drink d2 = new Honey(new Whiskey());
		printreceipt(d2);

		Drink d3 = new Spices(new Vodka());
		printreceipt(d3);

		Drink d4 = new Spices(new Honey(new Vodka()));
		printreceipt(d4);
	}

	private static void printreceipt(Drink drink) {
		System.out.println(drink.getName()+" - $"+drink.getPrice());
	}

}
