package com.greatlearning.service;

import java.util.Scanner;

public class Stock {

	public void acsendingStocks(double[] stockPrices, int size) {
		// TODO Auto-generated method stub
		MergeSort mergeSort = new MergeSort();
		mergeSort.sort(stockPrices, 0, stockPrices.length - 1);
		System.out.println("Stock prices in ascending order are :");
		for(int i = 0; i < size; i++) {
			System.out.print(stockPrices[i]+" ");
		}
		System.out.println();
	}

	public void risingStocks(boolean[] sharePriceTrack, int size) {
		// TODO Auto-generated method stub
		StockTrendSearch binarySearch = new StockTrendSearch();
		int count = binarySearch.countOccurrences(sharePriceTrack, size, true);
		System.out.println("Total no of companies whose stock price rose today : " +count);
	}

	public void descendingStocks(double[] stockPrices, int size) {
		// TODO Auto-generated method stub
		MergeSort mergeSort = new MergeSort();
		mergeSort.sort(stockPrices, 0, stockPrices.length - 1);
		System.out.println("Stock prices in descending order are :");
		for(int i = size; i > 0; i--) {
			System.out.print(stockPrices[i-1]+" ");
		}
		System.out.println();
	}

	public void decliningStocks(boolean[] sharePriceTrack, int size) {
		// TODO Auto-generated method stub
		StockTrendSearch binarySearch = new StockTrendSearch();
		int count = binarySearch.countOccurrences(sharePriceTrack, size, false);
		System.out.println("Total no of companies whose stock price declined today : "+count);
	}

	public void searchStock(double[] stockPrices, int size) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the key value");
		double value = sc.nextDouble();
		
		StockSearch searchStock = new StockSearch();
		int count = searchStock.countOccurrences(stockPrices, size, value);
		
		if(count>0) {
		System.out.println("Stock of value "+value+" is present ");
		}
		else {
			System.out.println("Value not found");
		}
	}

}
