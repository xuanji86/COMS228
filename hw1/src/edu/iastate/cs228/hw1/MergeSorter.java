package edu.iastate.cs228.hw1;

import java.io.FileNotFoundException;
import java.lang.NumberFormatException; 
import java.lang.IllegalArgumentException; 
import java.util.InputMismatchException;

/**
 *  
 * @author
 *
 */

/**
 * 
 * This class implements the mergesort algorithm.   
 *
 */

public class MergeSorter extends AbstractSorter
{
	// Other private instance variables if you need ... 
	
	/** 
	 * Constructor takes an array of points.  It invokes the superclass constructor, and also 
	 * set the instance variables algorithm in the superclass.
	 *  
	 * @param pts   input array of integers
	 */
	public MergeSorter(Point[] pts) 
	{
		super(pts);
		algorithm = "Merge Sort";// TODO  
	}


	/**
	 * Perform mergesort on the array points[] of the parent class AbstractSorter. 
	 * 
	 */
	@Override 
	public void sort()
	{
		mergeSortRec(points);// TODO 
	}

	
	/**
	 * This is a recursive method that carries out mergesort on an array pts[] of points. One 
	 * way is to make copies of the two halves of pts[], recursively call mergeSort on them, 
	 * and merge the two sorted subarrays into pts[].   
	 * 
	 * @param pts	point array 
	 */
	private void mergeSortRec(Point[] pts)
	{
		if (pts.length <= 1) {
			return;
		}
		int mid = pts.length / 2;
		Point[] left = new Point[mid];
		Point[] right = new Point[pts.length - mid];
		int i = 0;
		for (int j = 0; j < left.length; j++) {
			left[j] = pts[i++];
		}
		for (int j = 0; j < right.length; j++) {
			right[j] = pts[i++];
		}
		mergeSortRec(left);
		mergeSortRec(right);
		merge(pts, left, right);
	}

	
	private void merge(Point[] arr, Point[] left, Point[] right) {
		int l = 0, r = 0, i = 0;
		while (l < left.length && r < right.length) {
			if (pointComparator.compare(left[l], right[r]) < 0) {
				arr[i++] = left[l++];
			}
			else {
				arr[i++] = right[r++];
			}
		}
		while (l < left.length) {
			arr[i++] = left[l++];
		}
		while (r < right.length) {
			arr[i++] = right[r++];
		}
	}

}
