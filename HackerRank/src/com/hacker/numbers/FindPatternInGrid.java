package com.hacker.numbers;

import java.util.Scanner;

public class FindPatternInGrid {
	
	static String gridSearch(String[] G, String[] P) {
        // Complete this function
		for (int i=0; i < G.length; i++) {
			char [] gridRow = G[i].toCharArray();
			for(int j=0; j < gridRow.length; j++) {
				
			}
		}
		return null;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int R = in.nextInt();
            int C = in.nextInt();
            String[] G = new String[R];
            for(int G_i = 0; G_i < R; G_i++){
                G[G_i] = in.next();
            }
            int r = in.nextInt();
            int c = in.nextInt();
            String[] P = new String[r];
            for(int P_i = 0; P_i < r; P_i++){
                P[P_i] = in.next();
            }
            String result = gridSearch(G, P);
            System.out.println(result);
        }
        in.close();
    }
}
