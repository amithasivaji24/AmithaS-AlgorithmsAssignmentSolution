package com.greatlearning.service;

public class StockSearch {
	static int binarySearch(double[] stockPrices, int l, int r, double value)
	{
		if (r < l)
			return -1;
		
		int mid = l + (r - l) / 2;
		
		if (stockPrices[mid] == value)
			return mid;
		
		if (stockPrices[mid] > value)
			return binarySearch(stockPrices, l, mid - 1, value);
		
		return binarySearch(stockPrices, mid + 1, r, value);
		
	}
	static int countOccurrences(double[] stockPrices, int n, double value)
	{
		int ind = binarySearch(stockPrices, 0, n - 1, value);
		
		if (ind == -1)
			return 0;
		
		int count = 1;
		int left = ind - 1;
		
		while (left >= 0 && stockPrices[left] == value)
		{
			count++;
			left--;
			
		}
		
		int right = ind + 1;
		
		while (right < n && stockPrices[right] == value)
		{
			count++;
			right++;
			
		}
		
		return count;
		
	}

}
