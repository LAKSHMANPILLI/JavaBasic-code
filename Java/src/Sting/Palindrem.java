package Sting;

import java.util.Scanner;

public class Palindrem {
	public static void main(String[] args) {
		
	String s="malayalam";

		int i=0,j=s.length()-1;
		while(i<j)//0<5//1<5
		{
			if(s.charAt(i)!=s.charAt(j))//negative values avoid like -1,-2,-3,.....etc;
			{
			System.out.println(" is not a palindrom");
				
			
			i++;
			j--;
			}
		}
		
	System.out.println(" is a palindrom");
	}
	
}

