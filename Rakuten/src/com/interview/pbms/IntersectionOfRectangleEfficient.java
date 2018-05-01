package com.interview.pbms;
class Point {
	int x;
	int y;
	Point(int x,int y){
		this.x=x;
		this.y=y;
	}
}
public class IntersectionOfRectangleEfficient {

	static boolean find () {
		Point l1,r1,l2,r2;
		l1 = new Point(10,3);
		r1 = new Point(15,0);
		l2 = new Point(11,1);
		r2 = new Point(17,-2);
		if (l1.x > r2.x || l2.x > r1.x) {
			return false;
		}
		if (l1.y < r2.y || l2.y < r2.y) {
			return false;
		}
		
		return true;
	}
	public static void main(String[] args) {
		System.out.println(find());	
	}

}
