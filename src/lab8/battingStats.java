package lab8;

import java.util.Scanner;

public class battingStats {

	public static void main(String[] args) {
		// scanner and header
Scanner input = new Scanner(System.in);
System.out.println("Welcome to Batting Average Calculator! ");
	
	String choice = ""; 
	double batAvg = 0;
	double slugPer;
	int bases;
	int totalBases = 0;
	//int [] hits;
	
	
	System.out.println("Enter number of times at bat: ");
	int bats = input.nextInt();
	System.out.println();
	
	int [] atBat = new int [bats];
	
	
	System.out.println("0=Out, 1=single, 2=double, 3=triple, 4=homerun");
	for (int i = 1; i<=bats; i++){ 
		System.out.printf("Results for at-bat " + i + ":");
		bases = input.nextInt()-1; 
		 totalBases = (bases * i);
		int hits = atBat.length;
		
		batAvg = (bats/hits);
	
	}
	//System.out.println(batAvg);
	System.out.println(totalBases);
	}

	
	}
	


