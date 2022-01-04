package com.greatlearning.service;

public class MergeSort {
	
	void merge(double[] stockPrices, int left, int mid, int right) {
		
		int n1 = mid - left + 1;
		int n2 = right - mid;
		
		//create temporary arrays
		double leftArray[] = new double [n1];
		double rightArray[] = new double [n2];
		
		//copy data to temporary arrays
		for (int i=0; i<n1; ++i) {
			leftArray[i] = stockPrices[left + i];
		}
		for (int j=0; j<n2; ++j) {
			rightArray[j] = stockPrices[mid + 1 + j];
		}
		
		//merge temporary arrays
		//initial indexes of 1st and 2nd sub-arrays
		int i = 0, j = 0;
		
		//initial index of merged sub-array
		int k = left;
		while (i < n1 && j < n2) {
			if (leftArray[i] <= rightArray[j]) {
				stockPrices[k] = leftArray[i];
				i++;
			}
			else {
				stockPrices[k] = rightArray[j];
				j++;
			}
			k++;
		}
		
		//copy remaining elements  of L[] if any
		while (i < n1) {
			stockPrices[k] = leftArray[i];
			i++;
			k++;
		}
	}
	
	//main function that sorts array[left...right] using merge()
	void sort(double[] stockPrices, int left, int right) {
		
		if(left < right) {
			
			//Find the middle point
			int mid = (left+right)/2;
			
			//Sort first and second halves
			sort(stockPrices, left, mid);
			sort(stockPrices, mid+1, right);
			
			//Merge the sorted halves
			merge(stockPrices, left, mid, right);
		}
	}
}
