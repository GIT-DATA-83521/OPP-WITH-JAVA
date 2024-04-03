/*Q2. Create a class Point2D , in package - "com.app.geometry" : for representing a point in x-y co-
ordinate system. Create a parameterized constructor to init x & y co-ords. Add a method to return
string form of point's x & y co-ords
Hint : public String getDetails())
Add isEqual method to Point2D class :a boolean returning method : must return true if n only if
both points are having same x,y co-ords or false otherwise.
Add calculateDistance method to calculate distance between current point and specified point &
return the distance to the caller.
Hint : Use distance formula . Use java.lang.Math class methods --sqrt, pow etc.
Write TestPoint class , in package "tester" , with a main method, Accept co ordinates of 2 points
from user (Scanner) --to create 2 points (p1 & p2)
Use getDetails method to display point details.(p1's details & p2's details)
Invoke isEqual & display if points are same or different (i.e p1 & p2 are located at the same
position)
If they are not located at the same position , display distance between p1 & p2*/

package com.app.geometry;

public class Point2D {

	private int xaxis;
	private int yaxis;

	// parameterized constructor
	public Point2D(int xaxis, int yaxis) {
		super();
		this.xaxis = xaxis;
		this.yaxis = yaxis;

	}

	public void display() {
		System.out.println("the value of X-axis : " + xaxis);
		System.out.println("the value of Y-axis : " + yaxis);

	}

	public String getDetails() {
		String result;
		result = "(" + xaxis + "," + yaxis + ")";
		return result;
	}

	public boolean isEqual(Point2D p2) {
		
		if((this.xaxis==p2.xaxis) && (this.yaxis==p2.yaxis))
			return true;
		else 
			return true;
	}
	public void calculateDistance(Point2D p2) {
		 double distance=Math.sqrt(Math.pow(( p2.xaxis-this.xaxis),2)+Math.pow(( p2.yaxis-this.yaxis),2));
		   System.out.println("distance between points : "+"("+this.xaxis+","+this.yaxis+")"+"  and "+"("+p2.xaxis+","+p2.yaxis+")"+" = "+distance);
	}
}
