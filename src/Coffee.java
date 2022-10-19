import java.util.Scanner;

public class Coffee {
	Scanner sc = new Scanner(System.in);
	String ans = sc.nextLine();
	Boolean Empty = ans.equals("yes");

	void Refill() {
		System.out.println("Refilling coffee!");
	}

	void Drink() {
		System.out.println("Drinking coffee!");
	}
}

class Coffee_Main {
	public static void main(String[] args) {
		System.out.println("Is my coffee mug empty? (yes / no)");

		Coffee coffee = new Coffee();

		if (coffee.Empty) {
			coffee.Refill();
		} else {
			coffee.Drink();
		}
	}
}
