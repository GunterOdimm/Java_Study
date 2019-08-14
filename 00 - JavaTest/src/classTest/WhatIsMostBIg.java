package classTest;

public class WhatIsMostBIg {
	public static void main(String[] args) {
		int[] Price = {38000,20000,17900,17900};
		int[] Qty = {6,4,3,5};
		
		int max=0;
		
		for(int i=0;i<Price.length; i++) {
			int Tmp = Price[i] * Qty[i];
			
			if(Tmp > max) {
				max = Tmp;
			}
		}
		System.out.println("가장 높은 상품금액"+max+"원");
	}

}
