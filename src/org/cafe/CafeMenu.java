package org.cafe;
import java.util.Scanner;
public class CafeMenu {
	Scanner scan = new Scanner(System.in);
	int amt,coffee,snaks;
	int total =0;
	public void addMore() {
		System.out.println("To add further items "+"\n"+"1. Add Tea"+"\n"+"2. Add Coffee"+"\n"+"3. Add Snaks"+"\n"+"4.Bill");
		int addmore = scan.nextInt();
		System.out.println("--------------------------------------------------");
		switch(addmore) {
		case 1:
			teaVarieties();
			break;
		case 2:
			coffeeVarieties();
			break;
		case 3:
			snaksVarieties();
			break;
		case 4:
			System.out.println("Bill");
			System.out.println("=======================================");
			return;
		}
		}
	public void teaVarieties() {
	System.out.println("Tea");
	System.out.println("1. Black Tea"+"\n"+"2. Lemon Tea"+"\n"+"3. Strong"+"\n"+"4. Sugar Free"+"\n"+"5. Normal"+"\n"+"6. Tea Cancelled");
	System.out.println("Please Enter your preferred one : ");
	
	int variety = scan.nextInt();
	System.out.println("--------------------------------------------------");
	if(variety==1) {
		System.out.println("Enter how many Black Tea's needed : ");
		int tea=scan.nextInt();
		System.out.println(tea+" = "+"Black Tea has been ordered");
		System.out.println("--------------------------------------------------");
		addMore();
		amt = tea * 10;
		total += amt;
		System.out.println("Black Tea"+"	 "+"( "+tea+" )"+"		"+"Rs. "+amt);
	}
	else if (variety==2) {
		System.out.println("Enter how many Lemon Tea's needed : ");
		int tea=scan.nextInt();
		System.out.println(tea+" = "+"Lemon Tea has been ordered");
		System.out.println("--------------------------------------------------");
		addMore();
		amt = tea * 15;
		total += amt;
		System.out.println("Lemon Tea"+"  	 "+"( "+tea+" )"+"		"+"Rs. "+amt);
	}
	else if(variety==3) {
		System.out.println("Enter how many Strong tea's : ");
		int tea=scan.nextInt();
		System.out.println(tea+" = "+"Strong Tea has been ordered");
		System.out.println("--------------------------------------------------");
		addMore();
		amt = tea * 20;
		total += amt;
		System.out.println("Strong Tea"+"       "+"( "+tea+" )"+"		"+"Rs. "+amt);
	}
	else if(variety==4) {
		System.out.println("Enter how many Sugar Free Tea's needed : ");
		int tea=scan.nextInt();
		System.out.println(tea+" = "+"Sugar Free Tea has been ordered");
		System.out.println("--------------------------------------------------");
		addMore();
		amt = tea * 15;
		total += amt;
		System.out.println("Sugar Free Tea"+"	 "+"( "+tea+" )"+"		"+"Rs. "+amt);
	}
	else if(variety==5) {
		System.out.println("Enter how many Normal Tea's needed : ");
		int tea=scan.nextInt();
		System.out.println(tea+" = "+"Normal Tea has been ordered");
		System.out.println("--------------------------------------------------");
		addMore();
		amt = tea * 12;
		total += amt;
		System.out.println("Normal Tea"+"	 "+"( "+tea+" )"+"		"+"Rs. "+amt);
	}
	else if(variety==6) {
		System.out.println("Your order has been cancelled successfully");
	}
	
}
	
public void coffeeVarieties() {
	System.out.println("Coffee");
	System.out.println("1. Black Coffee"+"\n"+"2. Filter Coffee"+"\n"+"3. Instant Coffee"+"\n"+"4. Sugar Free Coffee"+"\n"+"5. Cold Coffee"+"\n"+"6. Cancel Coffee");
	System.out.println("Please Enter your preferred one : ");
	int variety = scan.nextInt();
	System.out.println("-------------------------------------------------");
	switch (variety) {
	case 1: 
		System.out.println("Enter how many Black Coffee's needed : ");
		coffee=scan.nextInt();
		System.out.println(coffee+" = "+"Black Coffee has been ordered");
		System.out.println("--------------------------------------------------");
		addMore();
		amt = coffee * 25;
		total += amt;
		System.out.println("Black Coffee"+"	 "+"( "+coffee+" )"+"		"+"Rs. "+amt);
		break;
	case 2:
		System.out.println("Enter how many Filter Coffee's needed : ");
		coffee=scan.nextInt();
		System.out.println(coffee+" = "+"Filter Coffee has been ordered");
		System.out.println("--------------------------------------------------");
		addMore();
		amt = coffee * 50;
		total += amt;
		System.out.println("Filter Coffee"+"	 "+"( "+coffee+" )"+"		"+"Rs. "+amt);
		break;
	case 3:
		System.out.println("Enter how many Instant Coffee's needed : ");
		coffee=scan.nextInt();
		System.out.println(coffee+" = "+"Instant has been ordered");
		System.out.println("--------------------------------------------------");
		addMore();
		amt = coffee * 35;
		System.out.println("Instant Coffee"+"	 "+"( "+coffee+" )"+"		"+"Rs. "+amt);
		break;
	case 4:
		System.out.println("Enter how many Sugar Free Coffee's needed : ");
		coffee=scan.nextInt();
		System.out.println(coffee+" = "+"Sugar Free Coffee has been ordered");
		System.out.println("--------------------------------------------------");
		addMore();
		amt = coffee * 30;
		System.out.println("Sugar Free Coffee"+""+"( "+coffee+" )"+"		"+"Rs. "+amt);
		break;
	case 5:
		System.out.println("Enter how many Cold Coffee's needed : ");
		coffee=scan.nextInt();
		System.out.println(coffee+" = "+"Cold Coffee has been ordered");
		System.out.println("--------------------------------------------------");
		addMore();
		amt = coffee * 80;
		System.out.println("Cold Coffee"+"	 "+"( "+coffee+" )"+"		"+"Rs. "+amt);
		break;
	case 6:
		System.out.println("Your order has been cancelled successfully");
		break;
	}
	}
public void snaksVarieties() {
	int variety;
	System.out.println("===============================");
	System.out.println("Snaks");
	System.out.println("1. Puffs"+"\n"+"2. Biscuits"+"\n"+"3. Cold Drinks"+"\n"+"4.Exit");
	variety = scan.nextInt();
	System.out.println("===============================");
	switch(variety) {
	case 1: 
		System.out.println("Enter No Of Puffs :");
		snaks = scan.nextInt();
		System.out.println(snaks+"Puffs ordered");
		System.out.println("--------------------------------------------------");
		addMore();
		amt = snaks * 15;
		total += amt;
		System.out.println("Puffs"+"		 "+"( "+snaks+" )"+"		"+"Rs. "+amt);
		break;
	case 2:
		System.out.println("Enter No Of Biscuits :");
		snaks = scan.nextInt();
		System.out.println(snaks+"Biscuits ordered");
		System.out.println("--------------------------------------------------");
		addMore();
		amt = snaks * 5;
		total += amt;
		System.out.println("Biscuits"+"	 "+"( "+snaks+" )"+"		"+"Rs. "+amt);
		break;
	case 3:
		System.out.println("Enter No Of Cold Drinks :");
		snaks = scan.nextInt();
		System.out.println(snaks+"Cold Drinks ordered");
		System.out.println("--------------------------------------------------");
		addMore();
		amt = snaks * 27;
		total += amt;
		System.out.println("Cold Drinks"+"	 "+"( "+snaks+" )"+"		"+"Rs. "+amt);
		break;
	case 4:
		System.exit(0);
	}
}
}

