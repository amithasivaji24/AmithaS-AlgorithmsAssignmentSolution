package com.greatlearning.service;

public class StockTrendSearch {
    static int countOccurrences(boolean[] sharePriceTrack, int n, boolean b)
    {
    	int count = 0;
    	
    	for(int i = 0; i < n; i++) {
    		if(sharePriceTrack[i] == b)
    			count++;
    	}
    	
    	return count;
    	
    }
}
