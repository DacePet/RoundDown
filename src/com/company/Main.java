package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner inpu = new Scanner(System.in);
	System.out.println("Please enter number with comma");
	double number=inpu.nextDouble();
	int digit=(int) number;
	System.out.println("number" +digit);

    }
}
