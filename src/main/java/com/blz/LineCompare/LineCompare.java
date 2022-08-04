package com.blz.LineCompare;

import java.util.Scanner;
import static java.lang.Math.sqrt;

public class LineCompare {
    public static void main(String[] args) {
        System.out.println("welcome to line comparision problem");
        double lineLength = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter The value Of x1 : ");
        double x1 = scanner.nextDouble();
        System.out.print("Enter The value Of x2 : ");
        double x2 = scanner.nextDouble();

        System.out.print("Enter The value Of y1 : ");
        double y1 = scanner.nextDouble();
        System.out.print("Enter The value Of y2 : ");
        double y2 = scanner.nextDouble();
        //Computation
        lineLength = sqrt( (x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        System.out.println(lineLength);

    }
}
