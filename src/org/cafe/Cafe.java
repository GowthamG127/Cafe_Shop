package org.cafe;
import java.util.Scanner;
public class Cafe extends CafeMenu {
public void menu() {
	System.out.println("Menu");
	System.out.println("1. Tea"+"\n"+"2. Coffee"+"\n"+"3. Snaks"+"\n"+"4. Exit");
	System.out.println("Enter Your Order ");
}

public static void main(String[] args) {
	Cafe c = new Cafe();
	c.menu();
	Scanner scan = new Scanner(System.in);
	int order = scan.nextInt();
	System.out.println("------------------------------------------------");
	switch(order) {
	case 1: 
		c.teaVarieties();
		break;
	case 2:
		c.coffeeVarieties();
		break;
	case 3:
		c.snaksVarieties();
		break;
	case 4:
		System.exit(0);
	}
	scan.close();
}
}

