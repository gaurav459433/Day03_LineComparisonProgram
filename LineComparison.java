package com.bridgelabz.assignmentsrfp259.day03.linecomparison;

import java.util.Scanner;

public class LineComparison {
    public static void main(String[] args) {
        System.out.println("Welcome To Line Comparison Program");
       LineComparison lc = new LineComparison();
       lc.calculateLenght();
    }

    public void calculateLenght() {
        double x1, y1, x2, y2, x3, y3, x4, y4;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Value Of x1:");
        x1 = sc.nextDouble();

        System.out.println("Enter The Value Of y1:");
        y1 = sc.nextDouble();

        System.out.println("Enter The Value Of x2:");
        x2 = sc.nextDouble();

        System.out.println("Enter The Value Of y2:");
        y2 = sc.nextDouble();

        double lengthOfLine1 = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        System.out.println("Length Of Line1 Is :" + lengthOfLine1);

        System.out.println("Enter The Number x3 : ");
        x3 = sc.nextDouble();
        System.out.println("Enter The Number y3 : ");
        y3 = sc.nextDouble();
        System.out.println("Enter The Number x4 : ");
        x4 = sc.nextDouble();
        System.out.println("Enter The Number y4 : ");
        y4 = sc.nextDouble();
        Double lengthOfLine2 = Math.sqrt((x4 - x3) * (x4 - x3) + (y4 - y3) * (y4 - y3));

        System.out.println("Length of Line2 is : " + lengthOfLine2);
        System.out.println();

        if (lengthOfLine1 == lengthOfLine2) {
            System.out.println("Length Of Both Line Are Equal:");
        } else if (lengthOfLine1 > lengthOfLine2) {
            System.out.println("Length Of Line1 is Greater Then Line2:");
        } else {
            System.out.println("Length of Line1 is Less Then Line2:");
        }
    }
}
