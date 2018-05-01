package com.interview.pbms;

public class AlphaGame {

	static int calculate (int t1, int t2, int x, int y) {
		int counter =1;
		boolean isOver = false;
		int t1count = t1;
		int t2count = t2;
		//boolean whiteFlag =false;
		//boolean blackFlag =false;
		while (!isOver) {
			int greenBall = counter%(x*y);
			int whiteBall = counter%x;
			int blackBall = counter%y;
			if (greenBall == 0) {
				counter++;
				continue;
			}
				
			if (whiteBall == 0 /*&& t1count > 0*/) {
				//whiteFlag = true;
				t1count--;
			}else if (blackBall == 0 /*&& t2count > 0*/) {
				//blackFlag = true;
				t2count--;
			}else {
				//if (t1count > 0) {
					t1count--;
				//}
				//if (t2count > 0) {
					t2count--;
				//}
			}
			if (/*whiteFlag && blackFlag &&*/ t1count <= 0  && t2count <= 0 ) {
				isOver = true;
				break;
			}
			counter++;
		}
		return counter;
	}
	public static void main(String[] args) {
		System.out.println(calculate(1500000000,1200000000,51,43));
	}

}
