package com.interview.pbms;

import java.awt.Rectangle;
import java.util.Hashtable;

public class InterSectionOfRectangles {

	public static void main(String[] args) {

/*		Rectangle r1= new Rectangle(2, -1, 3, 2);
		Rectangle r2= new Rectangle(3, -2, 3, 2);*/
		
		Rectangle r1= new Rectangle(10, 3, 5, 3);
		Rectangle r2= new Rectangle(11, 1, 6, 3);
		Rectangle r3 = null;
		float xmax = Math.max(r1.x, r2.x);
		float xmax1 = r1.x + r1.width;
		float xmax2 = r2.x + r2.width;
		float xmin = Math.min(xmax1, xmax2);
		if (xmin > xmax) {
			float ymax = Math.max(r1.y, r2.y);
			float ymax1 = r1.y + r1.height;
			float ymax2 = r2.y + r2.height;
			float ymin  = Math.min(ymax1,ymax2);
			if (ymin > ymax) {
				System.out.println("Yes");
				r3 = new Rectangle();
				r3.x = (int)xmax;
				r3.y = (int)ymax;
				r3.width = (int) (xmin - xmax);
				r3.height = (int) (ymin - ymax);
			}
			
		}
		
	}

}
