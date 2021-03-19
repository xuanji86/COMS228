package edu.iastate.cs228.hw1;

import java.util.Comparator;

public class PolarAngleComparator implements Comparator<Point> {

	@Override
	public int compare(Point p1, Point p2) {
		if(p1.compareTo(p2) == 0){
			return 0;// TODO Auto-generated method stub
		}else if(p1.compareTo(p2)<0) {
			return -1;
		}
		return 1;
	}

}
