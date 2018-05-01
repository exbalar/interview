package com.interview.pgms;

import java.util.Scanner;

public class CalculatetheDistanceBetweenTwoPoints {

	public  static double calculateTheavgDist() {
        int x1,x2,y1,y2,x3,y3;
	    
        double dis1,dis2,dis3;

    Scanner sc=new Scanner(System.in);

    System.out.println("enter x1 point");
   
        x1=sc.nextInt();

        System.out.println("enter y1 point");
   
        y1=sc.nextInt();

    System.out.println("enter x2point");
   
        x2=sc.nextInt();

    System.out.println("enter y2 point");
   
        y2=sc.nextInt();  
        
	    System.out.println("enter x3point");
		   
        x3=sc.nextInt();

    System.out.println("enter y3 point");
   
        y3=sc.nextInt(); 
	 
        dis1=CalculatetheDistanceBetweenTwoPoints.calDis(x1,y1,x2,y2);
        dis2=CalculatetheDistanceBetweenTwoPoints.calDis(x2,y2,x3,y3);
        dis3=CalculatetheDistanceBetweenTwoPoints.calDis(x3,y3,x1,y1);
        
        return (dis1+dis2+dis3)/3;
	}
	public static void main(String args[])
	
	{
	
		calculateTheavgDist();
 
	}
	
	static double calDis(int x1,int y1,int x2,int y2)
	{
	    return (Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1)));
	}

}


