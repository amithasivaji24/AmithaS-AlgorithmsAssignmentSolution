package com.greatlearning.driver;

import java.util.Scanner;

import com.greatlearning.service.Stock;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the no of companies");
		int noOfCompanies = sc.nextInt();
		double[] stockPrices = new double[noOfCompanies];
		boolean[] sharePriceTrack = new boolean[noOfCompanies];
		for(int i =0; i< noOfCompanies; i++) {
			System.out.println("Enter current stock price of the company " + (i+1));
			stockPrices[i] = sc.nextDouble();
			
			System.out.println("Whether company's stock price rose today compare to yesterday?");
			sharePriceTrack[i] = sc.nextBoolean();
		}
		
		Stock stock = new Stock();
		int option;
		
		do {
		System.out.println("-----------------------------------------------");
		System.out.println("Enter the operation that you want to perform");
		System.out.println("1. Display the companies stock prices in ascending order");
		System.out.println("2. Display the companies stock prices in descending order");
		System.out.println("3. Display the total no of companies for which stock prices rose today");
		System.out.println("4. Display the total no of companies for which stock prices declined today");
		System.out.println("5. Search a specific stock price");
		System.out.println("6. press 0 to exit");
		System.out.println("-----------------------------------------------");
		
		option = sc.nextInt();
		
		switch(option) {
		case 1:
			stock.acsendingStocks(stockPrices, noOfCompanies);
			break;
		case 2:
			stock.descendingStocks(stockPrices, noOfCompanies);
			break;
		case 3:
			stock.risingStocks(sharePriceTrack, noOfCompanies);
			break;
		case 4:
			stock.decliningStocks(sharePriceTrack, noOfCompanies);
			break;
		case 5:
			stock.searchStock(stockPrices, noOfCompanies);
			break;
		case 0:
			System.out.println("Exited successfully");
			break;
		default:
			System.out.println("Invalid option. Enter between 0-5");
			break;
		}
		}
		while (option != 0);
		
	}

}
